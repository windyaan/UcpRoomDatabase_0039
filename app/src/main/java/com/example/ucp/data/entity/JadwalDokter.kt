package com.example.ucp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "jadwalDokter")
class JadwalDokter (
@PrimaryKey
val idJadwal: String,
val namaDokter: String,
val namaPasien: String,
val noHpPasien: String,
val tanggal: String,
val status: String,
)
