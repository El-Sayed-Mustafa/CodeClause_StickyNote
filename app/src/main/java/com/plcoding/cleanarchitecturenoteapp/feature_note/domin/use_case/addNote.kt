package com.plcoding.cleanarchitecturenoteapp.feature_note.domin.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domin.model.InvalidException
import com.plcoding.cleanarchitecturenoteapp.feature_note.domin.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domin.repository.NoteRepo

class addNote (private val repo: NoteRepo){

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