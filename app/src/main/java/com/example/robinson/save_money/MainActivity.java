package com.example.robinson.save_money;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

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

    }
}
