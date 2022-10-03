package com.plcoding.cleanarchitecturenoteapp.feature_note.presentaion.notes

import com.plcoding.cleanarchitecturenoteapp.feature_note.domin.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domin.util.NoteOrder
import com.plcoding.cleanarchitecturenoteapp.feature_note.domin.util.OrderType

data class NotesStata(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible :Boolean = false
)
