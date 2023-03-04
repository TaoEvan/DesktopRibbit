package ribbitPack;
// fx and swing are not compatible
import java.awt.Color;

class Window extends Entity {
    public String hexValue = "#000000"; // You do need the hash
    public Color colour;
    public TextBox text;
    public String description;
    
    public Window(int x, int y, int width, int height, int xVel, int yVel, Color colour, String description) {
        super(x, y, width, height, xVel, yVel);
        this.colour = colour;
        this.text = new TextBox(x, y, description);
    }

    public void open() {
        // play animation HAHAHAHAHA
        // how abotu we close the screen from top and bottom (shorten dimensions on each top and bottom)
    }

    public void close() {
        // animation
    }

}