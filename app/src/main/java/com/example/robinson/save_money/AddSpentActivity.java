package com.example.robinson.save_money;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by robinson on 22/03/17.
 */

public class AddSpentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_add_spent);

        Button addButton = (Button)  findViewById(R.id.buttonAddSpent);

        addButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(AddSpentActivity.this, "A spent was added", Toast.LENGTH_LONG).show();
            }
        });

    }

}
