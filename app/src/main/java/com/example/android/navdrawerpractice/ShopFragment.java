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
public class ShopFragment extends Fragment {

    public ShopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create ArrayList for locations
        final ArrayList<Locality> local = new ArrayList<>();
        local.add(new Locality(R.string.shop_tk_title, R.string.shop_tk_info, R.drawable.tkmaxx));
        local.add(new Locality(R.string.shop_bookworks_title, R.string.shop_bookworks_info, R.drawable.works));
        local.add(new Locality(R.string.shop_cex_title, R.string.shop_cex_info, R.drawable.cex));
        local.add(new Locality(R.string.shop_tesco_title, R.string.shop_tesco_info, R.drawable.tesco));
        local.add(new Locality(R.string.shop_whsmith_title, R.string.shop_whsmith_info, R.drawable.whsmith));
        local.add(new Locality(R.string.shop_bhs_title, R.string.shop_bhs_info, R.drawable.bhs));

        // attach ArrayList to adapter
        LocalityAdapter adapter = new LocalityAdapter(getActivity(), local, R.color.lightYellow, R.color.darkYellow);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

