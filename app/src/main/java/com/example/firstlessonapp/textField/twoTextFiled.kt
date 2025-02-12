package com.example.firstlessonapp.textField

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.firstlessonapp.passwordVerification.Personal
import com.example.firstlessonapp.R
import com.example.firstlessonapp.ui.theme.checkColor
import com.example.firstlessonapp.ui.theme.white80

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TwoTextField(
    modifier: Modifier = Modifier,
    textForLabel: String,
    textEnum: Personal,
    filtersItem: List<Personal>
) {
    var text by remember { mutableStateOf("") }
    var startDialog by remember { mutableStateOf(false) }
//    var valueEnumText by remember { mutableStateOf(textEnum.dataAbr) }
    var selectedItems by remember { mutableStateOf(textEnum.dataAbr) }
    Row(
        modifier = modifier
            .fillMaxWidth(0.91f),
    ) {
        OutlinedTextField(
            value = text, onValueChange = { text = it }, modifier = Modifier
                .height(height = 56.dp)
                .weight(.51f),
            label = {
                Text(
                    text = textForLabel, modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp)
                        .width(182.dp),
                    style = MaterialTheme.typography.bodyMedium
                )
            },
            shape = RoundedCornerShape(12.dp)
        )
        if (startDialog) {
            BasicAlertDialog(onDismissRequest = { startDialog = false }) {
                Surface(
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = MaterialTheme.shapes.large,
                    tonalElevation = 4.dp,
                    color = white80,

                    ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.SpaceAround
                    )
                    {
                        for (item in filtersItem) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(text = item.dataAbr, modifier = Modifier)
                                Checkbox(
                                    checked = selectedItems == item.dataAbr,
                                    onCheckedChange = {
                                        selectedItems= if (selectedItems==item.dataAbr) textEnum.toString() else item.dataAbr
                                    }, colors = CheckboxDefaults.colors(
                                        checkedColor = checkColor,
                                        checkmarkColor = Color.White,
                                        disabledCheckedColor = Color.Black,
                                        disabledUncheckedColor = Color.Black
                                    )
                                )
                            }
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.End
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(0.5f),
                                horizontalArrangement = Arrangement.SpaceAround,
                                verticalAlignment = Alignment.Bottom,
                            ) {
                                Text(text = "CANSEL", modifier = Modifier
                                    .clickable {
                                        startDialog=false
                                               },
                                    color = Color.Green)
                                Text(text = "SAVE", modifier = Modifier
                                    .clickable {
                                        startDialog=false
                                               },
                                    color = Color.Green)
                            }
                        }

                    }
                }
            }
        }
        OutlinedTextField(value = selectedItems,
            label = {},
            onValueChange = { },
            readOnly = true,
            modifier = Modifier
                .padding(start = 16.dp)
                .height(height = 56.dp)
                .weight(.25f)
                .clickable {startDialog=true }, shape = RoundedCornerShape(10.dp),
            singleLine = true,
            trailingIcon = {
                Icon(
                    painter = painterResource(R.drawable.ic_angle_small_down),
                    modifier = Modifier
                        .size(width = 16.dp, height = 16.dp)
                        .clickable { startDialog = true }, contentDescription = ""
                )
            }
        )
    }
}

