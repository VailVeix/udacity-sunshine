package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Complete (2) Display the weather forecast that was passed from MainActivity

        String weather = "";
        Intent intent = getIntent();

        if(intent != null){
            if(intent.hasExtra(Intent.EXTRA_TEXT)){
                weather = intent.getStringExtra(Intent.EXTRA_TEXT);
            }
        }

        TextView dailyWeather = (TextView) findViewById(R.id.weatherDaily);
        dailyWeather.setText(weather);
    }
}