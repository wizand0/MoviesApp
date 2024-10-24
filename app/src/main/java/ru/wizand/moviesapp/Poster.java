package ru.wizand.moviesapp;

import com.google.gson.annotations.SerializedName;

public class Poster {

    @SerializedName("url")
    private String url;

    @Override
    public String toString() {
        return "Poster{" +
                "url='" + url + '\'' +
                '}';
    }

    public Poster(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}