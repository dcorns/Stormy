package com.dalecorns.stormy.weather;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by dcorns on 2/13/16.
 */
public class Daily {
    private long mTime;
    private String mSummary;
    private double mHiTemp;
    private double mLoTemp;
    private String mIcon;

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

    public int getHiTemp() {
        return (int) Math.round(mHiTemp);
    }

    public void setHiTemp(double hiTemp) {
        mHiTemp = hiTemp;
    }

    public int getLoTemp() {

        return (int) Math.round(mLoTemp);
    }

    public void setLoTemp(double loTemp) {
        mLoTemp = loTemp;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    public int getIconId(){
        return Forecast.getIconId(mIcon);
    }

    public String getDayOfTheWeek(){
        SimpleDateFormat formatter =new SimpleDateFormat("EEEE");
        formatter.setTimeZone(TimeZone.getTimeZone(mTimeZone));
        Date dateTime = new Date(mTime * 1000);
        return formatter.format(dateTime);
    }

    private String mTimeZone;
}
