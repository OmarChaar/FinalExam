package com.example.finalexam.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author fouad
 */

public class WeatherInfo {

    @SerializedName("data")
    private List<DescriptionInfo> artistName;

    public List<DescriptionInfo> getData() {
        return artistName;
    }
}
