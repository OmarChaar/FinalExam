package com.example.finalexam.api;

import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author fouad
 */

public class ApiManager {

    private OkHttpClient client;

    public ApiManager() {
        client = new OkHttpClient();
    }

    public Call getWeatherAtCoordinates(double latitude, double longitude) {
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("api.openweathermap.org")
                .addPathSegment("data")
                .addPathSegment("2.5")
                .addPathSegment("weather")
                .addQueryParameter("lat", String.valueOf(latitude))
                .addQueryParameter("lon", String.valueOf(longitude))
                .addQueryParameter("APPID", "33e206167fdb92a1ed1ef5d2b7d42995")
                .addQueryParameter("units", "metric")
                .build();


        Request request = new Request.Builder()
                .url(url)
                .build();

        return client.newCall(request);
    }

    public Call getWeatherForecastAtLocation(double latitude, double longitude) {
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("api.openweathermap.org")
                .addPathSegment("data")
                .addPathSegment("2.5")
                .addPathSegment("forecast")
                .addQueryParameter("lat", String.valueOf(latitude))
                .addQueryParameter("lon", String.valueOf(longitude))
                .addQueryParameter("APPID", "33e206167fdb92a1ed1ef5d2b7d42995")
                .addQueryParameter("units", "metric")
                .build();


        Request request = new Request.Builder()
                .url(url)
                .build();

        return client.newCall(request);
    }


}
