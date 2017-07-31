/**
 * Created by samyy on 17-Jul-17.
 */

import {Injectable} from '@angular/core'
import {User} from "../model/user";

@Injectable()
export class LoginService {

  private _token : string;
  private _loggedInUser : User;

  constructor(){
    this._token = null;
  }

  set loggedInUser (user: User) {
    this._loggedInUser = user;
    localStorage.setItem('loggedInUser', JSON.stringify(user));
  }

  get loggedInUser (): User {
  if(this._loggedInUser==null){
    this._loggedInUser = JSON.parse(localStorage.getItem('loggedInUser'));
  }else {

  }
  return this._loggedInUser;
  }
  //getters and setters must have the same output/params
  set token (value: string) {
    this._token = value;
  }

  get token () : string {

    if(this._token==null){
      this._token = 'null';
    }else {

    }
    return this._token;
  }

}
