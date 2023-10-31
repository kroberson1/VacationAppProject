package com.example.vacationapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Travel extends AppCompatActivity {

    Button buttonTravelWeb;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.travel_layout);

        setupButtonTravelWeb();


    }

    private void setupButtonTravelWeb() {

        buttonTravelWeb = findViewById(R.id.buttonTravelWeb);
        buttonTravelWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.worldpackers.com/articles/places-to-travel-outside-the-us";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);


            }
        });
    }

}