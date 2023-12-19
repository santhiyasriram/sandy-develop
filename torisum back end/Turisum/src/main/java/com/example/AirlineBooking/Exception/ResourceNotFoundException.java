package com.example.AirlineBooking.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.ACCEPTED)
public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException() {
		super("Invalid credentials");
		
	}

	
	
}
