package com.example.AirlineBooking.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.AirlineBooking.Service.GuestService;
import com.example.AirlineBooking.entity.Guest;



@RestController
public class GuestController {

	@Autowired
	GuestService guestService;
	
	@GetMapping("/loginGuest")
	public Guest login(@RequestHeader String email ,@RequestHeader String password) {
		return guestService.login(email,password); 
	}
	
	@PostMapping("/postGuest")
	public Guest addGuest(@RequestBody Guest guest) {
		
		return guestService.addGuest(guest);
	}
	
	@PutMapping("/updateGuest")
	public Guest update(@RequestHeader String email ,@RequestBody Guest guest) {
		
		return guestService.updateDb(email,guest); 
	}
	@DeleteMapping("/deleteGuest")
	public String delete(@RequestHeader String email) {
		guestService.deleteDb(email);
		return "data deleted";
	}
	
	
}
