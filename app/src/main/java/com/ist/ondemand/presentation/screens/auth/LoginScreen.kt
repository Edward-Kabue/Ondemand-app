package com.ist.ondemand.presentation.screens.auth

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ist.ondemand.common.Routes
import com.ist.ondemand.presentation.MainViewModel


@Composable
fun LoginScreen(navController: NavController, vm: MainViewModel) {
    Text(text = "Already have an account? Login",
        color = Color.Blue,
        modifier = Modifier
            .padding(8.dp)
            .clickable {
                navController.navigate(Routes.Signup.route)
            })
}