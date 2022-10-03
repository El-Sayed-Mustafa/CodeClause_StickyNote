package com.plcoding.cleanarchitecturenoteapp.feature_note.presentaion.notes

import androidx.lifecycle.ViewModel
import com.plcoding.cleanarchitecturenoteapp.feature_note.domin.use_case.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NotesVM @Inject constructor(
    private val noteUseCases: NoteUseCases
) :ViewModel(){


}