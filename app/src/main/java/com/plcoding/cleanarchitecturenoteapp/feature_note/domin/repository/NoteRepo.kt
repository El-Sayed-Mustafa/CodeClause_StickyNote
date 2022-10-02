package com.plcoding.cleanarchitecturenoteapp.feature_note.domin.repository

import com.plcoding.cleanarchitecturenoteapp.feature_note.domin.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepo {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteByID(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)


}