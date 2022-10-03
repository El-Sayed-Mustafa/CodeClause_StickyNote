package com.plcoding.cleanarchitecturenoteapp.feature_note.domin.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domin.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domin.repository.NoteRepo
import com.plcoding.cleanarchitecturenoteapp.feature_note.domin.util.NoteOrder
import com.plcoding.cleanarchitecturenoteapp.feature_note.domin.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNotes(private val repo: NoteRepo) {

    operator fun invoke(
        noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending)
    ): Flow<List<Note>> {
        return repo.getNotes().map { note ->
            when(noteOrder.orderType){
                is OrderType.Ascending->{
                    when(noteOrder){
                        is NoteOrder.Title -> note.sortedBy { it.title.lowercase() }
                        is NoteOrder.Date -> note.sortedBy { it.timestamp }
                        is NoteOrder.Color -> note.sortedBy { it.color }

                    }
                }
                is OrderType.Descending->{
                    when(noteOrder){
                        is NoteOrder.Title -> note.sortedByDescending { it.title.lowercase() }
                        is NoteOrder.Date -> note.sortedByDescending { it.timestamp }
                        is NoteOrder.Color -> note.sortedByDescending { it.color }

                    }
                }
            }

        }
    }
}