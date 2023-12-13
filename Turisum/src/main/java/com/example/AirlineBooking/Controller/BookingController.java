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

import com.example.AirlineBooking.Service.BookingService;
import com.example.AirlineBooking.entity.Booking;

@RestController
public class BookingController {

	@Autowired
	BookingService bookingService;
	
	@GetMapping("/booking/{Id}")
	public Booking getBookingById(@PathVariable int passengerId) {
		return bookingService.getBookingById(passengerId); 
	}
	
	@PostMapping("/postbook")
	public Booking addBooking(@RequestBody Booking booking) {
		
		return bookingService.addBooking(booking);
	}
	
	@PutMapping("/updatebooking")
	public Booking update(@RequestHeader int passengerId ,@RequestBody Booking booking) {
		
		return bookingService.updateDb(passengerId ,booking); 
	}
	@DeleteMapping("/deletebooking")
	public String delete(@RequestHeader int passengerId) {
		bookingService.deleteDb(passengerId );
		return "data deleted";
	}
	
	
}
