package com.example.AirlineBooking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.AirlineBooking.Service.PassengerService;
import com.example.AirlineBooking.entity.Passenger;

@RestController
public class PassengerController {

	@Autowired
	PassengerService passengerService;
	
	@GetMapping("/login")
	public Passenger login(@RequestHeader String email ,@RequestHeader String password) {
		return passengerService.login(email,password); 
	}
	
	@PostMapping("/post")
	public Passenger addPassenger(@RequestBody Passenger passenger ) {
		
		return passengerService.addPassenger(passenger);
	}
	
	@PutMapping("/update")
	public Passenger update(@RequestHeader String email ,@RequestBody Passenger passenger) {
		
		return passengerService.updateDb(email,passenger); 
	}
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String email) {
		passengerService.deleteDb(email);
		return "data deleted";
	}
	
	
}
