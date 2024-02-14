package com.example.kotlin_book.ui.pages.home.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeAppBar() {
    TopAppBar(
        title = {
        Text(text = "Compose book")
    },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFF6CC2FF))
    )
}