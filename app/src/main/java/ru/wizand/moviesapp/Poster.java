package ru.wizand.moviesapp;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Poster implements Serializable {

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
