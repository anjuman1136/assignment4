package com.example.edulearn;

import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment4.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expandable_list_layout);

        ExpandableListView expandableListView = findViewById(R.id.expandableListView);

        // Preparing data for the ExpandableListView
        List<String> parentList = new ArrayList<>();
        HashMap<String, List<String>> childMap = new HashMap<>();

        // Adding parent categories
        parentList.add("Programming");
        parentList.add("Languages");
        parentList.add("Science");

        // Adding child items
        List<String> programming = new ArrayList<>();
        programming.add("Java");
        programming.add("Python");
        programming.add("C++");

        List<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("Spanish");
        languages.add("French");

        List<String> science = new ArrayList<>();
        science.add("Physics");
        science.add("Chemistry");
        science.add("Biology");

        // Mapping child items to parents
        childMap.put(parentList.get(0), programming);
        childMap.put(parentList.get(1), languages);
        childMap.put(parentList.get(2), science);

        // Setting up the adapter
        com.example.edulearn.ExpandableListAdapter adapter = new com.example.edulearn.ExpandableListAdapter(this, parentList, childMap);
        expandableListView.setAdapter(adapter);
    }
}
