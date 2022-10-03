package com.plcoding.cleanarchitecturenoteapp.feature_note.presentaion.notes

import com.plcoding.cleanarchitecturenoteapp.feature_note.domin.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domin.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
