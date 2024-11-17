package com.example.assignment4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button to navigate to Custom ListView Activity
        Button customListButton = findViewById(R.id.btnCustomList);
        customListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.edulearn.CustomListActivity.class);
                startActivity(intent);
            }
        });

        // Button to navigate to Expandable ListView Activity
        Button expandableListButton = findViewById(R.id.btnExpandableList);
        expandableListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.edulearn.ExpandableListActivity.class);
                startActivity(intent);
            }
        });
    }
}
