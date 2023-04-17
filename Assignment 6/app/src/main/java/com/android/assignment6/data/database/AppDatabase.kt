package com.android.assignment6.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.android.assignment6.data.model.BaseAppResponse
import com.android.assignment6.data.database.typeConverter.DateTypeConverter

@Database(
    entities = [BaseAppResponse::class], version = 1
)
@TypeConverters(
    DateTypeConverter::class
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun baseAppDao(): BaseAppDao

    companion object {
        private const val DB_NAME = "base_app.db"

        fun getInstance(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                DB_NAME
            ).fallbackToDestructiveMigration().build()
        }
    }
}