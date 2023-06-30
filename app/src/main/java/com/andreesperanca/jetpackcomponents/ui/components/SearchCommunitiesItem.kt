package com.andreesperanca.jetpackcomponents.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andreesperanca.jetpackcomponents.highLightGroups
import com.andreesperanca.jetpackcomponents.ui.theme.JetpackComponentsTheme


@Composable
fun SearchCommunitiesItem(image: Int, name: String) {
    Column(
        Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp),
            painter = painterResource(id = image),
            contentDescription = "Description",
            contentScale = ContentScale.Crop
        )
        Text(fontSize = 15.sp, text = name)
        Text(text = name)
    }
}


@Preview
@Composable
fun PreviewSearchCommunitiesItem() {
    JetpackComponentsTheme() {
        SearchCommunitiesItem(
            image = highLightGroups[0].image, name = highLightGroups[0].name
        )
    }
}
