package com.example.vitbhopal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class hostel_selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostel_selection);

        LottieAnimationView lottieAnimationView = findViewById(R.id.lottieAnimationView3);
        lottieAnimationView.setOnClickListener(view -> vtop());

    }

    public void vtop(){
        Intent intent = new Intent(hostel_selection.this, mess_menu.class);
        startActivity(intent);
    }
}