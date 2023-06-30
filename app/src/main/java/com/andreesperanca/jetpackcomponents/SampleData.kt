package com.andreesperanca.jetpackcomponents

import androidx.annotation.DrawableRes
import androidx.compose.ui.res.painterResource
import com.andreesperanca.jetpackcomponents.models.Conversation

data class HighlightGroup(
    @DrawableRes val image: Int,
    val name: String
)

val highLightGroups = listOf(
    HighlightGroup(image = R.drawable.ic_launcher_background, "Xoxo"),
    HighlightGroup(image = R.drawable.ic_launcher_background, "Xoxo"),
    HighlightGroup(image = R.drawable.ic_launcher_background, "Xoxo"),
    HighlightGroup(image = R.drawable.ic_launcher_background, "Xoxo")
)


val conversations = listOf(
    Conversation(
        userName = "André Esperança",
        lastMessage = "Olá bom dia",
        lastMessageTime = "Olá bom dia",
        userPhoto = R.drawable.ic_launcher_background
    ),
    Conversation(
        userName = "André Esperança",
        lastMessage = "Olá bom dia",
        lastMessageTime = "Olá bom dia",
        userPhoto = R.drawable.ic_launcher_background
    ),
    Conversation(
        userName = "André Esperança",
        lastMessage = "Olá bom dia",
        lastMessageTime = "2 horas atrás",
        userPhoto = R.drawable.ic_launcher_background
    )
)



