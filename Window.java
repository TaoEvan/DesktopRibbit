import javafx.scene.paint.Color;

class Window extends Sprite {
    public String hexValue = "#000000"; // You do need the hash
    public Color colour;
    public TextBox text;
    
    public Window(String name, int x, int y, int width, int height, Color colour) {
        super(name, x, y, width, height);
        this.colour = colour;
        this.text = new TextBox(x, y);
    }

    public void open() {
        // play animation HAHAHAHAHA
        // how abotu we close the screen from top and bottom (shorten dimensions on each top and bottom)
    }

    public void close() {
        // animation
    }

}