package com.example.firstlessonapp.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class UserData(val name: String="", val surname: String="")

class ViewModelNavigation:ViewModel(){
    private val _userDat = MutableStateFlow(UserData())
    val userData:StateFlow<UserData> = _userDat


    fun sendData(name: String, surname: String) {
        _userDat.value=UserData(name,surname)
    }
}