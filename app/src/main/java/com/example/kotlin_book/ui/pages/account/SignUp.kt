package com.example.kotlin_book.ui.pages.account

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.kotlin_book.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUp(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 102.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        var emailSignUp by remember{
            mutableStateOf("")
        }
        var passWord by remember{
            mutableStateOf("")
        }
        var confirmPassword by remember{
            mutableStateOf("")
        }
        TextField(
            value = emailSignUp,
            onValueChange = { emailSignUp = it },
            label = {
                Text(text = "Email address")
            },
            modifier = Modifier
                .padding(5.dp)
                .size(340.dp, 50.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .border(1.dp, color = Color(0xffD3D3D3), shape = RoundedCornerShape(10.dp)),
            textStyle = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold),
            singleLine = true
        )
        TextField(
            value = passWord,
            onValueChange = { passWord = it },
            label = {
                Text(text = "Password")
            },
            modifier = Modifier
                .padding(5.dp)
                .size(340.dp, 50.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .border(1.dp, color = Color(0xffD3D3D3), shape = RoundedCornerShape(10.dp)),
            textStyle = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold),
            singleLine = true
        )

        TextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            label = {
                Text(text = "Confirm Password")
            },
            modifier = Modifier
                .padding(5.dp)
                .size(340.dp, 50.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .border(1.dp, color = Color(0xffD3D3D3), shape = RoundedCornerShape(10.dp)),
            textStyle = TextStyle(color = Color.Black, fontWeight = FontWeight.Bold),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = {},
            modifier = Modifier
                .size(340.dp, 50.dp)
                .clip(shape = RoundedCornerShape(10.dp)),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD7E4F7)),
            shape = RoundedCornerShape(1.dp)
        ) {
            Text(
                text = "Sign up",
                color = Color.Black
            )
        }
        Row(
            modifier = Modifier.width(340.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Divider(color = Color(0xffD3D3D3), thickness = 1.dp, modifier = Modifier.width(150.dp))
            Text(
                text = "or",
                modifier = Modifier.padding(5.dp),
                color = Color.Gray
            )
            Divider(color = Color(0xffD3D3D3), thickness = 1.dp, modifier = Modifier.width(150.dp))
        }
        Button(
            onClick = {},
            modifier = Modifier
                .size(340.dp, 50.dp)
                .clip(shape = RoundedCornerShape(10.dp)),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD7E4F7)),
            shape = RoundedCornerShape(1.dp)
        ) {
            Text(
                text = "Sign up with Google",
                color = Color.Black
                )
        }
    }
}