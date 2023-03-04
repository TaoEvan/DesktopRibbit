import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class TitleMenu extends JFrame{
    BufferedImage background;
    public void initButtons(){
        ImageIcon startIcon = new ImageIcon("./Assets/Icons/folder.png");
        JButton startButton = new JButton(startIcon);
        startButton.setBorderPainted(false);
        startButton.setFocusPainted(false);
        startButton.setContentAreaFilled(false);
        this.add(startButton);
        startButton.setLocation(500,500);
    }
    public TitleMenu() {
        GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = graphics.getDefaultScreenDevice();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        device.setFullScreenWindow(this);
        try{
            background = ImageIO.read(getClass().getResourceAsStream("Assets/General/Background.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
        this.setLayout(null);
        initButtons();
        this.setVisible(true);
    }

    public void paintComponent(Graphics g){
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D)g;

        setBackground(Color.BLACK);

        g2d.drawImage(background, 0, 0, (int)Const.WIDTH, (int)Const.HEIGHT, null);
    }
}
