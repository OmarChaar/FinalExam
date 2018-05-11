package com.example.finalexam.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author fouad
 */

public class DescriptionInfo {

    @SerializedName("artist")
    private String artist;

    @SerializedName("song")
    private String song;

    @SerializedName("imageURL")
    private String imageURL;

    public String getArtistName() {
        return artist;
    }

    public String getSong() { return song;}

    public String getImageURL() { return imageURL;}


}
