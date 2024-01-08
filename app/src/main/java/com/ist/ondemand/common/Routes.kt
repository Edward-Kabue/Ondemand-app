package com.ist.ondemand.common

sealed class Routes(val route:String){
    object Signup:Routes("signup")
    object Login:Routes("login")
    object Services:Routes("services")
}