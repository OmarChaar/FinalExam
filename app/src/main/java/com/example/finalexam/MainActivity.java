package com.example.finalexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.finalexam.api.ApiManager;
import com.example.finalexam.models.WeatherInfo;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private ApiManager apiManager;

    private Gson gson = new Gson();

    private TextView textView_ArtistName;
    private TextView textView_SongName;

    private ImageView imageView_SongTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiManager = new ApiManager();


        textView_ArtistName = findViewById(R.id.textView_ArtistName);
        textView_SongName = findViewById(R.id.textView_SongName);

        imageView_SongTitle = findViewById(R.id.imageView_SongTitle);

        apiManager.getWeatherAtCoordinates().enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if(response.isSuccessful()) {
                    String json = response.body().string();
                    final WeatherInfo artistName = gson.fromJson(json, WeatherInfo.class);
                    String name = artistName.getData().get(0).getArtistName();
                    String song = artistName.getData().get(0).getSong();

                    textView_ArtistName.setText("Artist Name: " + name);
                    textView_SongName.setText("Song Name: " + song);


//                    Log.d("HERE", " " + imageURL);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            String imageURL = artistName.getData().get(0).getImageURL();
                            Picasso.with(MainActivity.this).load(imageURL).into(imageView_SongTitle);
                        }
                    });

                }
            }
        });
    }
}
