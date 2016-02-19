package com.magicsw.flexibleui;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;

import com.magicsw.fragments.FragmentA;
import com.magicsw.fragments.FragmentB;

public class MainActivity extends Activity implements FragmentA.Communicator{

    FragmentA fragmentA;
    FragmentB fragmentB;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getFragmentManager();
        fragmentA = (FragmentA) fragmentManager.findFragmentById(R.id.fragment);
        fragmentA.setCommunicator(this);
    }

    @Override
    public void respond(int clickIndex) {
     fragmentB= (FragmentB) fragmentManager.findFragmentById(R.id.fragment2);

        if(fragmentB !=null && fragmentB.isVisible()){
            //Do nothing

            fragmentB.changeData(clickIndex);
        }
        else {
            Intent intent = new Intent(this,MainSubActivity.class);
            intent.putExtra("clickIndex", clickIndex);
            startActivity(intent);
        }
    }
}
