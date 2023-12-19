package com.example.AirlineBooking.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AirlineBooking.Exception.ResourceNotFoundException;
import com.example.AirlineBooking.Repository.HotelBookingRepo;
import com.example.AirlineBooking.Service.HotelBookingService;
import com.example.AirlineBooking.entity.HotelBooking;

@Service
public class HotelBookingImpl implements HotelBookingService {


	@Autowired
	HotelBookingRepo hotelBookingRepo;
	
	public HotelBooking getRoomById(int email) {
		Optional<HotelBooking> rm=Optional.ofNullable(hotelBookingRepo.findById(email));
		HotelBooking hotelBooking;
		if(rm.isPresent())
		{
			 hotelBooking=rm.get();
		}else {
				throw new ResourceNotFoundException();
			}
		return hotelBooking;
	  
	}

	public HotelBooking addRoom(HotelBooking hotelBooking) {
		return  hotelBookingRepo.save(hotelBooking);
	}

	public HotelBooking updateDb(int email,HotelBooking hotelBooking) {
		
		
		HotelBooking s1 = hotelBookingRepo.findById(email);
		
		if(s1!=null) {
			s1.setRoomType(hotelBooking.getRoomType());   
			s1.setHour(hotelBooking.getHour());
			s1.setPrice(hotelBooking.getPrice());
			s1.setFirstName(hotelBooking.getFirstName());
			s1.setLastName(hotelBooking.getLastName());
			s1.setAddress(hotelBooking.getAddress());
		return hotelBookingRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	public void deleteDb(int email) {
	
		
		HotelBooking s2 = hotelBookingRepo.findById(email);
		
		if(s2!=null) {
			hotelBookingRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}
	
}
