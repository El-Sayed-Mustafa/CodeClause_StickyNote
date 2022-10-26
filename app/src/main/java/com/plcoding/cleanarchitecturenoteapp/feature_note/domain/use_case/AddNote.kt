package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.InvalidException
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepo

class AddNote (private val repo: NoteRepo){

    @Throws(InvalidException::class)
    suspend operator fun invoke(note: Note){
        if (note.title.isBlank()){
            throw InvalidException("the title of the note can't be empty.")
        }
        if (note.content.isBlank()){
            throw InvalidException("the content can't be empty.")
        }
        repo.insertNote(note)
    }
}