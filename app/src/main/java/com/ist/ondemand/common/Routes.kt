package com.ist.ondemand.common

sealed class Routes(val route:String){
    object Option:Routes("option")
    object Signup:Routes("signup")
    object Login:Routes("login")
    object Services:Routes("services")
    object MyServices:Routes("myservices")
    object Search:Routes("search")


}