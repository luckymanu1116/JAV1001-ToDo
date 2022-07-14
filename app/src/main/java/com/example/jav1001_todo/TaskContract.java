package com.example.jav1001_todo;


import android.provider.BaseColumns;

public class TaskContract {
    //setting database to store the info that user entered
    public static final String DB_NAME = "com.aziflaj.todolist.db";
    public static final int DB_VERSION = 1;
    // assinging the task entry and title
    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
