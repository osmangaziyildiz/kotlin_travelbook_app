package com.osmangyildiz.travelbook.Room_Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.osmangyildiz.travelbook.Model.PlaceModel
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Flowable

@Dao
interface PlaceDao {

    @Query("SELECT * FROM PlaceModel")
    fun getAll(): Flowable<List<PlaceModel>>

    @Insert
    fun insert(place: PlaceModel) : Completable

    @Delete
    fun delete(place: PlaceModel) : Completable

}