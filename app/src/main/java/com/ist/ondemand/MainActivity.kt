package com.ist.ondemand

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.ist.ondemand.ui.theme.OnDemandTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            OnDemandTheme {
                DemandApp()
            }
        }
    }
}
@Composable
fun DemandApp() {
    val vm: MainViewModel = hiltViewModel()
    val i = 0
}







