import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JTextField a;
    JTextField b;
    JTextField c;

    JTextField smen;
    JTextField fmen;
    JTextField swomen;
    JTextField fwomen;
    MyFrame() {
        this.setVisible(true);
        this.setSize(1440,920);  //frame.setResizeble prevent the frame from resizing
        this.setTitle("test");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0xFFEDEBDE, true));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        pack();
        this.setSize(screenSize.width,screenSize.height);
    }
}
