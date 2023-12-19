package com.example.AirlineBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.AirlineBooking.entity.AirlineBooking;

@Repository
public interface AirlineBookingRepo extends JpaRepository<AirlineBooking, Integer> {

	@Query(value =  "select * from Booking where Id =?" , nativeQuery = true)
	AirlineBooking findById(int id);

	
	
	
}