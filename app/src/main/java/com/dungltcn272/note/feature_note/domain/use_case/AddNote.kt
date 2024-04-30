package com.dungltcn272.note.feature_note.domain.use_case

import com.dungltcn272.note.feature_note.domain.model.InvalidNoteException
import com.dungltcn272.note.feature_note.domain.model.Note
import com.dungltcn272.note.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("The title can't be empty.")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("The content can't be empty.")
        }
        repository.insertNote(note)
    }
}