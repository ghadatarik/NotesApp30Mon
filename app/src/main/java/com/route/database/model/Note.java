package com.route.database.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/**
 * Created by Mohamed Nabil Mohamed on 9/26/2019.
 * m.nabil.fci2015@gmail.com
 */
@Entity
public class Note {
    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo
    String title;
    String  content;
    String time;

    public Note() {
    }

    @Ignore
    public Note(String title, String content, String time) {
        this.title = title;
        this.content = content;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
