package com.example.notes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
data class Note(@ColumnInfo(name = "note") val note:String)
{
    @PrimaryKey(autoGenerate = true) val id:Int = 0
}
