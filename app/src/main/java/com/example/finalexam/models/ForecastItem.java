package com.example.finalexam.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author fouad
 */

public class ForecastItem {

    @SerializedName("main")
    private TempInfo tempInfo;

    @SerializedName("weather")
    private List<DescriptionInfo> weatherInfo;

    public TempInfo getTempInfo() {
        return tempInfo;
    }

    public List<DescriptionInfo> getWeatherInfo() {
        return weatherInfo;
    }
}
