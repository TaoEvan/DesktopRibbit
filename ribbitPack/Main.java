package ribbitPack;

import java.awt.*; 
import javax.swing.*; 

public class Main{    
    JFrame frame; 
    JLayeredPane mainLayeredPane;
    MyKeyListener keyListener;
    BasicMouseListener mouseListener;
    public static void main(String[] args){
        Main main = new Main();
        while (true){

        }

    }


    Main(){
        frame = new JFrame(); 
        mainLayeredPane = new JLayeredPane(); 
    }

    //------------------------------------------------------------------------------  
    //act upon key events
    public class MyKeyListener implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e){
            int key = e.getKeyCode();

            // key cannot contain 2 values at same time, this is why you have different boolean variables
            if(key == KeyEvent.VK_D) {
                right = true;
            }
            if(key == KeyEvent.VK_A) {
                left = true;
            }
            if(key == KeyEvent.VK_SPACE) {
                up = true;
            }
            if(key == KeyEvent.VK_S) {
                down = true;
            }
        }
        @Override
        public void keyReleased(KeyEvent e){ 
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_D){
                right = false;
            } else if (key == KeyEvent.VK_A) {
                left = false;
            } else if (key == KeyEvent.VK_S){
            }
        }
        @Override
        public void keyTyped(KeyEvent e){
        }
    }
//------------------------------------------------------------------------------

public class BasicMouseListener implements MouseListener{
    @Override
    public void mouseClicked(MouseEvent e){
    }

    // Pressed is more responsive than mouseclicked and actually performs more consistently
    @Override
    public void mousePressed(MouseEvent e){   // MUST be implemented even if not used!
        }
    }
    @Override
    public void mouseReleased(MouseEvent e){  // MUST be implemented even if not used!
    }
    @Override
    public void mouseEntered(MouseEvent e){   // MUST be implemented even if not used!
    }
    @Override
    public void mouseExited(MouseEvent e){    // MUST be implemented even if not used!
    }
    
}
}