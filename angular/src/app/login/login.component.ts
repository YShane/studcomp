/**
 * Created by samyy on 06-Jul-17.
 */
import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router, Route} from '@angular/router';
import {Http} from '@angular/http';
import {User} from '../model/user';
import {LoginService} from '../login/login.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit{
  private user = new User;

  constructor( private loginService: LoginService, private router: Router, private route: ActivatedRoute){

  }
//Use for calls you want to make on start like loadAllAdmins in SEPBoard
  ngOnInit(){

  }

  public login() : void {

    this.loginService.token = this.generateDummyToken();
    this.loginService.loggedInUser = this.user;
    console.log(this.user);

    this.router.navigate(['userhub'], {relativeTo: this.route})
  }

  private generateDummyToken(): string{

    const  tokes : string = 'token';

    return tokes;
  }

}
