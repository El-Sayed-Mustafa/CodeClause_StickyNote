package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepo

class DeleteNote (private val repo: NoteRepo){
    suspend operator fun invoke(note: Note){
        return repo.deleteNote(note)
    }
}