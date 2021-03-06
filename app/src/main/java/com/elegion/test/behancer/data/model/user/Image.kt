package com.elegion.test.behancer.data.model.user

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    foreignKeys = [ForeignKey(
        entity = User::class,
        parentColumns = [("id")],
        childColumns = [("user_id")]
    )]
)
data class Image(
    @PrimaryKey
    @ColumnInfo(name = "id")
    var id: Int = 0,

    @ColumnInfo(name = "photo_url")
    @SerializedName("230")
    var photoUrl: String? = null,

    @ColumnInfo(name = "user_id")
    var userId: Int = 0
)
