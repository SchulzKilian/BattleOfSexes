import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DominantGenePanel extends JPanel implements ActionListener {
    JRadioButton fast;
    JRadioButton slow;
    JRadioButton none;
    JLabel title;

    DominantGenePanel(JFrame frame) {
        this.setLayout(new FlowLayout());
        this.setBounds(1190,500,210,175);
        fast = new JRadioButton("fast");
        slow = new JRadioButton("slow");
        none = new JRadioButton("none");
        title = new JLabel("<html>choose a<br>dominant<br>gene<html/>");

        fast.setFont(new Font("Courier New", Font.BOLD , 20));
        fast.setForeground(new Color(0x3975A6));
        slow.setFont(new Font("Courier New", Font.BOLD , 20));
        slow.setForeground(new Color(0x3975A6));
        none.setFont(new Font("Courier New", Font.BOLD , 20));
        none.setForeground(new Color(0x3975A6));
        title.setFont(new Font("Courier New", Font.BOLD , 20));
        title.setForeground(new Color(0x3975A6));

        //this.add(title);
        this.add(fast);
        this.add(slow);
        this.add(none);
        this.setVisible(true);
        frame.add(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
