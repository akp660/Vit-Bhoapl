package com.example.vitbhopal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;

public class mess_menu extends AppCompatActivity {
    ImageView refresh_button;

    Spinner spinner;
    ArrayList<String> arrNames = new ArrayList<>();
    ArrayList<String> arrDays = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mess_menu);

        spinner = findViewById(R.id.spinner);

        refresh_button=findViewById(R.id.refresh_button);

        refresh_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RotateAnimation rotateAnimation=new RotateAnimation(360,0,RotateAnimation.RELATIVE_TO_SELF,0.5F, Animation.RELATIVE_TO_SELF,0.5F);

                rotateAnimation.setDuration(500);
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

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.spinner_view, arrDays);
        spinnerAdapter.setDropDownViewResource(R.layout.dropdown_view);
        spinner.setAdapter(spinnerAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String arrDays = spinner.getSelectedItem().toString();

                View contentView = null;

                if (arrDays.equals("Monday")) {
                    contentView = LayoutInflater.from(mess_menu.this).inflate(R.layout.activity_boys_monday, null);
                }
                if (arrDays.equals("Tuesday")) {
                    contentView = LayoutInflater.from(mess_menu.this).inflate(R.layout.activity_boys_tuesday, null);
                }
                if (arrDays.equals("Wednesday")) {
                    contentView = LayoutInflater.from(mess_menu.this).inflate(R.layout.activity_boys_wednesday, null);
                }
                if (arrDays.equals("Thursday")) {
                    contentView = LayoutInflater.from(mess_menu.this).inflate(R.layout.activity_boys_thusday, null);
                }
                if (arrDays.equals("Friday")) {
                    contentView = LayoutInflater.from(mess_menu.this).inflate(R.layout.activity_boys_friday, null);
                }
                if (arrDays.equals("Saturday")) {
                    contentView = LayoutInflater.from(mess_menu.this).inflate(R.layout.activity_boys_saturday, null);
                }
                else if (arrDays.equals("Sunday")) {
                    contentView = LayoutInflater.from(mess_menu.this).inflate(R.layout.activity_boys_sunday, null);
                }

                FrameLayout contentLayout = findViewById(R.id.constentLayout);
                contentLayout.removeAllViews();
                if (contentView != null) {
                    contentLayout.addView(contentView);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}