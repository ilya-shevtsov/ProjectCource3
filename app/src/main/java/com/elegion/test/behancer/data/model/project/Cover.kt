package com.elegion.test.behancer.data.model.project

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity(
    foreignKeys = [ForeignKey(
        entity = Project::class,
        parentColumns = [("id")],
        childColumns = [("project_id")]
    )]
)
data class Cover(
    @PrimaryKey
    @ColumnInfo(name = "id")
    var id: Int = 0,

    @ColumnInfo(name = "photo_url")
    @SerializedName("202")
    var photoUrl: String? = null,


    @ColumnInfo(name = "project_id")
    var projectId: Int = 0

) : Serializable
