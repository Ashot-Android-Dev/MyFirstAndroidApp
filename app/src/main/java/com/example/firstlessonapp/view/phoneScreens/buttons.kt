package com.example.firstlessonapp.view.phoneScreens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun FunButton(
    modifier: Modifier = Modifier,
    buttonWithText: String,
    buttonFillColor: Color? = null,
    buttonTextColor: Color? = null
) {
    Button(
        onClick = {}, modifier = Modifier
            .fillMaxWidth(0.82f)
            .padding(top = 12.dp)
            .height ( 50.dp),
        shape = RoundedCornerShape(14.dp),
        colors = ButtonDefaults.buttonColors(containerColor = buttonFillColor ?: Color.White),
        border = BorderStroke(width = 1.dp, color = buttonTextColor ?: Color.Black)
    ) {
        Text(
            text = buttonWithText, modifier = Modifier
                .size(width = 35.dp, height = 22.dp),
            color = buttonTextColor ?: Color.Black,
            style = MaterialTheme.typography.titleSmall,
            textAlign = TextAlign.Center
        )
    }

}