package com.ist.ondemand

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ist.ondemand.common.DemandApp
import com.ist.ondemand.presentation.ui.theme.OnDemandTheme
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








