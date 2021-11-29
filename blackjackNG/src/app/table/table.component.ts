import { Component, OnInit } from '@angular/core';
import {Table} from "../models/table.model";
import {GameService} from "../services/game.service";
import {HttpErrorResponse} from "@angular/common/http";

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {
  public table: Table;

  constructor(private gameService: GameService) { }

  public getTable(): void {
    this.gameService.getTable().subscribe(
      (response: Table) => {
        this.table = response;
        console.log(JSON.stringify(response));
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  ngOnInit(): void {
    this.getTable();
  }

}
