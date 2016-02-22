package com.dalecorns.stormy.weather;

import com.dalecorns.stormy.R;

/**
 * Created by dcorns on 2/13/16.
 */
public class Forecast {
    Current mCurrent;
    Hourly[] mHourlies;

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Hourly[] getHourlies() {
        return mHourlies;
    }

    public void setHourlies(Hourly[] hourlies) {
        mHourlies = hourlies;
    }

    public Daily[] getDailies() {
        return mDailies;
    }

    public void setDailies(Daily[] dailies) {
        mDailies = dailies;
    }

    public static int getIconId(String iconString){
        int iconId;
        switch (iconString){
            case "clear-day": iconId = R.drawable.clear_day;
                break;
            case "clear-night": iconId = R.drawable.clear_night;
                break;
            case "rain": iconId = R.drawable.rain;
                break;
            case "snow": iconId = R.drawable.snow;
                break;
            case "sleet": iconId = R.drawable.sleet;
                break;
            case "wind": iconId = R.drawable.wind;
                break;
            case "fog": iconId = R.drawable.fog;
                break;
            case "cloudy": iconId = R.drawable.cloudy;
                break;
            case "partly-cloudy-day": iconId = R.drawable.partly_cloudy;
                break;
            case "partly-cloudy-night": iconId = R.drawable.partly_cloudy;
                break;
            case "hail": iconId = R.drawable.sleet;
                break;
            case "thunderstorm": iconId = R.drawable.cloudy_night;
                break;
            case "tornado": iconId = R.drawable.wind;
                break;
            default: iconId = R.drawable.clear_day;
                break;

        }

        return iconId;
    }

    Daily[] mDailies;
}
