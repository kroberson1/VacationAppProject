package com.example.vacationapp;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonCruise;
    Button buttonCamping;
    Button buttonTravel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCruise = findViewById(R.id.buttonCruise);
        buttonCamping = findViewById(R.id.buttonCamping);
        buttonTravel = findViewById(R.id.buttonTravel);

        buttonCruise.setOnClickListener(view -> {
            Log.d("MainActivity", "Cruise button clicked");
            Intent cruiseActIntent = new Intent(MainActivity.this, Cruise.class);
            startActivity(cruiseActIntent);
        });

        buttonCamping.setOnClickListener(view -> {
            Log.d("MainActivity", "Camp button clicked");
            Intent campActIntent = new Intent(MainActivity.this, Camp.class);
            startActivity(campActIntent);
        });

        buttonTravel.setOnClickListener(view -> {
            Log.d("MainActivity", "Camp button clicked");
            Intent travelActIntent = new Intent(MainActivity.this, Travel.class);
            startActivity(travelActIntent);
        });


    }


}