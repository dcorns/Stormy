package com.dalecorns.stormy.weather;

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

    public double getHiTemp() {
        return mHiTemp;
    }

    public void setHiTemp(double hiTemp) {
        mHiTemp = hiTemp;
    }

    public double getLoTemp() {
        return mLoTemp;
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

    private String mTimeZone;
}
