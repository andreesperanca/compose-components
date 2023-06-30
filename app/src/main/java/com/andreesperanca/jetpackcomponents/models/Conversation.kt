package com.andreesperanca.jetpackcomponents.models

import androidx.annotation.DrawableRes

data class Conversation(
    val userName: String,
    val lastMessage: String,
    val lastMessageTime: String,
    @DrawableRes val userPhoto: Int
)
