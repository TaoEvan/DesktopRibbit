package ribbitPack.spaceInvader;

import ribbitPack.Sprite;
import ribbitPack.Utilities;
import java.awt.Image;

public class Bullet extends Sprite {

    Bullet(int x, int y, int width, int height, Image image){
        super( x,  y,  width,  height, Utilities.scaleImage(image));


    }

    /* it is pixcellated with nice collisions */
    


}
