package com.example.AirlineBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.AirlineBooking.entity.Payment;

public interface PaymentRepo  extends JpaRepository<Payment, Integer> {

	@Query(value =  "select * from Payment where paymentId =?" , nativeQuery = true)
	Payment findById(int paymentId);


}
