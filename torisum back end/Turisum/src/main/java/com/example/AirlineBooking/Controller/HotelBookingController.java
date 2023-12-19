package com.example.AirlineBooking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.AirlineBooking.Service.HotelBookingService;
import com.example.AirlineBooking.entity.HotelBooking;

@RestController
public class HotelBookingController {

	@Autowired
	HotelBookingService hotelBookingService;
	
	@GetMapping("/room/{Id}")
	public HotelBooking getRoomById(@PathVariable int  email) {
		return hotelBookingService.getRoomById( email); 
	}
	
	@PostMapping("/postroom")
	public HotelBooking addRoom(@RequestBody HotelBooking hotelBooking) {
		
		return hotelBookingService.addRoom(hotelBooking);
	}
	
	@PutMapping("/updateroom")
	public HotelBooking update(@RequestHeader int  email ,@RequestBody HotelBooking hotelBooking) {
		
		return hotelBookingService.updateDb( email ,hotelBooking); 
	}
	@DeleteMapping("/deleteroom")
	public String delete(@RequestHeader int  email ) {
		hotelBookingService.deleteDb( email );
		return "data deleted";
	}
	
	
}

