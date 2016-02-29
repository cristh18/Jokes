package com.cristhian.jokedisplay;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Cristhian on 2/28/2016.
 */
public class JokeDisplayFragment extends Fragment {

    private final String LOG_TAG = JokeDisplayFragment.class.getSimpleName();

    protected String mJoke;

    public JokeDisplayFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_joke_display, container, false);
        TextView textViewJoke = (TextView) rootView.findViewById(R.id.textView_fragmentJokeDisplay_joke);
        if (mJoke!=null){
            textViewJoke.setText(getmJoke().toString());
        }else {
            textViewJoke.setText("");
        }
        return rootView;
    }

    public String getmJoke() {
        return mJoke;
    }

    public void setmJoke(String mJoke) {
        this.mJoke = mJoke;
    }
}
