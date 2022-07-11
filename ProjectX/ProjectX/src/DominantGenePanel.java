import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DominantGenePanel extends JPanel implements ActionListener {
    JRadioButton fast;
    JRadioButton slow;
    JRadioButton none;
    JLabel title;
    Main main;

    DominantGenePanel(Main frame) {
        main =frame;
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
        fast.setForeground(new Color(0x426A79));
        fast.setBackground(new Color(0xEDEBDE));
        fast.addActionListener(this);
        slow.setFont(new Font("Courier New", Font.BOLD , 20));
        slow.setForeground(new Color(0x426A79));
        slow.setBackground(new Color(0xEDEBDE));
        slow.addActionListener(this);
        none.setFont(new Font("Courier New", Font.BOLD , 20));
        none.setForeground(new Color(0x426A79));
        none.setBackground(new Color(0xEDEBDE));
        none.addActionListener(this);
        title.setFont(new Font("Courier New", Font.BOLD , 17));
        title.setForeground(new Color(0x426A79));

        this.add(title);
        this.add(fast);
        this.add(slow);
        this.add(none);
        this.setVisible(true);
        frame.frame.add(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==slow){
            main.dominantgene=false;
            main.none=false;
            System.out.println("slo");

        }
        if(e.getSource()==fast){
            main.dominantgene=true;
            main.none=false;
            System.out.println("fast");

        }
        if(e.getSource()==none){
            main.dominantgene=false;
            main.none=true;
            System.out.println("gfghjh");

        }

    }
}
