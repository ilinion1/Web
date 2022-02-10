package com.example.web.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "all_link")
data class LinkContainerDbModel(

    @PrimaryKey(autoGenerate = true) val key: Int,
    val link: String? = null,
    val home: String? = null
)
