import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
 public headDate!:string;
  constructor() { }

  ngOnInit(): void {
    let date = new Date();
    const options = {weekday: 'long', year: 'numeric', month: 'long', day: 'numeric'} as const;
    this.headDate = date.toLocaleDateString('nl-NL', options);
  }

}
