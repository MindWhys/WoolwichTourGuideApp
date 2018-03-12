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
public class CultureFragment extends Fragment {

    public CultureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create ArrayList for locations
        final ArrayList<Locality> local = new ArrayList<>();
        local.add(new Locality(R.string.culture_assembly_title, R.string.culture_assembly_info, R.drawable.assembly));
        local.add(new Locality(R.string.culture_church_title, R.string.culture_church_info, R.drawable.church));
        local.add(new Locality(R.string.culture_bear_title, R.string.culture_bear_info, R.drawable.bear));
        local.add(new Locality(R.string.culture_barracks_title, R.string.culture_barracks_info, R.drawable.barracks));
        local.add(new Locality(R.string.culture_statue_title, R.string.culture_statue_info, R.drawable.statue));
        local.add(new Locality(R.string.culture_gatehouse_title, R.string.culture_gatehouse_info, R.drawable.gatehouse));

        // attach ArrayList to adapter
        LocalityAdapter adapter = new LocalityAdapter(getActivity(), local, R.color.lightOrange, R.color.darkOrange);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}