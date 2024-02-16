package com.osmangyildiz.travelbook.Room_Database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.osmangyildiz.travelbook.Model.PlaceModel

@Database(entities = [PlaceModel::class], version = 1)
abstract class PlaceDatabase : RoomDatabase() {
abstract fun placeDao(): PlaceDao
}