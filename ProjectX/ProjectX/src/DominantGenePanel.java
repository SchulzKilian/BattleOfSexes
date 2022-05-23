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
        this.setBounds(1160,370,230,100);
        this.setBackground(new Color(0xEDEBDE));
        fast = new JRadioButton("fast");
        slow = new JRadioButton("slow");
        none = new JRadioButton("none");
        ButtonGroup group = new ButtonGroup();
        group.add(fast);
        group.add(slow);
        group.add(none);
        title = new JLabel("choose a dominant gene");

        fast.setFont(new Font("Courier New", Font.BOLD , 20));
        fast.setForeground(new Color(0x7379C2));
        slow.setFont(new Font("Courier New", Font.BOLD , 20));
        slow.setForeground(new Color(0x7379C2));
        none.setFont(new Font("Courier New", Font.BOLD , 20));
        none.setForeground(new Color(0x7379C2));
        title.setFont(new Font("Courier New", Font.BOLD , 17));
        title.setForeground(new Color(0x7379C2));

        this.add(title);
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
