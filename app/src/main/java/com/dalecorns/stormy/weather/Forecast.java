package com.dalecorns.stormy.weather;

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

    Daily[] mDailies;
}
