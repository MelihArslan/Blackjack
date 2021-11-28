import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {AppComponent} from './app.component';
import {HeaderComponent} from './header/header.component';
import {FooterComponent} from './footer/footer.component';
import {NavbarComponent} from './header/navbar/navbar.component';
import {SidebarComponent} from './sidebar/sidebar.component';
import {BodyComponent} from './body/body.component';
import {CardsComponent} from './cards/cards.component';
import {IconGridComponent} from './icon-grid/icon-grid.component';
import {CarouselComponent} from './carousel/carousel.component';
import {AppRoutingModule} from './app-routing.module';
import {LoginComponent} from './login/login.component';
import {RegisterComponent} from './register/register.component';
import {FormsModule} from "@angular/forms";
import {UserService} from "./services/user.service";
import {TableComponent} from './table/table.component';
import {GameService} from "./services/game.service";
import {HttpClientModule} from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    NavbarComponent,
    SidebarComponent,
    BodyComponent,
    CardsComponent,
    IconGridComponent,
    CarouselComponent,
    LoginComponent,
    RegisterComponent,
    TableComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [UserService, GameService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
