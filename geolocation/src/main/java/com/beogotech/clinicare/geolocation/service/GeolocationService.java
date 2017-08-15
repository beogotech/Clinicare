package com.beogotech.clinicare.geolocation.service;

import com.beogotech.clinicare.geolocation.model.Geolocation;

import java.util.List;

public interface GeolocationService {

    Geolocation save(Geolocation newLocation);
    Geolocation update(Geolocation locationToUpdate);
    Geolocation findById(long id);
    Geolocation findByLatitudeAndAndLongitude(double latitude, double longitude);
    List<Geolocation> findAllByLatitude(double latitude);
    List<Geolocation> findAllByLongitude(double longitude);
}
