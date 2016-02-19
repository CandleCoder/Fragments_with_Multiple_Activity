package com.magicsw.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.magicsw.flexibleui.R;

/**
 * Created by manikant.upadhyay on 2/19/2016.
 */
public class FragmentA extends Fragment implements AdapterView.OnItemClickListener {

    ListView listView;

    Communicator communicator;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_a,container,false);
        listView= (ListView) view.findViewById(R.id.listView);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.topic, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        return view;
    }

    public void setCommunicator(Communicator communicator){
        this.communicator = communicator;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
      communicator.respond(i);
    }

    public interface Communicator{
      public  void respond(int clickIndex);
    }
}
