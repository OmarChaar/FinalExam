package com.example.finalexam.api;

import android.util.Log;

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

    public Call getWeatherAtCoordinates() {
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("nrjlebanon.com")
                .addPathSegment("radioshowaghani")
                .addPathSegment("appsapi.php")
                .build();

        Request request = new Request.Builder()
                .url(url)
                .build();

        return client.newCall(request);
    }
}
