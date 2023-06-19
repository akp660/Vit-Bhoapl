 package com.example.vitbhopal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;

 public class mess_menu_femail extends AppCompatActivity {

     ImageView refresh_button;

     Spinner spinner;
     ArrayList<String> arrNames = new ArrayList<>();
     ArrayList<String> arrDays = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mess_menu_femail);

        spinner = findViewById(R.id.dropdown);

        refresh_button=findViewById(R.id.refresh);

        refresh_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RotateAnimation rotateAnimation=new RotateAnimation(360,0,RotateAnimation.RELATIVE_TO_SELF,0.5F, Animation.RELATIVE_TO_SELF,0.5F);

                rotateAnimation.setDuration(1000);
                refresh_button.startAnimation(rotateAnimation);

            }
        });


        arrDays.add("Monday");
        arrDays.add("Tuesday");
        arrDays.add("Wednesday");
        arrDays.add("Thursday");
        arrDays.add("Friday");
        arrDays.add("Saturday");
        arrDays.add("Sunday");
        arrDays.add("Under Belly");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arrDays);
        spinner.setAdapter(spinnerAdapter);
    }
}