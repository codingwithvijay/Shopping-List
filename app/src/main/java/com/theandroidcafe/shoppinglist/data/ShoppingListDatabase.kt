package com.theandroidcafe.shoppinglist.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.theandroidcafe.shoppinglist.data.entity.ShoppingItem
import com.theandroidcafe.shoppinglist.data.entity.ShoppingListItem
import com.theandroidcafe.shoppinglist.util.DateConverter

@Database(
    entities = [ShoppingItem::class, ShoppingListItem::class],
    version = 1
)
@TypeConverters(DateConverter::class)
abstract class ShoppingListDatabase : RoomDatabase() {
    abstract fun shoppingDao() : ShoppingListDao
}