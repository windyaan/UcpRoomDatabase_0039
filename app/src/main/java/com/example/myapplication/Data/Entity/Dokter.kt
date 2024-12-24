package com.example.myapplication.Data.Entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "dokter")
data class Dokter(
    @PrimaryKey
    val id: String,
    val nama: String,
    val spesialis: String,
    val klinik: String,
    val noHp: String,
    val jamKerja: String
)

@Entity(tableName = "jadwal")
data class Jadwal(
    @PrimaryKey
    val id: String,
    val namaDokter: String,
    val namaPasien: String,
    val noHp: String,
    val tanggal: String,
    val status: String
)
