package com.theandroidcafe.shoppinglist.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping list")
data class ShoppingListItem(
    val name: String?,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)