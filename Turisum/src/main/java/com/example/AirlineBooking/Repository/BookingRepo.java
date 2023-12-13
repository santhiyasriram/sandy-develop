package com.example.AirlineBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.AirlineBooking.entity.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {

	@Query(value =  "select * from Booking where passengerId =?" , nativeQuery = true)
	Booking findById(int passengerId);

	
	
	
}