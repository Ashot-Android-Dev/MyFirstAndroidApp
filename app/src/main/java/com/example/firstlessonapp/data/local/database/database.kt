package com.example.firstlessonapp.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.firstlessonapp.data.local.dao.CarSaleDao
import com.example.firstlessonapp.data.local.dao.UserDao
import com.example.firstlessonapp.data.local.model.CarSale
import com.example.firstlessonapp.data.local.model.UserInfo
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized

@Database(entities = [CarSale::class], version = 2)
abstract class CarSaleDb:RoomDatabase(){
    abstract fun carSaleDao(): CarSaleDao
    companion object{
        private var INSTANCE:
                CarSaleDb?=null
        @OptIn(InternalCoroutinesApi::class)
        fun getCarInfo(context: Context): Any {
            return INSTANCE ?:
            synchronized(this){
                val instance=Room.databaseBuilder(
                    context.applicationContext,
                    CarSaleDb::class.java,
                    "car_Base"
                ).fallbackToDestructiveMigration().build()
            }
        }
    }
}
@Database(entities = [UserInfo::class], version = 1)
abstract class UserDb:RoomDatabase(){
    abstract fun userDbInfo(): UserDao
    companion object{
        @Volatile
        private var INSTANCE:
                UserDb?=null
        @OptIn(InternalCoroutinesApi::class)
        fun getUserInfo(context:Context): UserDb {
            return INSTANCE ?:
            synchronized(this){
                val instance=Room.databaseBuilder(
                    context.applicationContext,
                    UserDb::class.java,
                    name = "user_database"
                ).fallbackToDestructiveMigration().build()
                INSTANCE =instance
                instance

            }
        }
    }
}


//val carSaleDatabase = Room.databaseBuilder(
//    context = applicationContext,
//    CarSaleDb::class.java,
//    name = "carSaleDatabase"
//).fallbackToDestructiveMigration().build()
//val carSample = CarSale(
//    model = "audi",
//    manufacture = "europe",
//    manufactureYear = 2024,
//    hp = 200,
//    price = 500000
//)
//val carDao=carSaleDatabase.carSaleDao()
//carDao.insertCar(carSample)
//val carSampleOne = carSaleDatabase.carSaleDao().allCarSale()
