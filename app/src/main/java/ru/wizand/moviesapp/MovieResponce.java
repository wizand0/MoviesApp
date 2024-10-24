package ru.wizand.moviesapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieResponce {

    @SerializedName("docs")
    private List<Movie> movies;

    @Override
    public String toString() {
        return "MovieResponce{" +
                "movies=" + movies +
                '}';
    }

    public MovieResponce(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
