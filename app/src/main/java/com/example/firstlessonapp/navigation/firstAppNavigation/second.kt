package com.example.firstlessonapp.navigation.firstAppNavigation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

data class Product(val name: String, val sum: String)

@Composable
fun SecondScreen(modifier: Modifier = Modifier, navController: NavHostController) {
    val productList = listOf(
        Product("Apples", "10$"), Product("Banana", "5$"),
        Product("Dresses", "100$"), Product("Orange", "20$"),
        Product("Chery", "10$"), Product("bag", "15$"),
        Product("Hat", "25$"), Product("Apples", "10$"),
        Product("Apples", "10$"), Product("Apples", "10$"),
        Product("Apples", "10$"), Product("Apples", "10$"),
        Product("Apples", "10$"), Product("Apples", "10$"),
    )
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(
                text = "Second Page",
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
                .padding(horizontal = 10.dp)
                .fillMaxWidth()
                .offset(y = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.finishPage),
                fontSize = 28.sp,
                fontWeight = FontWeight.Black
            )
        }
        Spacer(modifier = Modifier.padding(10.dp))
        LazyVerticalGrid (
            columns = GridCells.Fixed(1),
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize()
        ) {
            items(productList) { item ->
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                ){
                        Card(shape = RoundedCornerShape(10.dp), modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Blue)
                            .clickable { navController.navigate(PageScreen.EndPurchases.home) })  {
                        Text(
                            text = "${item.name} = ${item.sum}",
                            fontSize = 24.sp,
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.Green)
                                .padding(10.dp),
                            fontWeight = FontWeight.Black
                        )
                    }

                }

            }
        }
    }
    Row(
        Modifier.fillMaxSize(),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
    }

}

