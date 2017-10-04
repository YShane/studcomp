import {NgModule} from '@angular/core';
import {
  MdButtonModule,
  MdCardModule,
  MdCheckboxModule,
  MdChipsModule,
  MdDatepickerModule,
  MdDialogModule,
  MdInputModule,
  MdListModule,
  MdMenuModule,
  MdNativeDateModule,
  MdProgressBarModule,
  MdRadioModule,
  MdRippleModule,
  MdSidenavModule,
  MdSnackBarModule,
  MdToolbarModule,
  MdTooltipModule
} from '@angular/material';

@NgModule({
  imports: [
    MdButtonModule,
    MdCheckboxModule,
    MdCardModule,
    MdInputModule,
    MdSidenavModule,
    MdToolbarModule,
    MdListModule,
    MdRippleModule,
    MdTooltipModule,
    MdChipsModule,
    MdDialogModule,
    MdMenuModule,
    MdProgressBarModule,
    MdDatepickerModule,
    MdNativeDateModule,
    MdRadioModule,
    MdSidenavModule
  ],
  exports: [
    MdButtonModule,
    MdCheckboxModule,
    MdCardModule,
    MdInputModule,
    MdSidenavModule,
    MdToolbarModule,
    MdListModule,
    MdRippleModule,
    MdTooltipModule,
    MdChipsModule,
    MdDialogModule,
    MdMenuModule,
    MdProgressBarModule,
    MdDatepickerModule,
    MdNativeDateModule,
    MdRadioModule,
    MdSnackBarModule
  ]
})
export class MyOwnCustomMaterialModule {
}
