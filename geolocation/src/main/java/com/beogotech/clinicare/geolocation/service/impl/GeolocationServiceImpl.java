package com.beogotech.clinicare.geolocation.service.impl;

import com.beogotech.clinicare.geolocation.model.Geolocation;
import com.beogotech.clinicare.geolocation.repository.GeolocationRepository;
import com.beogotech.clinicare.geolocation.service.GeolocationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeolocationServiceImpl implements GeolocationService{

    private static final Logger LOG = LoggerFactory.getLogger(GeolocationServiceImpl.class);

    @Autowired
    private GeolocationRepository geolocationRepository;


    @Override
    public Geolocation save(Geolocation newLocation) {

        return null;
    }

    @Override
    public Geolocation update(Geolocation locationToUpdate) {
        return null;
    }

    @Override
    public Geolocation findById(long id) {
        return null;
    }

    @Override
    public Geolocation findByLatitudeAndAndLongitude(double latitude, double longitude) {
        return null;
    }

    @Override
    public List<Geolocation> findAllByLatitude(double latitude) {
        return null;
    }

    @Override
    public List<Geolocation> findAllByLongitude(double longitude) {
        return null;
    }
}
