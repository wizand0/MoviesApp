package ru.wizand.moviesapp;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface ApiService {

    @GET("movie?token=MA3VDVZ-8ZX4FG3-P4YV9G2-EQ4KK7B&page=1&limit=10&sortField=rating.kp&sortType=-1&sortField=votes.kp&sortType=-1&releaseYears.start=2013-2024&rating.kp=7-10")
    Single<MovieResponce> loadMovies();
}
