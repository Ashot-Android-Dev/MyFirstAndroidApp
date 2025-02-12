package com.example.firstlessonapp.radioButton

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FunRadioButton(modifier: Modifier = Modifier, genderInfo: String) {
    var state by remember { mutableStateOf(true) }
    Column(modifier = modifier.fillMaxWidth()) {
        Text(
            text = genderInfo,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(start = 16.dp, bottom = 16.dp)
        )
        Row(
            modifier = Modifier
                .padding(start = 6.dp)
                .fillMaxWidth()
                .selectableGroup(),
        ) {
            RadioButton(
                selected = state,
                onClick = { state = true },
                modifier = Modifier
                    .size(width = 21.dp, height = 21.dp)
                    .padding(start = 16.dp, top = 16.dp)
            )
            Text(
                text = "Male",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier
                    .padding(start = 16.dp, top = 8.dp)
            )

            Spacer(modifier = Modifier.width(26.dp))
            RadioButton(
                selected = !state, onClick = { state = false },
                modifier = Modifier
                    .size(width = 21.dp, height = 21.dp)
                    .padding(start = 16.dp, top = 16.dp)
            )
            Text(
                text = "Female", modifier = Modifier
                    .padding(start = 16.dp, top = 8.dp),
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

