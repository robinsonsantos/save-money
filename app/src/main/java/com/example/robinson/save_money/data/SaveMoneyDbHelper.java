package com.example.robinson.save_money.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by robinson on 22/03/17.
 */

public class SaveMoneyDbHelper  extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "savemoney.db";

    private static int DATABASE_VERSION = 1;

    public SaveMoneyDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        final String SQL_CREATE_SAVEMONEY_TABLE = "CREATE TABLE " +
                SaveMoneyContract.SaveMoneyEntry.TABLE_NAME + " (" +
                SaveMoneyContract.SaveMoneyEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                SaveMoneyContract.SaveMoneyEntry.COLUMN_SPENT_DESCRIPTION + " TEXT NOT NULL, " +
                SaveMoneyContract.SaveMoneyEntry.COLUMN_SPENT_VALUE + " INTEGER NOT NULL, " +
                SaveMoneyContract.SaveMoneyEntry.COLUMN_TIMESTAMP + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP" +
                ");";

        sqLiteDatabase.execSQL(SQL_CREATE_SAVEMONEY_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + SaveMoneyContract.SaveMoneyEntry.TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
}
