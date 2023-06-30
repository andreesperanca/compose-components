package com.andreesperanca.jetpackcomponents.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Explorer: BottomBarScreen(
        route = "explorer",
        title = "Explorer",
        icon = Icons.Default.Home
    )
    object Profile: BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Person
    )

    object Message: BottomBarScreen(
        route = "message",
        title = "Message",
        icon = Icons.Default.Info
    )

}
