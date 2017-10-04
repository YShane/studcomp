/**
 * Created by samyy on 15-Aug-17.
 */
import { NgModule } from '@angular/core';
import { BsDropdownModule } from 'ngx-bootstrap/dropdown';
import { ButtonsModule } from 'ngx-bootstrap/buttons';



@NgModule({
    imports: [
      BsDropdownModule,
      ButtonsModule
    ],
    exports: [
      BsDropdownModule,
      ButtonsModule
    ],
    providers: [],
})
export class MyCustomNgxBootstrapModule {

}
