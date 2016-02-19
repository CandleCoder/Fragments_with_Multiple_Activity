package com.magicsw.dynamicui;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * Created by manikant.upadhyay on 2/18/2016.
 */
public class FragmentA extends Fragment implements AdapterView.OnItemClickListener {

    ListView list;

    communicator comm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        list= (ListView) getActivity().findViewById(R.id.listView);
        comm = (communicator) getActivity();
        ArrayAdapter adp = ArrayAdapter.createFromResource(getActivity(),R.array.Title,android.R.layout.simple_list_item_1);
        list.setAdapter(adp);
        list.setOnItemClickListener(this);
     }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
      comm.respond(i);
    }
}
