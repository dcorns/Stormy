package com.dalecorns.stormy.ui;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dalecorns.stormy.R;
import com.dalecorns.stormy.weather.Hourly;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HourlyForecastActivity extends AppCompatActivity {

    private Hourly[] mhours;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_forecast);
        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.HOURLY_FORECAST);
        mhours = Arrays.copyOf(parcelables, parcelables.length, Hourly[].class);


    }
}
