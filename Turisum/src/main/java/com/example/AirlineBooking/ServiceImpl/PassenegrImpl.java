package com.example.AirlineBooking.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AirlineBooking.Exception.ResourceNotFoundException;
import com.example.AirlineBooking.Repository.PassengerRepo;
import com.example.AirlineBooking.Service.PassengerService;
import com.example.AirlineBooking.entity.Passenger;

@Service

public class PassenegrImpl  implements PassengerService {

	@Autowired
	PassengerRepo passengerRepo;
	
	public Passenger login(String email, String password) {
		 Passenger s = 	passengerRepo.findByEmail(email);;
		 
		 if(s!=null) {
			 if(s.getPassword().equals(password)) {
				 return s;
			 }else {
				throw new ResourceNotFoundException();
			}
		 }else {
			 throw new ResourceNotFoundException();
		 }
	  
	}

	public Passenger addPassenger( Passenger passenger) {
		return passengerRepo.save( passenger);
	}

	public Passenger updateDb(String email,Passenger passenger) {
		
		
		Passenger s1 = 	passengerRepo.findByEmail(email);
		
		if(s1!=null) {
			s1.setFirstName(passenger.getFirstName());   
			s1.setLastName(passenger.getLastName());
			s1.setPassword(passenger.getPassword());
		return 	passengerRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	public void deleteDb(String email) {
	
		
		Passenger s2 = 	passengerRepo.findByEmail(email);
		
		if(s2!=null) {
			passengerRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}}

