import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { AirlineBooking } from './airline-booking';

@Injectable({
  providedIn: 'root'
})
export class AirlineService {
  airline(booking: number | undefined) {
    throw new Error('Method not implemented.');
  }

  private AirlineUrl: string;

  constructor(private http: HttpClient) {
    this.AirlineUrl = 'http://localhost:8084/postbook';
  }

  public findAll(): Observable<AirlineBooking[]> {
    return this.http.get<AirlineBooking[]>(this.AirlineUrl);
  }

  public save(airline: AirlineBooking) {
    return this.http.post<AirlineBooking>(this.AirlineUrl, airline);
  }
}
