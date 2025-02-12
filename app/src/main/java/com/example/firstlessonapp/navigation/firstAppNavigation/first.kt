package com.example.firstlessonapp.navigation.firstAppNavigation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

fun isCheckingEmail(email: String) = email.isNotEmpty() && email.length > 4


@Composable
fun FirstScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    name: String?,
    surname: String?,
) {
    var email by remember { mutableStateOf("") }
    val isButtonEmail = isCheckingEmail(email)

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(
                text = "first Page",
                modifier = modifier
                    .padding(vertical = 10.dp)
                    .border(BorderStroke(width = 1.dp, color = Color.Gray), shape = RectangleShape)
                    .padding(4.dp)
                    .background(Color.Cyan),
                fontSize = 30.sp,
                fontWeight = FontWeight.Black
            )
        }
        Column(
            modifier = Modifier
                .offset(y = 85.dp)
        ) {
            Text(
                text = "Hello-/${name} /${surname}",
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Black
            )
            Text(text = "Enter your email")
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text(text = "input Email") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )
            Button(
                onClick = {
                    navController.navigate(PageScreen.SecondScreen.home) {
                    }
                },
                enabled = isButtonEmail,
                content = { Text(text = "Next") }, modifier = Modifier
                    .fillMaxWidth(0.72f)
            )
        }
        Row(
            Modifier.fillMaxSize(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

        }
    }
}