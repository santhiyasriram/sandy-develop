package com.example.AirlineBooking.ServiceImpl;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AirlineBooking.Exception.ResourceNotFoundException;
import com.example.AirlineBooking.Repository.BookingRepo;
import com.example.AirlineBooking.Service.BookingService;
import com.example.AirlineBooking.entity.Booking;
@Service
public class BookingImpl implements BookingService {


	@Autowired
	BookingRepo bookingRepo;
	
	public Booking getBookingById(int passengerId) {
		Optional<Booking> rm=Optional.ofNullable(bookingRepo.findById(passengerId));
		Booking booking;
		if(rm.isPresent())
		{
			 booking=rm.get();
		}else {
				throw new ResourceNotFoundException();
			}
		return booking;
	  
	}

	public Booking addBooking(Booking booking) {
		return  bookingRepo.save(booking);
	}

	public Booking updateDb(int passengerId,Booking booking) {
		
		
		Booking s1 = bookingRepo.findById(passengerId);
		
		if(s1!=null) {
			s1.setFlightNumber(booking.getFlightNumber());   
			s1.setDeparture(booking.getDeparture());
			s1.setDestination(booking.getDestination());
			s1.setDepartureDate(booking.getDepartureDate());
			s1.setArrivalDate(booking.getArrivalDate());
			s1.setAirline(booking.getAirline());
		return bookingRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	public void deleteDb(int passengerId) {
	
		
		Booking s2 = bookingRepo.findById(passengerId);
		
		if(s2!=null) {
			bookingRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}

	
	
}
