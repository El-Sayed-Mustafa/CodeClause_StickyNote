package com.plcoding.cleanarchitecturenoteapp.feature_note.domin.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domin.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domin.repository.NoteRepo

class DeleteNote (private val repo: NoteRepo){
    suspend operator fun invoke(note: Note){
        return repo.deleteNote(note)
    }
}