package com.example.AirlineBooking.Service;

import com.example.AirlineBooking.entity.Passenger;

public interface PassengerService {
	 Passenger addPassenger( Passenger  passenger);
	 Passenger updateDb(String email ,Passenger passenger);
	void deleteDb(String email);
	Passenger login(String email, String password);
}