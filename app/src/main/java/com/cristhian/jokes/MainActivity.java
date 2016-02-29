package com.cristhian.jokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.cristhian.JokerGenerate;
import com.cristhian.jokedisplay.JokeDisplayActivity;

public class MainActivity extends AppCompatActivity {

    private String mJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     *
     */
    private void getJoke() {
        JokerGenerate joker = new JokerGenerate();
        String tempJoke = joker.getJoker();
        if (tempJoke != null && !tempJoke.equalsIgnoreCase("")) {
            mJoke = tempJoke;
        }
    }

    /**
     * @param view
     */
    public void launchJokeDisplayLibActivity(View view) {
        getJoke();
        Intent intent = new Intent(this, JokeDisplayActivity.class);
        Bundle mBundle = new Bundle();
        mBundle.putString("joke", mJoke);
        intent.putExtras(mBundle);
        startActivity(intent);
    }
}
