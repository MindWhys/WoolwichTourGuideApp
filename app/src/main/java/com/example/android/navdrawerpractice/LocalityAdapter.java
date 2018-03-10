package com.example.android.navdrawerpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Adapter for creating each individual list item
 */

public class LocalityAdapter extends ArrayAdapter<Locality>{

    public LocalityAdapter(Context context, ArrayList<Locality> local) {
        super(context, 0, local);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Get the {@link Locality} object located at this position in the list
        Locality currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID location_name.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.location_name);
        // Get the location name from the currentLocation object and set this text on
        // The location_name TextView.
        nameTextView.setText(currentLocation.getLocationName());

        // Find the TextView in the list_item.xml layout with the ID location_info.
        TextView infoTextView = (TextView) listItemView.findViewById(R.id.location_info);
        // Get the location name from the currentLocation object and set this text on
        // The location_info TextView.
        infoTextView.setText(currentLocation.getLocationInfo());

        // Find the ImageView in the list_item.xml layout with the ID location_photo
        ImageView photoView = (ImageView) listItemView.findViewById(R.id.location_photo);
        // Check if an image is provided for this word or not
        if(currentLocation.hasImage()){
            photoView.setImageResource(currentLocation.getImageResourceId());
            // Make sure the view is visible
            photoView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            photoView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
