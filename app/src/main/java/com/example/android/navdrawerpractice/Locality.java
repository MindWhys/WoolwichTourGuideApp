package com.example.android.navdrawerpractice;

/**
 * {@link Locality} represents a location that the user wants to find out about.
 *  It contains the name, info about and a picture of that location.
 */

class Locality {

    /** Name of the location */
    private final int locationName;

    /** Info about the location */
    private final int locationInfo;

    /** Image resource ID for the photo of the location */
    private int locationPhoto = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Locality object
     *
     * @param location_name is the name of the location in Woolwich
     *
     * @param location_info is further information about the location in Woolwich
     *
     * @param location_photo is a photo of the location in Woolwich
     */
    public Locality(int location_name, int location_info, int location_photo){
        locationName = location_name;
        locationInfo = location_info;
        locationPhoto = location_photo;
    }

    /**
     * Get the location name.
     */
    public int getLocationName(){return locationName;}

    /**
     * Get the location info.
     */
    public int getLocationInfo(){return locationInfo;}

    /**
     * Return the image resource ID for the photo of the location.
     */
    public int getImageResourceId() {return locationPhoto;}
    public boolean hasImage(){return locationPhoto != NO_IMAGE_PROVIDED;}
}
