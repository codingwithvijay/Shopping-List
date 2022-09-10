package com.theandroidcafe.shoppinglist.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "Shopping Item")
data class ShoppingItem(
    val name: String?,
    val modifiedDate: Date?,
    val itemCount: Int?,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)