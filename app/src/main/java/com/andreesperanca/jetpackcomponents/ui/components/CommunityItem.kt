package com.andreesperanca.jetpackcomponents.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.andreesperanca.jetpackcomponents.R

@Composable
fun CommunityItem(modifier: Modifier = Modifier, image: Int, name: String, description: String) {
    Column(
        modifier
            .padding(8.dp)
    ) {
        Image(
            modifier = Modifier
                .width(160.dp)
                .height(90.dp),
            painter = painterResource(id = image),
            contentDescription = "ImageDescription",
            contentScale = ContentScale.Crop
        )
        Text(text = name)
        Text(text = description)
    }
}

@Composable
@Preview
fun PreviewCommunityItem() {
    val image = R.drawable.ic_launcher_foreground

    CommunityItem(modifier = Modifier, image = image, name = "Ola", "Descrição")


}