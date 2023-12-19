import { Component } from '@angular/core';
import { AirlineBooking } from '../airline-booking';
import { AirlineService } from '../airline.service';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-airline-booking',
  templateUrl: './airline-booking.component.html',
  styleUrls: ['./airline-booking.component.css']
})
export class AirlineBookingComponent {
  
  firstName!: String;
  lastName!: String;
  email!: String;
  address!: String;
   PerferredAirline!: String;
PerferredSeating!: String;  
destination!: String;
departureDate!: String;
arrivalDate!: String;
name: any;
From: any;
username: any;
password: any;
  constructor(private router: Router,private http: HttpClient) {}
 
  booking() {
    console.log(this.firstName);
    console.log(this.lastName);
    console.log(this.email);
    console.log(this.address);
    console.log(this.PerferredAirline);
    console.log(this.PerferredSeating);
    console.log(this.destination);
    console.log(this.departureDate);
    console.log(this.arrivalDate);


 
    let bodyData = {
      firstName: this.firstName,
     lastName :this.lastName,
    email:this.email,
    address:this.address,
    PerferredAirline:this.PerferredAirline,
   PerferredSeating:this.PerferredSeating,
   destination:this.destination,
departureDate:this.departureDate,
arrivalDate:this.arrivalDate
    };
 
        this.http.post("http://localhost:8084/postbook", bodyData).subscribe(  (resultData: any) => {
        console.log(resultData);
 
        if (resultData.message == "Email not exits")
        {
      
          alert("Email not exits");
    
 
        }
        else if(resultData.message == "Login Success")
    
         {
          this.router.navigateByUrl('/home');
        }
        else
        {
          alert("Incorrect Email and Password not match");
        }
      });
    }
  }
