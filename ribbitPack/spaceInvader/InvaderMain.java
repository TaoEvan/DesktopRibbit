package ribbitPack.spaceInvader;
import ribbitPack.Utilities;
import java.awt.*; import javax.swing.*;
import java.awt.event.*; // reduce later
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class InvaderMain {
    // must declare here, scope
    public static SpaceShip ship;
    public static GamePanel gamePanel;
    public static MyKeyListener keyListener;
    public static void main(String[] args) throws IOException, InterruptedException{
        invaderMain();
    }

    public static void invaderMain() throws IOException, InterruptedException {

        int width=1000; int height =900;
        JFrame frame = new JFrame("Fly Invaders"); 
        // 1 game window to properly requested size not including window bar's dimensions
        frame.getContentPane().setPreferredSize(new Dimension(width, height));
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        gamePanel = new GamePanel();
        frame.add(gamePanel);
        keyListener = new MyKeyListener();
        gamePanel.addKeyListener(keyListener);
        frame.setVisible(true);

        BufferedImage shipImage = ImageIO.read(new File("images/ship.png"));
        ImageIcon shipImageScaled = Utilities.scaleImage(new ImageIcon(shipImage), 50, 50);
        ship = new SpaceShip(width/2, height/2, 50, 50, 10, 10, Utilities.convertImageIconToBufferedImage(shipImageScaled)); // controversial
        while(true){


            if(ship.right) {
                ship.moveRight();
            }
            if(ship.left) {
                ship.moveLeft();
            }
            if(ship.down) {
                ship.moveDown();
            }
            if(ship.up) {
                ship.moveUp();
            }


            Thread.sleep(10); 
        }



    }

    //------------------------------------------------------------------------------ 

    public class GamePanel extends JPanel{
        GamePanel(){
            this.setBackground(new Color(0,0,0));
            setFocusable(true);
            requestFocusInWindow();
        }
        
        @Override
        public void paintComponent(Graphics g){ 
            super.paintComponent(g); //required
            ship.draw(g);
            
        }
    }

    //------------------------------------------------------------------------------  
    //act upon key events
    public class MyKeyListener implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e){
            int key = e.getKeyCode();

            // key cannot contain 2 values at same time, this is why you have different boolean variables
            if(key == KeyEvent.VK_D) {
                ship.right = true;
            }
            if(key == KeyEvent.VK_A) {
                ship.left = true;
            }
            if(key == KeyEvent.VK_W) {
                ship.up = true;
            }
            if(key == KeyEvent.VK_S) {
                ship.down = true;
            }
        }
        @Override
        public void keyReleased(KeyEvent e){ 
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_D){
                ship.right = false;
            } else if (key == KeyEvent.VK_A) {
                ship.left = false;
            } else if(key == KeyEvent.VK_S) {
                ship.down = false;
            } else if(key == KeyEvent.VK_W) {
                ship.up = false;
            }
            
        }
        @Override
        public void keyTyped(KeyEvent e){
        }
    }
//------------------------------------------------------------------------------

}
