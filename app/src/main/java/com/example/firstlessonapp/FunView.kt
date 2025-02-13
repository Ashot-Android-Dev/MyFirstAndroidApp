package com.example.firstlessonapp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

class CountViewModel : ViewModel() {
    private val _count = MutableLiveData(0)
    val count: LiveData<Int> = _count
    fun countInc() {
        _count.value = _count.value?.plus(10)
    }
}
@Composable
fun CountAA(viewModel: CountViewModel = viewModel()) {
    val abc by viewModel.count.observeAsState()
    Column(modifier = Modifier.padding(50.dp)) {
        OutlinedTextField(value = abc.toString(),
            onValueChange = {})
        Button(onClick = { }, Modifier.fillMaxWidth(0.90f)) {
            Text(text = "Inc", modifier = Modifier.clickable { viewModel.countInc() })

        }



    }
}