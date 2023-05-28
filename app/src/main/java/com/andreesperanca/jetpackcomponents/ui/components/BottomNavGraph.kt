package com.andreesperanca.jetpackcomponents.ui.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.andreesperanca.jetpackcomponents.highLightGroups
import com.andreesperanca.jetpackcomponents.ui.screens.ExplorerScreen
import com.andreesperanca.jetpackcomponents.ui.screens.ProfileScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController = navController,
        startDestination = BottomBarScreen.Explorer.route
    ) {
        composable(route = BottomBarScreen.Explorer.route) {
            ExplorerScreen(highlightGroups = highLightGroups)
        }

        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
    }
}