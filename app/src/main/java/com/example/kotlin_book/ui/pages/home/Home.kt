package com.example.kotlin_book.ui.pages.home

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.kotlin_book.Screen
import com.example.kotlin_book.ui.pages.home.components.CustomCard
import com.example.kotlin_book.ui.pages.home.components.HomeAppBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Home(navController: NavHostController){

    Scaffold(
        topBar = {
            HomeAppBar()
        },
    ){innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Text(
                modifier = Modifier.padding(8.dp),
                text = "Welcome to the Compose book app",
            )
            CustomCard(
                buttonText = "UI",
                dropdownItems = listOf(
                    "Sign In/Sign Up" to { navController.navigate(route = Screen.Account.route) },
                    "Get Started" to {  },
                    "Item 3" to {  })
            )
        }
    }
}

