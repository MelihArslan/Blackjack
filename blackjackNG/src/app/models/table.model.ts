import {Player} from "./player.model";
import {Dealer} from "./dealer.model";

export interface Table {
  tableId: number;
  totalPlayers: number;
  dealer: Dealer;
  players: Array<Player>;
}
