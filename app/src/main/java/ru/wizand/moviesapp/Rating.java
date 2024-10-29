package ru.wizand.moviesapp;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Rating implements Serializable {

    @SerializedName("kp")
    private String kp;

    @SerializedName("imdb")
    private String imdb;

    @Override
    public String toString() {
        return "Rating{" +
                "kp='" + kp + '\'' +
                ", imdb='" + imdb + '\'' +
                '}';
    }

    public Rating(String imdb, String kp) {
        this.imdb = imdb;
        this.kp = kp;
    }

    public String getKp() {
        return kp;
    }

    public String getImdb() {
        return imdb;
    }
}
