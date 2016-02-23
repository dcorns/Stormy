package com.dalecorns.stormy.weather;

import android.os.Parcel;
import android.os.Parcelable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by dcorns on 2/13/16.
 */
public class Daily implements Parcelable{
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(mTime);
        dest.writeString(mIcon);
        dest.writeString(mSummary);
        dest.writeString(mTimeZone);
        dest.writeDouble(mHiTemp);
        dest.writeDouble(mLoTemp);
    }
    private Daily(Parcel in){
        //must be in same order as written
        mTime = in.readLong();
        mIcon = in.readString();
        mSummary = in.readString();
        mTimeZone = in.readString();
        mHiTemp = in.readDouble();
        mLoTemp = in.readDouble();
    }
    public static final Creator<Daily> CREATOR = new Creator<Daily>() {
        @Override
        public Daily createFromParcel(Parcel source) {
            return new Daily(source);
        }

        @Override
        public Daily[] newArray(int size) {
            return new Daily[size];
        }
    }
}
