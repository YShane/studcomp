/**
 * Created by samyy on 26-Jul-17.
 */
import {LoginComponent} from './login/login.component';
import  {UserHubComponent }from './userhub/userhub.component';
import {LoginCheckerService} from './login/login.checker.service';
import {Routes, Route, RouterModule} from "@angular/router";

const appRoutes: Routes = [
  {
    path: '',
    component: LoginComponent,
  },
  {
    path: 'userhub',
    component: UserHubComponent,
    canActivate: [LoginCheckerService]
  }
];

export const routing = RouterModule.forRoot(appRoutes, {enableTracing: true});
