import {Player} from "./player.model";
import {Dealer} from "./dealer.model";

export class Table {
  tableId: number;
  players: Array<Player>;
  dealer: Dealer;
  totalPlayers: number;
}
