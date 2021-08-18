package com.example.vsga_mp_sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    private static final String database_name = "db_login";
    public static final String table_name = "table_login";

    public static final String row_id = "_id";
    public static final String row_username = "Username";
    public static final String row_password = "Password";

    private SQLiteDatabase db;

    public DBHelper(Context context) {
        super(context, database_name, null, 2);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    //    String query = "CREATE TABLE" + table_name + "(" + row_id + "INTEGER PRIMARY KEY AUTOINCREMENT, "
    //            + row_username + "TEXT," + row_password + "TEXT)";
    //    db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
