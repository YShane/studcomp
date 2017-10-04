/**
 * Created by samyy on 08-Jul-17.
 */

import {Address} from './address';

export class User {
  public eMailAdress: string;
  public username: string;
  public password: string;
  public firstName : string;
  public middleName : string;
  public lastName : string;
  public dateOfBirth : Date;

  public address: Address;



  constructor (){

  }

}
