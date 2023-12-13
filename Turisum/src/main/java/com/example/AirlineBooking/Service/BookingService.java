package com.example.AirlineBooking.Service;

import com.example.AirlineBooking.entity.Booking;

public interface BookingService { 


	Booking getBookingById(int passengerId);
	Booking addBooking( Booking booking);

	Booking updateDb(int PassengerId,Booking  booking);

	void deleteDb(int PassengerId);



}
