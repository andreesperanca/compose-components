package com.andreesperanca.jetpackcomponents.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.andreesperanca.jetpackcomponents.ui.theme.JetpackComponentsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchViewSocrates(modifier: Modifier = Modifier) {
    val text = remember { mutableStateOf("") }
    text.value

    OutlinedTextField(
        modifier = modifier
            .padding(start = 8.dp, end = 8.dp, top = 32.dp, bottom = 32.dp)
            .fillMaxWidth(),
        value = text.value,
        onValueChange = { text.value = "sad" },
        placeholder = { Text(text = "Olá, pesquise aqui", color = androidx.compose.ui.graphics.Color.Gray) },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = "")
        },
        shape = ShapeDefaults.Large,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = androidx.compose.ui.graphics.Color.White,
            textColor = androidx.compose.ui.graphics.Color.Black
        ),
        maxLines = 1
    )
}

@Composable
@Preview(showBackground = true)
fun SearchViewPreview() {
    JetpackComponentsTheme() {
        SearchViewSocrates()
    }
}