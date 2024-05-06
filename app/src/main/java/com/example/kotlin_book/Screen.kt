package com.example.kotlin_book

import com.example.kotlin_book.utils.Constants.Companion.ACCOUNT_SCREEN
import com.example.kotlin_book.utils.Constants.Companion.HOME_SCREEN
import com.example.kotlin_book.utils.Constants.Companion.SIGN_UP_SCREEN

sealed class Screen (val route: String){
    object Home: Screen(route = HOME_SCREEN)
    object SignUp: Screen(route = SIGN_UP_SCREEN)
    object Account: Screen(route = ACCOUNT_SCREEN)
}