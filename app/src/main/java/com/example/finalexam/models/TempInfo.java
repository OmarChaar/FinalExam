package com.example.finalexam.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author fouad
 */

public class TempInfo {

    @SerializedName("temp")
    private Double temperature;

    @SerializedName("temp_min")
    private Double tempMin;

    @SerializedName("temp_max")
    private Double tempMax;


    public Double getTemperature() {
        return temperature;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }
}
