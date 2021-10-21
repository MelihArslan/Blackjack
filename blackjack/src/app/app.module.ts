import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { TestComponent } from './header/test/test.component';
import { FooterComponent } from './footer/footer.component';
import { NavbarComponent } from './header/navbar/navbar.component';
import { BodyComponent } from './body/body.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    TestComponent,
    FooterComponent,
    NavbarComponent,
    BodyComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
