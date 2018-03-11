package com.example.android.navdrawerpractice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToDoFragment extends Fragment {

    public ToDoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create ArrayList for locations
        final ArrayList<Locality> local = new ArrayList<Locality>();
        local.add(new Locality(R.string.todo_waterfront_title, R.string.todo_waterfront_info, R.drawable.ic_one));
        local.add(new Locality(R.string.todo_library_title, R.string.todo_library_info, R.drawable.ic_two));

        // attach ArrayList to adapter
        LocalityAdapter adapter = new LocalityAdapter(getActivity(), local, R.color.lightBlue, R.color.darkBlue);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

