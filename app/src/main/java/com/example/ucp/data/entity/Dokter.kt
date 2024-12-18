package com.example.ucp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "dokter")
class Dokter (
@PrimaryKey
val idDokter: String,
val nama: String,
val spesialis: String,
val klinik: String,
val noHpDokter: String,
val jamKerja: String,
)