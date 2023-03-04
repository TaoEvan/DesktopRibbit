package ribbitPack;
// fx and swing are not compatible
import java.awt.Color;

class Window extends Entity {
    public String hexValue = "#000000"; // You do need the hash
    public Color colour;
    public TextBox text;
    public String description;
    
    public Window(String name, int x, int y, int width, int height, Color colour, String description) {
        super(name, x, y, width, height);
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