import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {AppComponent} from './app.component';
import {HeaderComponent} from './header/header.component';
import {FooterComponent} from './footer/footer.component';
import {NavbarComponent} from './header/navbar/navbar.component';
import {SidebarComponent} from './sidebar/sidebar.component';
import {CardsComponent} from './cards/cards.component';
import {IconGridComponent} from './icon-grid/icon-grid.component';
import {CarouselComponent} from './carousel/carousel.component';
import {AppRoutingModule} from './app-routing.module';
import {LoginComponent} from './login/login.component';
import {RegisterComponent} from './register/register.component';
import {FormsModule} from "@angular/forms";
import {UserService} from "./services/user.service";
import {TableroomComponent} from './tableroom/tableroom.component';
import {BasicgameComponent} from './basicgame/basicgame.component';
import {HomeComponent} from './home/home.component';
import {AlertModule} from "ngx-bootstrap/alert";
import {ModalModule} from "ngx-bootstrap/modal";
import {BodyComponent} from "./body/body.component";

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    NavbarComponent,
    SidebarComponent,
    BasicgameComponent,
    HomeComponent,
    BodyComponent,
    CardsComponent,
    IconGridComponent,
    CarouselComponent,
    LoginComponent,
    RegisterComponent,
    TableroomComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    AlertModule,
    ModalModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
