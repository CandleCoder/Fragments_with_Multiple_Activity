package com.magicsw.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.magicsw.flexibleui.R;

/**
 * Created by manikant.upadhyay on 2/19/2016.
 */
public class FragmentB extends Fragment {
    TextView text;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_b,container,false);
        text = (TextView) view.findViewById(R.id.textView);
        return view;
    }

    public void changeData(int clickIndex){
       String[] description = getResources().getStringArray(R.array.Description);
        text.setText(description[clickIndex]);
    }
}
