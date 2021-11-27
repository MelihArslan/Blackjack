import {User} from "../models/user";
import {Injectable} from "@angular/core";

@Injectable()
export class UserService {
  users: User[] = [
    new User('Liv',
      'Stolwijk',
      'liv.stolwijk@example.com',
      'Welkom123',
      new Date('1973-06-22'),
      'female',
      300),
    new User('Alijda',
      'Nies',
      'alijda.nies@example.com',
      'Welkom123',
      new Date('1969-08-19'),
      'female',
      300),
    new User('Bieke',
      'Akyuz',
      'bieke.akyuz@example.com',
      'Welkom123',
      new Date('1987-02-02'),
      'female',
      300),
    new User('Iman',
      'Letteboer',
      'iman.letteboer@example.com',
      'Welkom123',
      new Date('1987-10-28'),
      'female',
      300)
  ];

  loginSuccessful: boolean;

  checkCredentials(username, password) {
    let userObj: User = this.users.find(u => u.emailaddress === username)
    if(userObj) {
      return userObj.emailaddress === username && userObj.password === password;
    } else {
      return false;
    }};

}
