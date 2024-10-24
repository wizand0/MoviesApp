package ru.wizand.moviesapp;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

//    @GET("movie?rating.kp=7-10&sortField=votes.kp&sortType=-1&page=2&limit=5")
//    @Headers("X-API-KEY:GBKGD9T-CWK49HW-QS5WDW6-GBQW6JB")

    @GET("movie?token=MA3VDVZ-8ZX4FG3-P4YV9G2-EQ4KK7B&limit=10&sortField=rating.kp&sortType=-1&sortField=votes.kp&sortType=-1&releaseYears.start=2013-2024&rating.kp=7-10")
    Single<MovieResponce> loadMovies(@Query("page") int page);
}