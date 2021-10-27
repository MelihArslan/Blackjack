export class User {
  firstname: String;
  lastname: String;
  emailaddress: String;
  password: String;
  dateOfBirth: Date;
  gender: String;
  balance: number;

  constructor(firstname: String, lastname: String, emailaddress: String, password: String, dateOfBirth: Date, gender?: String, balance?: number) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.emailaddress = emailaddress;
    this.password  = password;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
    this.balance = balance;
  }


  setBalance(value: number) {
    this.balance = value;
  }


}
