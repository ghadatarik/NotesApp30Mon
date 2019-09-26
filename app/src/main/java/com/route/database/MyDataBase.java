package com.route.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.route.database.daos.NotesDao;
import com.route.database.model.Note;

/**
 * Created by Mohamed Nabil Mohamed on 9/26/2019.
 * m.nabil.fci2015@gmail.com
 */
@Database(entities = {Note.class},version = 1,exportSchema = false)
public abstract class MyDataBase extends RoomDatabase {
    private static  MyDataBase dataBase;
    private final static String DATABASE_NAME="notesDatabaseRoute";
    public abstract NotesDao notesDao();
    public static MyDataBase getInstance(Context context){
        if(dataBase==null){
            //create
            dataBase = Room.databaseBuilder(context,MyDataBase.class,
                            DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();

        }
        return dataBase;
    }
}
