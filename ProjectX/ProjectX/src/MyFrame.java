import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setVisible(true);
        this.setSize(1440,900);  //frame.setResizeble prevent the frame from resizing
        this.setTitle("test");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLayout(null);
        //ImageIcon logo = new ImageIcon("logoJavaSwingTest.jpg");
        //this.setIconImage(logo.getImage());
        this.getContentPane().setBackground(new Color(0xFFD9D7C4, true));
    }
}
