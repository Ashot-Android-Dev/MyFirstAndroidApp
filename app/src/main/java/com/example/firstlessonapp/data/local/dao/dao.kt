package com.example.firstlessonapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.firstlessonapp.data.local.model.CarSale
import com.example.firstlessonapp.data.local.model.UserInfo

@Dao
interface CarSaleDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun insertCar(vararg carSale: CarSale)
    @Query("SELECT * FROM carSale")
      fun allCarSale():List<CarSale>
}
@Dao
interface UserDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
   suspend fun insertUser(userInfo: UserInfo)

    @Query("SELECT * FROM userinfo")
   suspend fun getAllUsers():List<UserInfo>

   @Query("DELETE FROM userinfo")
   suspend fun deleteUsers()

   @Update
   suspend fun updateUserInfo(userInfo: UserInfo)


}