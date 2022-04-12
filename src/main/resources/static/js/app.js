import {
    GameGroup
} from './gamegroup.js'

import {
    GameGroup2
} from './gamegroup2.js'

class App{
    constructor() {
        this.canvas = document.createElement('canvas')
        this.ctx = this.canvas.getContext('2d');

        document.body.appendChild(this.canvas);

        this.gameGroup = new GameGroup();
        this.gameGroup2 = new GameGroup2();

        window.addEventListener('resize', this.resize.bind(this), false);
        this.resize();

        window.requestAnimationFrame(this.animate.bind(this));
    }

    resize() {
        this.stageWidth = document.body.clientWidth;
        this.stageHeight = document.body.clientHeight;

        this.canvas.width = this.stageWidth * 2;
        this.canvas.height = this.stageHeight * 2;
        this.ctx.scale(2, 2);

        this.gameGroup.resize(this.stageWidth, this.stageHeight);
        this.gameGroup2.resize(this.stageWidth, this.stageHeight);
    }

    animate() {
        window.requestAnimationFrame(this.animate.bind(this));

        this.ctx.clearRect(0, 0, this.stageWidth, this.stageHeight);

        this.gameGroup.draw(this.ctx);
        this.gameGroup2.draw(this.ctx);
    }
}

window.onload = () => {
    new App();
}