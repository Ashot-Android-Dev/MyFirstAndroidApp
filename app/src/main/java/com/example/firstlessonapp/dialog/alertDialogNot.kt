package com.example.firstlessonapp.dialog

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersonalDataAlert(modifier: Modifier = Modifier, openDialog: Boolean) {
    var openDialog by remember { mutableStateOf(openDialog) }

}