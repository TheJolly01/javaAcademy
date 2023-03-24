import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { CiaoBelloComponent } from './ciao-bello/ciao-bello.component';

@NgModule({
  declarations: [
    AppComponent,
    CiaoBelloComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
