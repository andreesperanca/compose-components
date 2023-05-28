package com.andreesperanca.jetpackcomponents.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andreesperanca.jetpackcomponents.ui.theme.JetpackComponentsTheme

@Composable
fun ProfileBox(
    modifier: Modifier = Modifier,
    title: String,
    value: String
) {
    Column(modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            modifier = Modifier.padding(8.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            text = title
        )

        Text(
            modifier = Modifier.padding(8.dp),
            fontSize = 12.sp,
            color = Color.Green,
            text = value)

    }
}


@Composable
@Preview
fun PreviewProfileBox() {
    JetpackComponentsTheme() {
        ProfileBox(
            title = "Carteira",
            value = "100"
        )
    }
}