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
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.firstlessonapp.R

fun isNameAndSurnameAndAge(name: String, surname: String, age: Int): Boolean {
    val isName = name.isNotEmpty() && name[0].isUpperCase() && name.substring(1)
        .all { it.isLowerCase() }
    val isSurname =
        surname.isNotEmpty() && surname[0].isUpperCase() && surname.substring(1)
            .all { it.isLowerCase() }
    val isAge = age in 1..100
    return isName && isSurname && isAge
}

@Composable
fun Root(modifier: Modifier = Modifier, navController: NavHostController) {
    var age by remember { mutableIntStateOf(0) }
    var name by remember { mutableStateOf("") }
    var surname by remember { mutableStateOf("") }
    val isButton = isNameAndSurnameAndAge(name, surname, age)
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "HomePage",
                modifier = modifier
                    .padding(vertical = 5.dp)
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
                .padding(vertical = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Text(
                text = stringResource(R.string.homePage),
                fontWeight = FontWeight.Black, fontSize = 17.sp
            )
            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                label = { Text(text = "Name") }
            )
            OutlinedTextField(
                value = surname,
                onValueChange = { surname = it },
                label = { Text(text = "SurName") }
            )
            OutlinedTextField(
                value = if (age == 0) "" else age.toString(),
                onValueChange = { age = it.toIntOrNull() ?: 0 },
                label = { Text(text = "age") }
            )
            Button(
                onClick = { navController.navigate(PageScreen.FirstScreen.home + "/$name/$surname") },
                content = { Text(text = "Next") },
                enabled = isButton,
                modifier = Modifier.fillMaxWidth(0.75f)

            )


        }
    }
}

