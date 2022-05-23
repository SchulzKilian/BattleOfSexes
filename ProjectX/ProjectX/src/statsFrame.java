import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class statsFrame extends JFrame {
    statsPanel panel;
    statsFrame(ArrayList<Integer> population) {
        panel = new statsPanel(population);
        this.setSize(1000,1000);
        this.add(panel);
        this.pack();
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0xFFEDEBDE));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        /*Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        pack();
        this.setSize(screenSize.width,screenSize.height);*/
    }

}
