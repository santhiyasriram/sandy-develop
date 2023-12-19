package com.example.AirlineBooking.Service;

import com.example.AirlineBooking.entity.AirlineBooking;

public interface AirlineBookingService { 


	AirlineBooking getBookingById(int id);
	AirlineBooking addBooking( AirlineBooking airlineBooking);

	AirlineBooking updateDb(int id,AirlineBooking airlineBooking);

	void deleteDb(int id);



}
