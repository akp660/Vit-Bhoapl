package com.example.vitbhopal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class dev_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev_profile);

        ImageView imageView = findViewById(R.id.home);
        imageView.setOnClickListener(view -> home());

    }

    public void home(){
        Intent intent = new Intent(dev_profile.this,MainActivity.class);
        startActivity(intent);
    }
}