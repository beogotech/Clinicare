package com.beogotech.clinicare.geolocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GeolocationApplication {

	public static final Logger LOG = LoggerFactory.getLogger(GeolocationApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GeolocationApplication.class, args);
	}
}
