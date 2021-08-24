package com.example.notes

import androidx.lifecycle.LiveData
import androidx.room.Insert;
import androidx.room.Delete;
import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.OnConflictStrategy;


@Dao
interface NoteDao {

 @Query("SELECT * FROM note_table ORDER BY id ASC")
 fun getAllNotes(): LiveData<List<Note>>

  @Insert(onConflict = OnConflictStrategy.IGNORE)
  fun insert(note : Note):List<Long>
//
// @Delete
// suspend fun delete(note: Note):Int
}