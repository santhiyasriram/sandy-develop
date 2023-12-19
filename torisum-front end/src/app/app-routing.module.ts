import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { HotelBookingComponent } from './hotel-booking/hotel-booking.component';
import { AirlineBookingComponent } from './airline-booking/airline-booking.component';
import { PaymentComponent } from './payment/payment.component';
import { SingupComponent } from './singup/singup.component';

const routes: Routes = [
  {path:"",pathMatch:'full',redirectTo:'home'},
  {path:'login',component:LoginComponent},
  {path:'home',component:HomeComponent},
  {path:'hotel-booking',component:HotelBookingComponent},
  {path:'airline-booking',component:AirlineBookingComponent},
  {path:'payment',component:PaymentComponent},
  
  {path:'singup',component:SingupComponent},

  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
