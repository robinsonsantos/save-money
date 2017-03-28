package com.example.robinson.save_money;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.robinson.save_money.data.SaveMoneyContract;
import com.example.robinson.save_money.data.SaveMoneyDbHelper;

public class MainActivity extends AppCompatActivity {

    private SQLiteDatabase mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fabButton = (FloatingActionButton) findViewById(R.id.fab);

        fabButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Create a new Intent to start and AddSpentActivity
                Intent addSpentActivity = new Intent(MainActivity.this, AddSpentActivity.class);
                startActivity(addSpentActivity);
            }
        });

        SaveMoneyDbHelper dbHelper = new SaveMoneyDbHelper(this);
        mDb = dbHelper.getReadableDatabase();

        Cursor cursor = getAllSpents();

    }

    private Cursor getAllSpents() {
        return mDb.query(
                SaveMoneyContract.SaveMoneyEntry.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                SaveMoneyContract.SaveMoneyEntry.COLUMN_TIMESTAMP
        );
    }
}
