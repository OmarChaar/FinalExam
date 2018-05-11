package com.example.finalexam.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author fouad
 */

public class ForecastInfo {

    @SerializedName("list")
    private List<ForecastItem> forecastItems;

    public List<ForecastItem> getForecastItems() {
        return forecastItems;
    }
}
