import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { LoginComponent } from './login/login.component';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { UserService } from './user-service.service';
import { DataTablesModule } from 'angular-datatables';
import { HomeComponent } from './home/home.component';
import { PaymentComponent } from './payment/payment.component';
import { AirlineBookingComponent } from './airline-booking/airline-booking.component';
import { HotelBookingComponent } from './hotel-booking/hotel-booking.component';
import { HttpClientModule } from '@angular/common/http';
import { UserListComponent } from './user-list/user-list.component';
import { SingupComponent } from './singup/singup.component'; 



@NgModule({
  declarations: [
    AppComponent,PaymentComponent,AirlineBookingComponent,
    HotelBookingComponent,
    LoginComponent,
    HomeComponent,
    UserListComponent,
    SingupComponent
    
  
  ],
  imports: [
    BrowserModule,HttpClientModule,
    AppRoutingModule,
    FormsModule,ReactiveFormsModule,
    HttpClientModule,DataTablesModule 
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
