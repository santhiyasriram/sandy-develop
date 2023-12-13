package com.example.AirlineBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.AirlineBooking.entity.Passenger;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Integer> {

	@Query(value =  "select * from Passenger where email =?" , nativeQuery = true)
	Passenger findByEmail(String email);

	
	
	
}