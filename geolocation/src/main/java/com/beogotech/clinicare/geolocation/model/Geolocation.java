package com.beogotech.clinicare.geolocation.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *   Geolocation Entity class
 *   this class stores information about a location on earth.
 *   Locations are specified using latitude and longitude. The class includes
 *   a method for computing the distance between 2 locations.
 */
@Entity
public class Geolocation {

    private static final Logger LOG = LoggerFactory.getLogger(Geolocation.class);

    private static final double RADIUS_OF_EARTH= 6371000.00; // Earth radius in meters

    @Id
    @GeneratedValue
    private long id;
    private double latitude;
    private double longitude;


    // constructs a geolocation objet with the given latitude and longitude
    public Geolocation(double theLatitude, double theLongitude){
        this.latitude =theLatitude;
        this.longitude = theLongitude;

    }

    // returns the latitude of this geolocation
    public double getLatitude(){
        return this.latitude;
    }

    // returns the longitude of this geolocation
    public double getLongitude(){
        return this.longitude;
    }

    // returns a string representation of this geolocation
    public String getStringRepresentation(){
      return "latitude: " + latitude + ", longitude: " + longitude;
    }

    /**
     * returns the distance in meters between
     * this location and the given location
     */
    public double computeDistanceFrom(Geolocation location){

        LOG.debug("Entering method computeDistanceFrom", this);

        double distance = 0.0;

        if(location!=null){
            double lat1 = Math.toRadians(this.latitude);
            double long1 = Math.toRadians(this.longitude);
            double lat2 =Math.toRadians(location.getLatitude());
            double long2 = Math.toRadians(location.getLongitude());

            // apply the spherical law of cosines with a triangle composed of the
            // two locations and the north pole
            double theCos = Math.sin(lat1) * Math.sin(lat2) +
                    Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
            double arcLength = Math.acos(theCos);
            distance = arcLength * RADIUS_OF_EARTH;

        }

        LOG.debug("living method computeDistanceFrom", this);

        return distance;
    }


}
