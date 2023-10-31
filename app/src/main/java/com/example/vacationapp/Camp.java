package com.example.vacationapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView; // Import TextView
import androidx.appcompat.app.AppCompatActivity;

public class Camp extends AppCompatActivity {

    Button buttonCampWeb, buttonApi;
    TextView textViewStatus, textViewFact; // Declare TextViews

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camp_layout);

        // Initialize TextViews
        textViewStatus = findViewById(R.id.textViewStatus);
        textViewFact = findViewById(R.id.textViewFact);

        setupButtonCampWeb();
        setupButtonApi();
    }

    private void setupButtonApi() {
        buttonApi = findViewById(R.id.buttonApi);
        buttonApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}";

                textViewStatus.setText("API request sent");
                textViewFact.setText("");
            }
        });
    }

    private void setupButtonCampWeb() {
        buttonCampWeb = findViewById(R.id.buttonCampWeb);
        buttonCampWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.travelandleisure.com/trip-ideas/nature-travel/most-scenic-campgrounds-in-us";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}