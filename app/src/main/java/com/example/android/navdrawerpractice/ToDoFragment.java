package com.example.android.navdrawerpractice;

import android.os.Bundle;
import android.support.annotation.NonNull;
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
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create ArrayList for locations
        final ArrayList<Locality> local = new ArrayList<>();
        local.add(new Locality(R.string.todo_waterfront_title, R.string.todo_waterfront_info, R.drawable.waterfront));
        local.add(new Locality(R.string.todo_library_title, R.string.todo_library_info, R.drawable.library));
        local.add(new Locality(R.string.todo_hustlers_title, R.string.todo_hustlers_info, R.drawable.hustlers));
        local.add(new Locality(R.string.todo_under_one_roof_title, R.string.todo_under_one_roof_info, R.drawable.under_one_roof));
        local.add(new Locality(R.string.todo_reach_title, R.string.todo_reach_info, R.drawable.reach));
        local.add(new Locality(R.string.todo_go_karting_title, R.string.todo_go_karting_info, R.drawable.go_karting));

        // attach ArrayList to adapter
        LocalityAdapter adapter = new LocalityAdapter(getActivity(), local, R.color.lightBlue, R.color.darkBlue);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

