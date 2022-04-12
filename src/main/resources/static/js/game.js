export class Game{
    constructor(x, y, img){
        this.x = x;
        this.y = y;
        this.speed = 2;
        this.image = new Image();
        this.image.src = img;
    }

    resize(stageWidth, stageHeight) {
        this.stageWidth = stageWidth;
        this.stageHeight = stageHeight;
        this.width = this.stageWidth/8;
        this.height = this.stageHeight/8;

        this.posX = this.x * this.stageWidth/4;
        this.posY = this.y * this.stageHeight/4;
    }

    draw(ctx) {
        this.posX += this.speed;

        ctx.drawImage(this.image, this.posX, this.posY, this.width, this.height);

        this.takeWindow(this.stageWidth);
    }

    reverseDraw(ctx) {
        this.posX -= this.speed;

        ctx.drawImage(this.image, this.posX, this.posY, this.width, this.height);

        this.takeWindow2(this.stageWidth);
    }

    takeWindow(stageWidth) {
        const minX = stageWidth + this.width;
        
        if(this.posX > minX){
            this.posX = -this.width;
        }
    }

    takeWindow2(stageWidth) {
        const maxX = -this.width;
        
        if(this.posX < maxX){
            this.posX = stageWidth + this.width;
        }
    }

}