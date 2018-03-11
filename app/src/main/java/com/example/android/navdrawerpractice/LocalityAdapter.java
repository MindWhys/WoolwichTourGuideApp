package com.example.android.navdrawerpractice;

import android.content.Context;
import android.support.v4.content.ContextCompat;
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

    /** Resource ID for the background color for this list of words */
    private int backgroundColorId;
    /** Resource ID for the background color of the Toolbar */
    private int toolbarColorId;

    public LocalityAdapter(Context context, ArrayList<Locality> local, int backgroundColorResourceId, int toolbarColorResourceId) {
        super(context, 0, local);
        // Takes the background color resource id from the fragment and makes it a variable for this class
        backgroundColorId = backgroundColorResourceId;
        toolbarColorId = toolbarColorResourceId;
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
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), toolbarColorId);
        // Set the background color of the text container View
        nameTextView.setBackgroundColor(color);

        // Find the TextView in the list_item.xml layout with the ID location_info.
        TextView infoTextView = (TextView) listItemView.findViewById(R.id.location_info);
        // Get the location name from the currentLocation object and set this text on
        // The location_info TextView.
        infoTextView.setText(currentLocation.getLocationInfo());
        int toolbarColor = ContextCompat.getColor(getContext(), backgroundColorId);
        // Set the background color of the text container View
        infoTextView.setBackgroundColor(toolbarColor);

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

        // Set the theme color for the list item
        //View textContainer = listItemView.findViewById(R.id.location_name);
        // Find the color that the resource ID maps to
        //int color = ContextCompat.getColor(getContext(), backgroundColorId);
        // Set the background color of the text container View
        //textContainer.setBackgroundColor(color);

        // Set the theme color for the fragment toolbar
        //View toolbarContainer = listItemView.findViewById(R.id.location_info);
        // Find the color that the resource ID maps to
        //int toolbarColor = ContextCompat.getColor(getContext(), toolbarColorId);
        // Set the background color of the text container View
        //toolbarContainer.setBackgroundColor(toolbarColor);

        return listItemView;
    }
}
