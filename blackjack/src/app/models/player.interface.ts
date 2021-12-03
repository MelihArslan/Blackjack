import {Hand} from "./hand.interface";
/**
 * Created by Herish Ibrahim 03/12/2021
 */
export interface Player {
  id: number;
  name: string;
  cash: number;
  dealer: boolean;
  hands: Hand[];
}
