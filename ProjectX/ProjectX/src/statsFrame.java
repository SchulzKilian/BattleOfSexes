import javax.swing.*;
import java.awt.*;

public class statsFrame extends JFrame {
    statsPanel panel;
    statsFrame(int[][] population) {
        panel = new statsPanel(population);
        this.setSize(700,900);  //frame.setResizeble prevent the frame from resizing
        this.add(panel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0xFFEDEBDE));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
