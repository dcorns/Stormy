package com.dalecorns.stormy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by dcorns on 2/12/16.
 */
public class CurrentWeather {
    private String mIcon;
    private long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;
    private String mTimeZone;

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    public String getIcon() {
        return mIcon;
    }

    public int getIconId(){
        int iconId;
        switch (mIcon){
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

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public long getTime() {
        return mTime;
    }

    public String getFormattedTime(){
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        Date dateTime = new Date(getTime() * 1000);
        return formatter.format(dateTime);
    }

    public void setTime(long time) {
        mTime = time;
    }

    public int getTemperature() {
        return (int) Math.round(mTemperature);
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public int getPrecipChance() {
        return (int) Math.round(mPrecipChance + 100);
    }

    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }
}
