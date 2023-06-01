package com.example.vitbhopal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dev_profile extends AppCompatActivity {

    ImageView gmail;
    ImageView github;
    ImageView linkedin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev_profile);

        ImageView imageView = findViewById(R.id.home);
        imageView.setOnClickListener(view -> home());

        gmail = findViewById(R.id.gmail);
        github = findViewById(R.id.github);
        linkedin = findViewById(R.id.linkedin);


        gmail.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                gotoUrl("https://vtop.vitbhopal.ac.in/vtop/initialProcess");
            }
            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://vtop.vitbhopal.ac.in/vtop/initialProcess");
            }

            private void gotoUrl(String s) {
                gotoUrl("https://vtop.vitbhopal.ac.in/vtop/initialProcess");
            }
        });


    }

    public void home(){
        Intent intent = new Intent(dev_profile.this,MainActivity.class);
        startActivity(intent);
    }
}