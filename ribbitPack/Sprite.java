package ribbitPack;

import java.awt.Image;

class Sprite extends Entity {
    public String name;
    public int x;
    public int y;
    public int width;
    public int height;
    public Image image;

    public Sprite(String name, int x, int y, int width, int height, Image image) {
        super(name, x, y, width, height);
        this.image = image;
    }


}