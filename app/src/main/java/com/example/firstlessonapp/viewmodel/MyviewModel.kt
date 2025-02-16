package com.example.firstlessonapp.viewmodel

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow


class MyViewModel : ViewModel() {
    private val _count = MutableStateFlow(0)
    var count: StateFlow<Int> = _count

    fun incCount() {
        _count.value += 10
    }
}

