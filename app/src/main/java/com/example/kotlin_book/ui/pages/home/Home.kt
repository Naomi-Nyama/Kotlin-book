package com.example.kotlin_book.ui.pages.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kotlin_book.ui.pages.home.components.HomeAppBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Home(){
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
        }
    }
}

