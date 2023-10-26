package com.example.vacationapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Cruise extends AppCompatActivity {

    Button buttonCruiseWeb;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cruise_layout);

        setupButtonCruiseWeb();


    }

    private void setupButtonCruiseWeb() {

        buttonCruiseWeb = findViewById(R.id.buttonCruiseWeb);
        buttonCruiseWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.forbes.com/sites/forbes-personal-shopper/2023/06/27/best-cruises-for-families/?sh=1a41cff3ef1b";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);


            }
        });
    }

    }

