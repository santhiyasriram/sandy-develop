package com.example.AirlineBooking.Service;

import com.example.AirlineBooking.entity.HotelBooking;

public interface HotelBookingService {
	HotelBooking getRoomById(int email );
	HotelBooking addRoom(HotelBooking hotelBooking);
	HotelBooking updateDb(int email,HotelBooking hotelBooking);
	void deleteDb(int email);
}