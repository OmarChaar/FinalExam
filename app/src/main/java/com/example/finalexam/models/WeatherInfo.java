package com.example.finalexam.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author fouad
 */

public class WeatherInfo {

    @SerializedName("main")
    private TempInfo tempInfo;

    @SerializedName("weather")
    private List<DescriptionInfo> descriptionInfo;

    public TempInfo getTempInfo() {
        return tempInfo;
    }

    public List<DescriptionInfo> getDescriptionInfo() {
        return descriptionInfo;
    }
}
