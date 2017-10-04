import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {routing} from './app.routing';
import {RouterModule} from "@angular/router";
import {FormsModule} from '@angular/forms';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MyOwnCustomMaterialModule} from './styleModules/material.module';
import {MyCustomNgxBootstrapModule} from './styleModules/ngxBootstrap.module';


import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component'
import { RegistrationComponent } from './registration/registration.component';
import {UserHubComponent} from "./userhub/userhub.component";

import {LoginCheckerService} from './login/login.checker.service';
import {LoginService} from './login/login.service';



@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    UserHubComponent,
    RegistrationComponent
  ],
  imports: [
    BrowserModule,
    RouterModule,
    FormsModule,
    routing,
    BrowserAnimationsModule,
    MyOwnCustomMaterialModule,
    MyCustomNgxBootstrapModule
  ],
  providers: [
    LoginService,
    LoginCheckerService

  ],

  bootstrap: [
    AppComponent
  ]
})
export class AppModule { }
