package com.example.vitbhopal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class underbelly_menu extends AppCompatActivity {
ListView listView;
ArrayList<String> menu = new ArrayList<>();
int[] arrNo = new int[]{1,2,3,4,5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_underbelly_menu);


        listView = findViewById(R.id.underbelly);

        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");
        menu.add("Ram");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1 ,menu);
        listView.setAdapter(adapter);

    }
}