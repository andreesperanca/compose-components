package com.andreesperanca.jetpackcomponents.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andreesperanca.jetpackcomponents.R
import com.andreesperanca.jetpackcomponents.ui.theme.JetpackComponentsTheme

@Composable
fun ConversationItem(
    userName: String,
    lastMessage: String,
    lastMessageTime: String,
    userPhoto: Int
) {

     Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(modifier = Modifier)
        {
            Image(
                modifier = Modifier
                    .padding(8.dp)
                    .size(height = 48.dp, width = 48.dp)
                    .clip(CircleShape)
                    .border(width = 1.dp, color = Color(0xFFD4AF37), shape = CircleShape)
                ,
                painter = painterResource(id = userPhoto),
                contentDescription = "User Image",
            )

            Column(
                modifier = Modifier
                    .padding(8.dp)
            ) {
                Text(
                    text = userName,
                    fontSize = 16.sp
                )

                Text(
                    text = lastMessage,
                    color = Color(0xFF818685),
                    fontSize = 14.sp
                )
            }
        }
        Text(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(8.dp),
            text = lastMessageTime,
            color = Color(0xFF818685),
            fontSize = 10.sp
        )

        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewConversationItem() {
    JetpackComponentsTheme {
        ConversationItem(
            userName = "André Esperança",
            lastMessage = "Olá, bom dia",
            lastMessageTime = "2 horas atrás",
            userPhoto = R.drawable.ic_launcher_background
        )
    }
}