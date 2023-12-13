package com.example.AirlineBooking.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private  int passengerId;
	@Column(length=20)
	private String passengerName;
	@Column(length=30)
    private int flightNumber;
	@Column(length=20)
    private String departure;
	@Column(length=34)
    private String destination;
	@Column(length=25)
    private String departureDate;
	@Column(length=22)
    private String arrivalDate;
	@Column(length=10)
    private String airline;
	@Column(length=30)
    
    
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	@Override
	public String toString() {
		return "Booking [passengerId=" + passengerId + ", passengerName=" + passengerName + ", flightNumber="
				+ flightNumber + ", departure=" + departure + ", destination=" + destination + ", departureDate="
				+ departureDate + ", arrivalDate=" + arrivalDate + ", airline=" + airline + "]";
	}
    
}
