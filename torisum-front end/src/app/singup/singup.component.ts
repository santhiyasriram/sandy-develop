import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-singup',
  templateUrl: './singup.component.html',
  styleUrls: ['./singup.component.css']
})
export class SingupComponent {
  password: string ="";
username: any;
email: any;
  constructor(private router: Router,private http: HttpClient) {}
 
  Login() {
    console.log(this.username);
    console.log(this.password);
 
    let bodyData = {
      username: this.username,
      password: this.password,
    };
 
        this.http.post("http://localhost:8084/postuser", bodyData).subscribe(  (resultData: any) => {
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


