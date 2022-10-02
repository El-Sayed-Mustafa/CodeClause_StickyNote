package com.plcoding.cleanarchitecturenoteapp.feature_note.data.repository

import android.os.Parcel
import android.os.Parcelable
import com.plcoding.cleanarchitecturenoteapp.feature_note.data.data_source.NoteDao
import com.plcoding.cleanarchitecturenoteapp.feature_note.domin.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domin.repository.NoteRepo
import kotlinx.coroutines.flow.Flow

class NoteRepoImp(private val Dao:NoteDao) :NoteRepo {
    override fun getNotes(): Flow<List<Note>> {

        return Dao.getNotes()
    }

    override suspend fun getNoteByID(id: Int): Note? {
        return Dao.getNoteByID(id)
    }

    override suspend fun insertNote(note: Note) {
        return Dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return Dao.deleteNote(note)
    }

}