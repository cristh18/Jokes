package com.cristhian.jokes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.cristhian.jokedisplay.JokeDisplayActivity;
import com.cristhian.jokes.network.EndpointsAsyncTask;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity implements JokeListener {

    private String mJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadAds();
        new EndpointsAsyncTask(this).execute(new Pair<Context, String>(this, "Manfred"));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * @param view
     */
    public void launchJokeDisplayLibActivity(View view) {
        Intent intent = new Intent(this, JokeDisplayActivity.class);
        Bundle mBundle = new Bundle();
        mBundle.putString("joke", mJoke);
        intent.putExtras(mBundle);
        startActivity(intent);
    }

    @Override
    public void onResponseSuccesfull(String response) {
        if (!TextUtils.isEmpty(response)) {
            mJoke = response;
        } else {
            mJoke = new String("");
        }
    }

    private void loadAds() {
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
