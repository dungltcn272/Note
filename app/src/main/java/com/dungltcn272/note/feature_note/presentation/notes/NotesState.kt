package com.dungltcn272.note.feature_note.presentation.notes

import com.dungltcn272.note.feature_note.domain.model.Note
import com.dungltcn272.note.feature_note.domain.util.NoteOrder
import com.dungltcn272.note.feature_note.domain.util.OrderType

data class NotesState(
    var notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible : Boolean = false
)