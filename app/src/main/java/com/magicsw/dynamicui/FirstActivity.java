package com.magicsw.dynamicui;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

public class FirstActivity extends Activity implements communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    @Override
    public void respond(int i) {
        FragmentManager fm = getFragmentManager();
        /*Fragment f2 = fm.findFragmentById(R.id.fragment2);
        f2.changeData(i);*/
        FragmentB f2 = (FragmentB) fm.findFragmentById(R.id.fragment2);
        f2.changeData(i);

    }
}
