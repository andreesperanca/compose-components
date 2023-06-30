package com.andreesperanca.jetpackcomponents.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andreesperanca.jetpackcomponents.R

@Composable
fun CommunityItem(modifier: Modifier = Modifier, image: Int, name: String, description: String) {
    Column(
        modifier
            .width(220.dp)
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp),
            painter = painterResource(id = image),
            contentDescription = "ImageDescription",
            contentScale = ContentScale.Crop
        )
        Text(
            modifier = Modifier.padding(top = 4.dp),
            text = name, color = Color(0xFF424242), fontSize = 18.sp)
        Text(
            modifier = Modifier.padding(bottom = 4.dp),
            text = description, color = Color(0xFF818685), fontSize = 15.sp)
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewCommunityItem() {
    val image = R.drawable.gray_background

    CommunityItem(modifier = Modifier, image = image, name = "Ola", "Descrição")


}