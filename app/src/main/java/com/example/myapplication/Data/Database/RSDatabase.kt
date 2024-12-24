package com.example.myapplication.Data.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myapplication.Data.Dao.DokterDao
import com.example.myapplication.Data.Dao.JadwalDao
import com.example.myapplication.Data.Entity.Dokter
import com.example.myapplication.Data.Entity.Jadwal

//Mendefinisikan database dgn tabel Dokter dan Jadwal
@Database(entities = [Dokter::class, Jadwal::class], version = 1)
abstract class RSDatabase : RoomDatabase() {

    //Mendefinisikan fungsi utk mengakses data
    abstract fun dokterDao(): DokterDao
    abstract fun jadwalDao(): JadwalDao

    companion object {
        @Volatile
        private var Instance: RSDatabase? = null

        fun getDatabase(context: Context): RSDatabase {
            return Instance ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RSDatabase::class.java,
                    "RS-DB" //Nama DB
                ).build()
                Instance = instance
                instance
            }
        }
    }
}
