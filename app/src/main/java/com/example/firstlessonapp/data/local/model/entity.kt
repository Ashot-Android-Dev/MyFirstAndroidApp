package com.example.firstlessonapp.data.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "carSale")
data class CarSale(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "model_col") val model: String,
    val manufacture: String,
    val manufactureYear: Int,
    val hp: Int,
    val price: Int,
)

@Entity
data class UserInfo(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val surname: String,
)
