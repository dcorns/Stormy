package com.dalecorns.stormy.weather;

/**
 * Created by dcorns on 2/13/16.
 */
public class Hourly {
    private long mTime;
    private String mSummary;
    private double mTemperature;
    private String mIcom;
    private String mTimeZone;

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public double getTemperature() {
        return mTemperature;
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public String getIcom() {
        return mIcom;
    }

    public void setIcom(String icom) {
        mIcom = icom;
    }

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }
}