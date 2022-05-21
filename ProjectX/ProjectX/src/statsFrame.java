import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class statsFrame extends JFrame {
    statsPanel panel;
    JLabel titleLabel;
    statsFrame(ArrayList<Integer> population) {
        panel = new statsPanel(population);
        titleLabel = new JLabel("The simulation has ended!");
        titleLabel.setFont(new Font("Courier New", Font.BOLD , 32));
        this.add(panel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0xFFEDEBDE));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        pack();
        this.setSize(screenSize.width,screenSize.height);
    }

}
