package com.example.AirlineBooking.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AirlineBooking.Exception.ResourceNotFoundException;
import com.example.AirlineBooking.Repository.PaymentRepo;
import com.example.AirlineBooking.Service.PaymentService;
import com.example.AirlineBooking.entity.Payment;
@Service
public class PaymentImpl implements PaymentService {


	@Autowired
	PaymentRepo paymentRepo;
	
	public Payment getPaymentById(int  paymentId) {
		Optional<Payment> rm=Optional.ofNullable(paymentRepo.findById( paymentId));
		Payment payment;
		if(rm.isPresent())
		{
			payment=rm.get();
		}else {
				throw new ResourceNotFoundException();
			}
		return payment;
	  
	}

	public Payment addPayment( Payment payment) {
		return paymentRepo.save( payment);
	}

	public Payment updateDb(int paymentId,Payment payment) {
		
		
		Payment s1 = paymentRepo.findById( paymentId);
		
		if(s1!=null) {
			s1.setPrice(payment.getPrice());   
			s1.setPaymentType(payment.getPaymentType());
			s1.setPassengerId(payment.getPaymentId());
		return paymentRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	public void deleteDb(int paymentId) {
	
		
		Payment s2 = paymentRepo.findById( paymentId);
		
		if(s2!=null) {
			paymentRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}}
