package com.cristhian.jokes;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.cristhian.JokerGenerate;

/**
 * Created by Cristhian on 2/28/2016.
 */
public class HomeFragment extends Fragment {
    //implements View.OnClickListener {

    private final String LOG_TAG = HomeFragment.class.getSimpleName();

//    private View buttonGenerateJoke;

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
//        buttonGenerateJoke = rootView.findViewById(R.id.button_homeFragment_generateJoke);
//        buttonGenerateJoke.setOnClickListener(this);


        return inflater.inflate(R.layout.fragment_home, container, false);
    }


//    /**
//     * @param v
//     */
//    @Override
//    public void onClick(View v) {
//        Log.i(LOG_TAG, "Enter to event button");
//        switch (v.getId()) {
//            case R.id.button_homeFragment_generateJoke:
//                getJoke();
//                break;
//        }
//    }
//
//    /**
//     * @return
//     */
//    private void getJoke() {
//        JokerGenerate joker = new JokerGenerate();
//        Toast.makeText(getActivity(), joker.getJoker(), Toast.LENGTH_SHORT).show();
//    }
}
