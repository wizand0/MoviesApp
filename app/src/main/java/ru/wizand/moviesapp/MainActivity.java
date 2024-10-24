package ru.wizand.moviesapp;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {


//    private final String URL1 = "https://api.kinopoisk.dev/v1.4/movie?token=MA3VDVZ-8ZX4FG3-P4YV9G2-EQ4KK7B&page=1&limit=10&sortField=rating.kp&sortType=-1&rating.kp=7-10";

//    private final String URL = "https://api.kinopoisk.dev/v1.4/movie?token=MA3VDVZ-8ZX4FG3-P4YV9G2-EQ4KK7B&page=1&limit=10&sortField=rating.kp&sortType=-1&sortField=votes.kp&sortType=-1&releaseYears.start=2013-2024&rating.kp=7-10";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiFactory.apiService.loadMovies()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<MovieResponce>() {
                    @Override
                    public void accept(MovieResponce movieResponce) throws Throwable {
                        Log.d("MainActivity", movieResponce.toString());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Throwable {
                        Log.d("MainActivity", throwable.toString());
                    }
                });
    }
}