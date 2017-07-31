/**
 * Created by samyy on 26-Jul-17.
 */
import {LoginComponent} from './login/login.component';
import {Routes, Route, RouterModule} from "@angular/router";

const appRoutes: Routes = [
  {
    path: '',
    component: LoginComponent
  }
];

export const routing = RouterModule.forRoot(appRoutes);
