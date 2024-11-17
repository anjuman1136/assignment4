package com.example.edulearn;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment4.R;

import java.util.ArrayList;

public class CustomListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_layout);

        ListView customListView = findViewById(R.id.customListView);

        // Sample data for the ListView
        ArrayList<String> data = new ArrayList<>();
        data.add("Math Courses");
        data.add("Science Tutorials");
        data.add("History Books");
        data.add("Coding Bootcamps");

        // Using ArrayAdapter to populate ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                data
        );
        customListView.setAdapter(adapter);
    }
}
