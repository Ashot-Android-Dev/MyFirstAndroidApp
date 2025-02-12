package com.example.firstlessonapp.passwordVerification

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.unit.dp
import com.example.firstlessonapp.button.TwoButtons
import com.example.firstlessonapp.radioButton.FunRadioButton
import com.example.firstlessonapp.textField.TwoText
import com.example.firstlessonapp.textField.TwoTextField
import com.example.firstlessonapp.ui.theme.buttonGreen
import com.example.firstlessonapp.ui.theme.colorForColumn

@Composable
fun ApplicationPhoneFun(
    modifier: Modifier = Modifier,
    backgroundColor:Color= colorForColumn,
    titleWithText: String,
    infoWithText: String,
    genderWithText: String,
    birthInfoWithText: String,
    textForWeight: String,
    textForHeight: String,
    firstButtonWithText: String,
    secondButtonWithText: String,
    buttonFillColor:Color= buttonGreen,
    buttonTextColor:Color=Color.White,
    weightOptions:List<Personal> = listOf(Personal.KG, Personal.LBS, Personal.STLBS),
    heightOptions:List<Personal> =listOf(Personal.CM, Personal.FTIN)

) {
    val weightEnum by remember { mutableStateOf(Personal.KG) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = backgroundColor),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        )
        {
            TwoText(
                titleText = titleWithText,
                infoText = infoWithText
            )
            FunRadioButton(
                modifier = Modifier.padding(top = 24.dp),
                genderInfo = genderWithText
            )
            var textForTextFiled by remember { mutableStateOf("") }
            OutlinedTextField(
                value = textForTextFiled, onValueChange = { textForTextFiled = it },
                label = { Text(text = birthInfoWithText) },
                modifier = Modifier
                    .height(72.dp)
                    .fillMaxWidth(0.91f)
                    .padding(top = 16.dp),
                shape = RoundedCornerShape(12.dp)
            )
            TwoTextField(
                modifier = Modifier.padding(top = 12.dp),
                textForLabel = textForWeight, textEnum = weightEnum,
                filtersItem = weightOptions
            )
            TwoTextField(
                modifier = Modifier.padding(top = 12.dp),
                textForLabel = textForHeight, textEnum = Personal.CM,
                filtersItem = heightOptions
            )
        }
        Column(
            modifier = Modifier
                .padding(bottom = 24.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        )
        {
            TwoButtons(
                buttonWithText = firstButtonWithText,
                buttonFillColor = buttonFillColor,
                buttonTextColor = buttonTextColor
            )
            TwoButtons(
                buttonWithText = secondButtonWithText,
                buttonFillColor = buttonTextColor,
                buttonTextColor = buttonFillColor
            )
        }
    }
}


