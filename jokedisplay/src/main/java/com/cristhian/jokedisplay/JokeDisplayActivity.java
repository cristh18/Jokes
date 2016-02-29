package com.cristhian.jokedisplay;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Cristhian on 2/28/2016.
 */
public class JokeDisplayActivity extends AppCompatActivity {

    private final String LOG_TAG = JokeDisplayActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);


        Intent intent = getIntent();
        String joke = intent.getStringExtra("joke");
        goToJokeDisplay(joke);
//        if (savedInstanceState != null) {
//            detailMovieFragment = (DetailMovieFragment) getFragmentManager().getFragment(savedInstanceState, "movieDetail");
//        } else {
//            detailMovieFragment = (DetailMovieFragment) getFragmentManager().findFragmentById(R.id.detail_movie_frag);
//        }

    }

    /**
     *
     */
    private void goToJokeDisplay(String joke) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        JokeDisplayFragment jokeDisplayFragment = new JokeDisplayFragment();
        jokeDisplayFragment.setmJoke(joke);
        fragmentTransaction.replace(R.id.content_main, jokeDisplayFragment);
        fragmentTransaction.commit();
    }

}

