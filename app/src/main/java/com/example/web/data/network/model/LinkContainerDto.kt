package com.example.web.data.network.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "all_link")
data class LinkContainerDto(

    @PrimaryKey(autoGenerate = true) val key: Int,
    @SerializedName("link" ) val link: String? = null,
    @SerializedName("home" ) val home: String? = null
)
