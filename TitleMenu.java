import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class TitleMenu extends JPanel{
    BufferedImage background;
    JButton startButton;
    public void initButtons(){
        ImageIcon startIcon = null;
        try{
            startIcon = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("./Assets/Icons/folder.png")));
        }catch(IOException e){
            e.printStackTrace();
        }
        startButton = new JButton(startIcon);
        startButton.setBorderPainted(false);
        startButton.setFocusPainted(false);
        startButton.setContentAreaFilled(false);
        this.add(startButton);
        startButton.setLocation(500,500);
        startButton.setPreferredSize(new Dimension(100,100));
        startButton.setVisible(true);
    }
    public TitleMenu() {
        this.setPreferredSize(Const.SCREENSIZE);
        try{
            background = ImageIO.read(getClass().getResourceAsStream("Assets/General/Background.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
        this.setLayout(null);
        initButtons();
        this.setVisible(true);
        this.startButton.setVisible(false);
        this.startButton.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D)g;

        setBackground(Color.BLACK);

        g2d.drawImage(background, 0, 0, (int)Const.WIDTH, (int)Const.HEIGHT, null);

        revalidate();
        repaint();
    }
}
