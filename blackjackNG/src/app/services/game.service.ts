import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Table} from "../models/table.model";
import {environment} from "../../environments/environment";

@Injectable()
export class GameService {
  private apiServerUrl =  environment.apiBaseUrl;

  constructor(private http: HttpClient) {}

  //get table from backend
  public getTable(): Observable<Table> {
    return this.http.get<Table>(`${this.apiServerUrl}/table`);
  }

  //post table
  public  addTable(table: Table){
    return this.http.post<Table>(`${this.apiServerUrl}/table`, table);
  }

  //get random card from deck and insert in hand
}
