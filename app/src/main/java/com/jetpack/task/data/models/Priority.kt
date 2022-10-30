package com.jetpack.task.data.models


import androidx.compose.ui.graphics.Color
import com.jetpack.task.ui.theme.HighPriorityColor
import com.jetpack.task.ui.theme.LowPriorityColor
import com.jetpack.task.ui.theme.MediumPriorityColor
import com.jetpack.task.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}