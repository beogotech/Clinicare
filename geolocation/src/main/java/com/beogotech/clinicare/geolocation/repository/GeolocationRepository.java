package com.beogotech.clinicare.geolocation.repository;

import com.beogotech.clinicare.geolocation.model.Geolocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *      Geolocation repository
 *  this interface extends the JPA repository
 */
@Repository("GeolocationRepository")
public interface GeolocationRepository extends JpaRepository<Geolocation, Long> {

    Geolocation findById(long id);
    Geolocation findByLatitudeAndAndLongitude(double latitude, double longitude);
    List<Geolocation> findAllByLatitude(double latitude);
    List<Geolocation> findAllByLongitude(double longitude);

}
