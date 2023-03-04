package ribbitPack.spaceInvader;

import ribbitPack.Sprite;
import java.awt.image.BufferedImage;

public class SpaceShip extends Sprite {
    public int xVel;
    public int yVel; 
    public boolean right;
    public boolean left;
    public boolean up;
    public boolean down;

    public SpaceShip(int x, int y, int width, int height, int xVel, int yVel, BufferedImage image) {
        super(x, y, width, height, xVel, yVel, image);
    }
}
