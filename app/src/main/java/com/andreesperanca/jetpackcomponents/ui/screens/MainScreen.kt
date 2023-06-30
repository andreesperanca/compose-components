package com.andreesperanca.jetpackcomponents.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.andreesperanca.jetpackcomponents.ui.components.BottomBarScreen
import com.andreesperanca.jetpackcomponents.ui.components.BottomNavGraph

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {

    val navController = rememberNavController()

    Scaffold(bottomBar =
    {
        BottomBar(navController = navController)
    }, content = {
        BottomNavGraph(navController = navController)
    })

}

@Composable
fun BottomBar(navController: NavController) {
    val screens = listOf(
        BottomBarScreen.Explorer,
        BottomBarScreen.Profile,
        BottomBarScreen.Message
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation {
        screens.forEach { screen ->
            AddItem(screen = screen, currentDestination = currentDestination, navController = navController)
        }
    }

}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavController
) {
    BottomNavigationItem(
        modifier = Modifier
            .background(color = MaterialTheme.colorScheme.primary),
        label = { Text(color = Color.White, text = screen.title) },
        icon = {
            val icon = screen.icon
            Icon(imageVector = icon, contentDescription = "Navigation ${screen.title}", tint = Color.White) },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        onClick = {
            navController.navigate(screen.route) {
                popUpToId
                launchSingleTop = true
            }
        },
        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled)
    )
}