package com.example.firstlessonapp.view.phoneScreens

data class PersonalData(val dataAbr: String,val fraction:Float)
val kilo= PersonalData("kg",1f)
val lbs= PersonalData("lbs",2.35f)
val st= PersonalData("st/lbs",5.4f)
val sm= PersonalData("cm",100f)
val ft= PersonalData("ft/sm",7.4f)
val personalDataList= listOf(kilo, lbs, st)
val personalSmList= listOf(sm, ft)
