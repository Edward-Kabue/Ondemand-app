package com.ist.ondemand.common


import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ist.ondemand.presentation.MainViewModel
import com.ist.ondemand.presentation.OptionsViewModel
import com.ist.ondemand.presentation.common.NotificationMessage
import com.ist.ondemand.presentation.screens.auth.LoginScreen
import com.ist.ondemand.presentation.screens.auth.SignUpOptionsScreen
import com.ist.ondemand.presentation.screens.auth.SignupScreen
import com.ist.ondemand.presentation.screens.main.MyServicesScreen
import com.ist.ondemand.presentation.screens.main.SearchScreen
import com.ist.ondemand.presentation.screens.main.ServiceScreen

@Composable
fun DemandApp() {
    val vm: MainViewModel = hiltViewModel()
    val navController = rememberNavController()
    NotificationMessage(vm = vm)
    NavHost(navController = navController, startDestination = Routes.Signup.route) {
        composable(Routes.Option.route) {
            SignUpOptionsScreen()
        }
        composable(Routes.Signup.route) {
            SignupScreen(navController = navController, vm = vm)
        }
        composable(Routes.Login.route) {
            LoginScreen(navController = navController, vm = vm)
        }
        composable(Routes.Services.route) {
            ServiceScreen(navController = navController, vm = vm)
        }
        composable(Routes.Search.route) {
            SearchScreen(navController = navController, vm = vm)
        }
        composable(Routes.MyServices.route) {
            MyServicesScreen(navController = navController, vm = vm)
        }

    }
}