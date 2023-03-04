package ribbitPack;

class Entity {
    public int x;
    public int y;
    public int width;
    public int height;
    public int xVel;
    public int yVel;

    public Entity(int x, int y, int width, int height, int xVel, int yVel) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.xVel = xVel;
        this.yVel = yVel;
    }


    public void moveLeft() {
        this.x-=this.xVel;
    }

    public void moveRight() {
        this.x+=this.xVel;
    }

    public void moveDown() {
        this.y+=this.yVel;
    }

    public void moveUp() {
        this.y-=this.yVel;
    }

}