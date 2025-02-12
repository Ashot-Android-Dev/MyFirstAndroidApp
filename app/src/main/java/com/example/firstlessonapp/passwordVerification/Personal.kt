package com.example.firstlessonapp.passwordVerification

enum class Personal(var dataAbr:String,) {
    KG("kg",),
    LBS("Lbs",),
    STLBS("St/Lbs",),
    CM("cm",),
    FTIN("Ft/In",),
}
data class PersonalData(val dataAbr: String,val fraction:Float)
val kilo= PersonalData("kg",1f)
val lbs= PersonalData("lbs",2.35f)
val st= PersonalData("st/lbs",5.4f)
val sm= PersonalData("cm",100f)
val ft= PersonalData("ft/sm",7.4f)
val personalDataList= listOf(kilo, lbs, st)
val personalSmList= listOf(sm, ft)

enum class Personal2(val displayName:String){

    CM("cm",),
    FTIN("Ft/In",),
}