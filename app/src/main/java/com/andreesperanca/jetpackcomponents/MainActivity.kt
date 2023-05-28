package com.andreesperanca.jetpackcomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.andreesperanca.jetpackcomponents.ui.screens.ExplorerScreen
import com.andreesperanca.jetpackcomponents.ui.screens.MainScreen
import com.andreesperanca.jetpackcomponents.ui.theme.JetpackComponentsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComponentsTheme {
                MainScreen()
            }
        }
    }
}