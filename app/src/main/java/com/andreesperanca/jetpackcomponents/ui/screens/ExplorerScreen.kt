package com.andreesperanca.jetpackcomponents.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andreesperanca.jetpackcomponents.R
import com.andreesperanca.jetpackcomponents.ui.components.SearchViewSocrates
import com.andreesperanca.jetpackcomponents.ui.theme.JetpackComponentsTheme

@Composable
fun ExplorerScreen() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary)
    ) {
        Image(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(end = 16.dp, top = 16.dp)
                .size(height = 48.dp, width = 48.dp),
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "User Image"
        )

        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 16.dp, top = 32.dp, end = 16.dp)
        ) {
            Text(
                text = "Olá,\nAndré Esperança",
                color = Color.White,
                fontSize = 25.sp
            )

            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = "Encontre comunidades e pessoas\nque te ajudam a ir além",
                color = Color.White,
                fontSize = 13.sp
            )
            SearchViewSocrates(modifier = Modifier)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewExplorerScreen() {
    JetpackComponentsTheme() {
        ExplorerScreen()
    }
}