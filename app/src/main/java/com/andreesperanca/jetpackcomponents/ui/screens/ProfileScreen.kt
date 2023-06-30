@file:OptIn(ExperimentalMaterial3Api::class)

package com.andreesperanca.jetpackcomponents.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andreesperanca.jetpackcomponents.R
import com.andreesperanca.jetpackcomponents.ui.components.ProfileBox
import com.andreesperanca.jetpackcomponents.ui.theme.JetpackComponentsTheme

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Perfil",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Localized description"
                        )
                    }
                }
            )
        },

        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier
                        .padding(end = 16.dp, top = 16.dp)
                        .size(height = 150.dp, width = 150.dp)
                        .clip(CircleShape),
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "User Image"
                )

                Text(
                    modifier = Modifier
                        .padding(8.dp),
                    fontSize = 18.sp,
                    text = "André Esperança"
                )

                Text(
                    modifier = Modifier
                        .padding(8.dp),
                    fontSize = 12.sp,
                    text = "André é uma pessoa com muitas qualidades positivas. Ele é amigável, comunicativo e tem uma personalidade agradável, que faz com que as pessoas ao seu redor se sintam confortáveis e bem-vindas. Ele é uma pessoa que se importa com os outros e sempre está pronto para ajudar quando alguém precisa."
                )


                Row(modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .border(BorderStroke(1.dp, Color.LightGray))
                    .wrapContentWidth(align = Alignment.CenterHorizontally)
                    .padding(all = 16.dp)
                ) {
                    ProfileBox(title = "Wallet", value = "100")
                    ProfileBox(title = "Follow", value = "100")
                    ProfileBox(title = "Followers", value = "100")
                }
            }
        }
    )
}

@Preview
@Composable
fun PreviewProfileScreen() {
    JetpackComponentsTheme {
        ProfileScreen()
    }
}