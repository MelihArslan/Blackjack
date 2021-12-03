import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Deck} from "../models/deck.interface";
import {PlayerDao} from "../models/dao/PlayerDao";
import {Observable} from "rxjs";

@Injectable()
export class BlckgameserviceService {

  constructor(public http: HttpClient) {
  }
  private game: Deck;
  private player: PlayerDao;
  public allGame(): Observable<any> {
    return this.http.get('http://localhost:8080/api/decks');
  }

  public joinGame(): Observable<any> {
    return this.http.post('http://localhost:8080/api/game/' + this.game.id + "/join-game", this.getPlayer());
  }

  public setGame(newGame): void {
    this.game = newGame
  }

  public getGame(): Deck {
    return this.game;
  }

  public newPlayer(playerName: string): void {
    this.player = new PlayerDao(playerName, this.game);
  }

  public getPlayer(): PlayerDao {
    return this.player;
  }
}
