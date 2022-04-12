import { Game } from "./game.js";

export class GameGroup{
    constructor(){
        this.totalGames = 5;
        this.imgs = ['imgs/ApexLegend.jpg', 'imgs/civilizationVI.jpg', 'imgs/djmaxRespect.jpg', 
        'imgs/eldenring.jpg', 'imgs/gta5.jpg'];
        this.imgs2 = ['imgs/ittaketwo.jpg', 'imgs/monsterhunterrise.jpg', 'imgs/rainbowsixsiege.jpg', 
        'imgs/STARDEWVALLEY.jpg', 'imgs/UNDERTALE.jpg'];
        this.games = [];
        this.games2 = [];

        for (let i = 0; i < this.totalGames; i++){
            const game = new Game(
                i, 0.2, this.imgs[i]
            )
            this.games[i] = game;
        }

        for (let i = 0; i < this.totalGames; i++){
            const game2 = new Game(
                i, 2.2, this.imgs2[i]
            )
            this.games2[i] = game2;
        }
    }

    resize(stageWidth, stageHeight) {
        for (let i = 0; i < this.totalGames; i++){
            const game = this.games[i];
            game.resize(stageWidth, stageHeight);
        }
        for (let i = 0; i < this.totalGames; i++){
            const game2 = this.games2[i];
            game2.resize(stageWidth, stageHeight);
        }
    }

    draw(ctx) {
        for (let i = 0; i < this.totalGames; i++){
            const game = this.games[i];
            game.draw(ctx);
        }
        for (let i = 0; i < this.totalGames; i++){
            const game2 = this.games2[i];
            game2.draw(ctx);
        }

    }

}