package com.example.firstlessonapp.navigation.firstAppNavigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun PageNavHost(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = PageScreen.Root.home) {
        composable(PageScreen.Root.home) {
            Root(navController = navController)
        }
        composable(
            PageScreen.FirstScreen.home + "/{name}/{surname}", arguments = listOf(
                navArgument("name") { type = NavType.StringType },
                navArgument("surname") { type = NavType.StringType },))
        { navBackStackEntry ->
            val name = navBackStackEntry.arguments?.getString("name")
            val surname = navBackStackEntry.arguments?.getString("surname")
            FirstScreen(navController = navController, name = name, surname = surname)
        }
        composable(PageScreen.SecondScreen.home) {
            SecondScreen(navController = navController)
        }
    }
}

