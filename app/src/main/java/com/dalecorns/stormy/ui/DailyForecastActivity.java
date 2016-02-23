package com.dalecorns.stormy.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;

import com.dalecorns.stormy.R;
import com.dalecorns.stormy.adapters.DayAdapter;
import com.dalecorns.stormy.weather.Daily;

public class DailyForecastActivity extends ListActivity {

    private Daily[] mDays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        Intent intent = getIntent();
        mDays = intent.getParcelableArrayExtra(MainActivity.DAILY_FORECAST);

        DayAdapter dayAdapter = new DayAdapter(this, mDays);
    }

}
