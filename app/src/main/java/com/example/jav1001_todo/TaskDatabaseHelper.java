package com.example.jav1001_todo;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TaskDatabaseHelper extends SQLiteOpenHelper {

//    adding the database to save the data entered by the user

    public TaskDatabaseHelper(Context context) {
        super(context, TaskContract.DB_NAME, null, TaskContract.DB_VERSION);
    }

    @Override

    // creating a table when ever the user add a task and adding it to listview
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TaskContract.TaskEntry.TABLE + " ( " +
                TaskContract.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TaskContract.TaskEntry.COL_TASK_TITLE + " TEXT NOT NULL);";

        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TaskContract.TaskEntry.TABLE);
        onCreate(db);
    }
}
