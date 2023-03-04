import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

public class TitleMenu extends JFrame{
    public TitleMenu(){
        GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = graphics.getDefaultScreenDevice();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        device.setFullScreenWindow(this);
        this.setVisible(true);
    }
}
