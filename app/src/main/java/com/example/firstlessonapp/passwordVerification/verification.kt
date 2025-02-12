
package com.example.firstlessonapp.passwordVerification

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstlessonapp.ui.theme.colorsOfDigit

@Composable
fun VerificationOfDigit(modifier: Modifier = Modifier, digit: String, color:Color= Color.Black) {
    val countDigit = if (digit.toString().isNotEmpty()) digit.toString().length else 0
    var count by remember { mutableIntStateOf(0) }
    Row(
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .height(64.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        repeat(countDigit) { Text(text = "",
            Modifier
                .border(width = 1.dp, color = Color.Black)
                .padding(vertical = 2.dp, horizontal = 6.dp),
            fontSize = 30.sp,
            color = color
        )
            count += 1
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun VerificationOfDigitPreview() {
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        VerificationOfDigit(digit = "1234", color = colorsOfDigit)
    }
}