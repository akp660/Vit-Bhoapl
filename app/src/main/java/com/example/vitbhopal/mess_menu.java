package com.example.vitbhopal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

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

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.spinner_view, arrDays);
        spinnerAdapter.setDropDownViewResource(R.layout.dropdown_view);
        spinner.setAdapter(spinnerAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String arrDays = spinner.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(), arrDays + " has been selected.", Toast.LENGTH_LONG).show();
                
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}