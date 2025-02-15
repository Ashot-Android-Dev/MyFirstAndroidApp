package com.example.firstlessonapp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.res.stringResource
import com.example.firstlessonapp.passwordVerification.ApplicationPhoneFun

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            val db= UserDb.getUserInfo(this)
//            val userDao=db.userDbInfo()
//            LaunchedEffect (Unit){
//                withContext(Dispatchers.IO){
//                    val  newUser= UserInfo(
//                        name = "Anahit ",
//                        surname = "Kirakosyan",
//                    )
//                    userDao.insertUser(newUser)
////                    userDao.deleteUsers()
//                    val users=userDao.getAllUsers()
//                    users.forEach { println("user${it.name} ${it.surname}") }
//                }
//            }
            ApplicationPhoneFun(
                titleWithText = stringResource(R.string.title_text),
                infoWithText = stringResource(R.string.info_text),
                genderWithText = stringResource(R.string.gender_info_text),
                birthInfoWithText = stringResource(R.string.birth_info_text),
                textForWeight = "" ,
                textForHeight = "",
                firstButtonWithText = stringResource(R.string.text_with_button_first),
                secondButtonWithText = stringResource(R.string.text_with_button_second)
            )

        }
    }
}