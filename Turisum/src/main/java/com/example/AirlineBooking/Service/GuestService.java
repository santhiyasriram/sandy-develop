package com.example.AirlineBooking.Service;

import com.example.AirlineBooking.entity.Guest;

public interface GuestService { 
	Guest login(String email, String password );


	Guest addGuest(Guest guest);

	Guest updateDb(String email,Guest guest);

	void deleteDb(String email);
}
