package com.example.AirlineBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.AirlineBooking.entity.Room;

@Repository
public interface RoomRepo extends JpaRepository<Room, Integer> {

	@Query(value =  "select * from Room where roomId =?" , nativeQuery = true)
	Room findById(int roomId);

	
	
	
}