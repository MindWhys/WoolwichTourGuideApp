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
public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create ArrayList for locations
        final ArrayList<Locality> local = new ArrayList<Locality>();
        local.add(new Locality(R.string.restaurant_dialarch_title, R.string.restaurant_dialarch_info, R.drawable.dial_arch));
        local.add(new Locality(R.string.restaurant_guardhouse_title, R.string.restaurant_guardhouse_info, R.drawable.guard_house));
        local.add(new Locality(R.string.restaurant_bluenile_title, R.string.restaurant_bluenile_info, R.drawable.blue_nile));
        local.add(new Locality(R.string.restaurant_jade_title, R.string.restaurant_jade_info, R.drawable.jade));
        local.add(new Locality(R.string.restaurant_granier_title, R.string.restaurant_granier_info, R.drawable.granier));
        local.add(new Locality(R.string.restaurant_artfix_title, R.string.restaurant_artfix_info, R.drawable.artfix));

        // attach ArrayList to adapter
        LocalityAdapter adapter = new LocalityAdapter(getActivity(), local, R.color.lightPurple, R.color.darkPurple);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
