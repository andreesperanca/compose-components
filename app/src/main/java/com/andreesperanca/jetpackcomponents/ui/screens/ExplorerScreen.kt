package com.andreesperanca.jetpackcomponents.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.andreesperanca.jetpackcomponents.HighlightGroup
import com.andreesperanca.jetpackcomponents.R
import com.andreesperanca.jetpackcomponents.highLightGroups
import com.andreesperanca.jetpackcomponents.ui.components.CommunityItem
import com.andreesperanca.jetpackcomponents.ui.components.HighlightCommunityItem
import com.andreesperanca.jetpackcomponents.ui.components.SearchViewSocrates
import com.andreesperanca.jetpackcomponents.ui.theme.JetpackComponentsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExplorerScreen(
    modifier: Modifier = Modifier,
    highlightGroups: List<HighlightGroup>
) {
        Column(
            modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
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
                        .clip(CircleShape),
                    painter = painterResource(id = R.drawable.ic_launcher_background),
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
                text = "Comunidade destaque",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )

            HighlightCommunityItem(image = highlightGroups[0].image, name = highlightGroups[0].name)

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
                    CommunityItem(image = it.image, name = it.name, modifier = Modifier, description = "asdasd")
                }
            }

            Text(
                modifier = Modifier
                    .padding(start = 8.dp, top = 16.dp, bottom = 4.dp),
                text = "Comunidades recomendadas",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )

            LazyRow(modifier = Modifier.padding(bottom = 16.dp)) {
                items(highlightGroups) {
                    CommunityItem(image = it.image, name = it.name, modifier = Modifier, description = "sdaidsad")
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