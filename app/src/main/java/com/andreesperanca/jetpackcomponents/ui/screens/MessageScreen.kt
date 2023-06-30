package com.andreesperanca.jetpackcomponents.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.andreesperanca.jetpackcomponents.conversations
import com.andreesperanca.jetpackcomponents.ui.components.ConversationItem
import com.andreesperanca.jetpackcomponents.ui.theme.JetpackComponentsTheme


@Composable
fun MessageScreen() {
    LazyColumn() {
        items(conversations) {
            ConversationItem(
                userName = it.userName,
                lastMessage = it.lastMessage,
                lastMessageTime = it.lastMessageTime,
                userPhoto = it.userPhoto
            )
        }
    }
}


@Preview
@Composable
fun PreviewMessageScreen() {
    JetpackComponentsTheme() {
        MessageScreen()
    }
}
