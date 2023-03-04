import javax.swing.*; 
import java.awt.*;

public class MainScreen  {

    JFrame frame; 
    JLayeredPane mainLayeredPane; 

    MainScreen() throws IllegalArgumentException{
        frame = new JFrame(); 
        ImageIcon framePicture = new ImageIcon("iconPath");
        frame.setIconImage(framePicture.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMaximumSize(new Dimension(Const.WIDTH, Const.HEIGHT));
        frame.setMinimumSize(new Dimension(Const.WIDTH, Const.HEIGHT));
        frame.setSize(Const.WIDTH, Const.HEIGHT);
        frame.setResizable(false);
        frame.setVisible(true);

        mainLayeredPane = new JLayeredPane(); 

        frame.add(mainLayeredPane);

    }

}
