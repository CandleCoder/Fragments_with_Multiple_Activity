package com.magicsw.flexibleui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.magicsw.fragments.FragmentB;

/**
 * Created by manikant.upadhyay on 2/19/2016.
 */
public class MainSubActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_main);

        Intent intent = getIntent();
        int index = intent.getIntExtra("clickIndex", 0);
        FragmentB fragmentB= (FragmentB) getFragmentManager().findFragmentById(R.id.fragment2);
        if(fragmentB!=null)
            fragmentB.changeData(index);
    }
}
