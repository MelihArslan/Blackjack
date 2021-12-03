import {Component, OnInit} from '@angular/core';
import {BlckgameserviceService} from "../services/blckgameservice.service";
import {Router} from "@angular/router";
import {DeckDao} from "../models/dao/DeckDao";
import {Player} from "../models/player.interface";

@Component({
  selector: 'app-basicgame',
  templateUrl: './basicgame.component.html',
  styleUrls: ['./basicgame.component.css']
})
export class BasicgameComponent implements OnInit {
  game: DeckDao;
  player: Player[];


  constructor(private blckGameService: BlckgameserviceService, private router: Router) {
  }

  ngOnInit() {
    this.game = this.blckGameService.getGame();
    if (!this.game) {
      this.router.navigateByUrl('');
    }
  }
}
