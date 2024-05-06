package com.example.kotlin_book

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.kotlin_book.ui.pages.account.AccountUI
import com.example.kotlin_book.ui.pages.account.SignUp
import com.example.kotlin_book.ui.pages.home.Home

@Composable
fun SetUpNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
    ){
        composable(
            route = Screen.Home.route
        ) {
            Home(navController)
        }
        composable(
            route = Screen.SignUp.route
        ) {
            SignUp()
        }
        composable(
            route = Screen.Account.route
        ){
            AccountUI(navController)
        }
    }
}