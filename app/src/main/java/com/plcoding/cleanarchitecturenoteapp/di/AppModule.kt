package com.plcoding.cleanarchitecturenoteapp.di

import android.app.Application
import androidx.room.Room
import com.plcoding.cleanarchitecturenoteapp.feature_note.data.repository.NoteRepoImp
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepo

import com.plcoding.cleanarchitecturenoteapp.feature_note.data.data_source.NoteDB
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app:Application):NoteDB{
        return Room.databaseBuilder(
            app,
            NoteDB::class.java,
            NoteDB.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepo(db:NoteDB):NoteRepo{
        return NoteRepoImp(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repo: NoteRepo):NoteUseCases{
        return NoteUseCases(
            getNotes = GetNotes(repo),
            deleteNote = DeleteNote(repo),
            addNote = AddNote(repo),
            getNote = GetNote(repo)
        )
    }
}