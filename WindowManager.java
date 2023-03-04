import javax.swing.*;
import java.awt.*;

public class WindowManager extends JFrame{
    TitleMenu titleMenu;
    public WindowManager(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Desktop Ribbit");

        
        titleMenu = new TitleMenu();
        this.setContentPane(titleMenu);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}