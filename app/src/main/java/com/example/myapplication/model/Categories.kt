package com.example.myapplication.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Categories")
data class Categories(
    @PrimaryKey(autoGenerate = true)
    var idCategory: Int? = null,
    var nameCategories : String,
) : Serializable
