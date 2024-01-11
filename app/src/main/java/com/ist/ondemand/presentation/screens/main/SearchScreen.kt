package com.ist.ondemand.presentation.screens.main

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.ist.ondemand.presentation.MainViewModel

@Composable
fun SearchScreen(navController: NavController, vm: MainViewModel) {
  Text(text = "Search Screen")
  BottomNavigationMenu(selectedItem = BottomNavigationItem.SEARCH, navController = navController)
}