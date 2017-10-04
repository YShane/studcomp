/**
 * Created by samyy on 16-Aug-17.
 */

import { Injectable } from '@angular/core';
import {CanActivate, Router, ActivatedRouteSnapshot, RouterStateSnapshot} from "@angular/router";
import {Observable} from 'rxjs/Rx';

@Injectable()
export class LoginCheckerService implements CanActivate{

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean | Observable<boolean> | Promise<boolean> {

    return true;

  }

    constructor(router: Router) { }

}
