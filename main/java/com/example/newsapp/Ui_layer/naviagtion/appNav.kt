package com.example.newsapp.Ui_layer.naviagtion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.newsapp.Ui_layer.screens.HomeScreenUI
import com.example.newsapp.Ui_layer.screens.NewsViewModel
import com.example.newsapp.Ui_layer.screens.SpecificNewsScreenUI


@Composable
fun AppNavigation(modifier: androidx.compose.ui.Modifier, viewModel: NewsViewModel) {

    val navController = rememberNavController()

   NavHost(navController = navController, startDestination = HomeScreen) {

      composable<HomeScreen> {
         HomeScreenUI(viewModel, navController = navController)
      }

      composable<NewsUi> {
         SpecificNewsScreenUI(viewModel, navController = navController)
      }

   }
}