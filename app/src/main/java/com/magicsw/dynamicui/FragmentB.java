package com.magicsw.dynamicui;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by manikant.upadhyay on 2/18/2016.
 */
public class FragmentB extends Fragment {

    TextView tv1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tv1 = (TextView) getActivity().findViewById(R.id.description);
    }
    
    public void changeData(int i){
        Resources rs = getResources();
        String[] desc = rs.getStringArray(R.array.Description);
        tv1.setText(desc[i]);
    }
}
