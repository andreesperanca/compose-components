package com.andreesperanca.jetpackcomponents.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.andreesperanca.jetpackcomponents.R

@Composable
fun HighlightCommunityItem(image: Int, name: String) {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(horizontal = 16.dp),
        painter = painterResource(id = image),
        contentDescription = "ImageDescription",
        contentScale = ContentScale.Crop
    )
}

@Composable
@Preview(showBackground = true)
fun PreviewHighlightCommunityItem() {
    val image = R.drawable.gray_background

    HighlightCommunityItem(image = image, name = "Ola")


}