import {Player} from "../player.interface";

export class DeckDao {
  id: number;
  playerList: Player[];

  constructor(id: number, playerList) {
    this.id = id;
    this.playerList = playerList;
  }
}
