package com.example.firstlessonapp.navigation.firstAppNavigation

sealed class PageScreen (val home:String){
    object Root: PageScreen("home")
    object FirstScreen: PageScreen("first")
    object SecondScreen: PageScreen("second")
    object EndPurchases: PageScreen("purchases")
}
enum class MyEnum{
    KG,IBS,ST,
}