package com.dungltcn272.note.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dungltcn272.note.ui.theme.BabyBlue
import com.dungltcn272.note.ui.theme.LightGreen
import com.dungltcn272.note.ui.theme.RedOrange
import com.dungltcn272.note.ui.theme.RedPink
import com.dungltcn272.note.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String) : Exception(message)
