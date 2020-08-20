package com.runshaw.tutorials;

/**
 * Created by Sharath on 2020/08/19
 **/
public class NotesModel {

    String title;
    String desc;
    String date;
    String time;

    public NotesModel(String title, String desc, String date, String time) {
        this.title = title;
        this.desc = desc;
        this.date = date;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
