package ribbitPack;

import java.awt.Image;
import java.awt.Graphics;


public class Sprite extends Entity {
    public int x;
    public int y;
    public int width;
    public int height;
    public Image image;

    // no animation sprite
    public Sprite(int x, int y, int width, int height, int xVel, int yVel, Image image) {
        super(x, y, width, height, xVel, yVel);
        this.image = image;
    }

    public void draw(Graphics g){
        g.drawImage(this.image, this.x, this.y, null);
    }

}