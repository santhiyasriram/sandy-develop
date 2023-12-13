package com.example.AirlineBooking.Service;

import com.example.AirlineBooking.entity.Room;

public interface RoomService {
	Room getRoomById(int roomId );
	Room addRoom(Room room);
	Room updateDb(int roomId,Room room);
	void deleteDb(int roomId);
}