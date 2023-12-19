package com.example.AirlineBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.AirlineBooking.entity.HotelBooking;

@Repository
public interface HotelBookingRepo extends JpaRepository<HotelBooking, Integer> {

	@Query(value =  "select * from Room where Id =?" , nativeQuery = true)
	HotelBooking findById(int email);

	
	
	
}