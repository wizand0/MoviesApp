package ru.wizand.moviesapp;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private MainViewModel mainViewModel;
    private static final String TAG = "MainActivity";

//    private final String URL1 = "https://api.kinopoisk.dev/v1.4/movie?token=MA3VDVZ-8ZX4FG3-P4YV9G2-EQ4KK7B&page=1&limit=10&sortField=rating.kp&sortType=-1&rating.kp=7-10";

//    private final String URL = "https://api.kinopoisk.dev/v1.4/movie?token=MA3VDVZ-8ZX4FG3-P4YV9G2-EQ4KK7B&page=1&limit=10&sortField=rating.kp&sortType=-1&sortField=votes.kp&sortType=-1&releaseYears.start=2013-2024&rating.kp=7-10";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        mainViewModel.getMovies().observe(this, new Observer<List<Movie>>() {
            @Override
            public void onChanged(List<Movie> movies) {
                Log.d(TAG, movies.toString());
            }
        });
        mainViewModel.loadMovies();
    }
}