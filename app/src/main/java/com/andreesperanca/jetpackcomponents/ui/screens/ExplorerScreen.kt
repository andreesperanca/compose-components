package com.andreesperanca.jetpackcomponents.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andreesperanca.jetpackcomponents.HighlightGroup
import com.andreesperanca.jetpackcomponents.R
import com.andreesperanca.jetpackcomponents.highLightGroups
import com.andreesperanca.jetpackcomponents.ui.components.HighlightCommunityItem
import com.andreesperanca.jetpackcomponents.ui.components.SearchViewSocrates
import com.andreesperanca.jetpackcomponents.ui.theme.JetpackComponentsTheme

@Composable
fun ExplorerScreen(
    modifier: Modifier = Modifier,
    highlightGroups: List<HighlightGroup>

) {

    Column(
        modifier
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primary)
        ) {
            Image(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(end = 16.dp, top = 16.dp)
                    .size(height = 48.dp, width = 48.dp)
                    .clip(CircleShape)
                ,
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "User Image",
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


        Text(
            modifier = Modifier
                .padding(start = 8.dp, top = 16.dp, bottom = 4.dp),
            text = "Grupos famosos",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )

        LazyRow(
            verticalAlignment = Alignment.CenterVertically
        ) {
            items(highlightGroups) {
                HighlightCommunityItem(image = it.image, name = it.name)
            }
        }

        Spacer(modifier = Modifier.size(16.dp))


        Text(
            modifier = Modifier
                .padding(start = 8.dp, top = 16.dp, bottom = 4.dp),
            text = "Grupos oficias",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )

        LazyRow() {
            items(highlightGroups) {
                HighlightCommunityItem(image = it.image, name = it.name)
            }
        }

        Text(
            modifier = Modifier
                .padding(start = 8.dp, top = 16.dp, bottom = 4.dp),
            text = "Grupos recomendados",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )

        LazyRow() {
            items(highlightGroups) {
                HighlightCommunityItem(image = it.image, name = it.name)
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewExplorerScreen() {
    JetpackComponentsTheme() {
        ExplorerScreen(Modifier, highLightGroups)
    }
}