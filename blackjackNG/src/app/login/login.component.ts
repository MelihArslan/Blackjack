import {Component, OnInit} from '@angular/core';
import {NgForm} from "@angular/forms";
import {UserService} from "../services/user.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginSuccess: boolean = this.userService.loginSuccessful;
  loginFailed: boolean;

  constructor(private userService: UserService, private router: Router) {
  }

  ngOnInit(): void {
  }

  onSubmit(form: NgForm) {

    this.loginSuccess = this.userService.checkCredentials(
      form.value.emailaddress,
      form.value.password)

    this.loginFailed = !this.userService.checkCredentials(
      form.value.emailaddress,
      form.value.password)

    setTimeout(() => {
      this.router.navigate(['login'])
        .then(() => {
          window.location.reload();
        });
    }, 2000)
  }

}
