/**
 * Created by Herish Ibrahim 03/12/2021
 */
export interface Hand {
  id: number;
  betAmount: number;
  finished: boolean;
  buts: boolean;
  blackJack: boolean;
  score: number
}
