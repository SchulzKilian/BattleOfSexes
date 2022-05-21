import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputsPanel extends JPanel implements ActionListener {
    JTextField a;
    JTextField b;
    JTextField c;
    JTextField fmen;
    JTextField fwomen;
    JTextField smen;
    JTextField swomen;

    InputsPanel(JFrame frame){
        this.setLayout(new FlowLayout());
        this.setBackground(new Color(0xEDEBDE));
        a = new JTextField();
        a.setPreferredSize(new Dimension(180,40));
        a.setFont(new Font("Courier New", Font.BOLD , 20));
        a.setForeground(new Color(0x9F9F9F));
        a.setText("Enter a");


        b = new JTextField();
        b.setPreferredSize(new Dimension(180,40));
        b.setFont(new Font("Courier New", Font.BOLD , 20));
        b.setForeground(new Color(0x9F9F9F));
        b.setText("Enter b");

        c = new JTextField();
        c.setPreferredSize(new Dimension(180,40));
        c.setFont(new Font("Courier New", Font.BOLD , 20));
        c.setForeground(new Color(0x9F9F9F));
        c.setText("Enter c");

        fmen = new JTextField();
        fmen.setPreferredSize(new Dimension(180,40));
        fmen.setFont(new Font("Courier New", Font.BOLD , 20));
        fmen.setForeground(new Color(0x9F9F9F));
        fmen.setText("philanderers");

        fwomen = new JTextField();
        fwomen.setPreferredSize(new Dimension(180,40));
        fwomen.setFont(new Font("Courier New", Font.BOLD , 20));
        fwomen.setForeground(new Color( 0x9F9F9F));
        fwomen.setText("fast women");

        smen = new JTextField();
        smen.setPreferredSize(new Dimension(180,40));
        smen.setFont(new Font("Courier New", Font.BOLD , 20));
        smen.setForeground(new Color(0x9F9F9F));
        smen.setText("faithful men");

        swomen = new JTextField();
        swomen.setPreferredSize(new Dimension(180,40));
        swomen.setFont(new Font("Courier New", Font.BOLD , 20));
        swomen.setForeground(new Color(0x9F9F9F));
        swomen.setText("coy women");


        this.add(a);
        this.add(b);
        this.add(c);
        this.add(fmen);
        this.add(fwomen);
        this.add(smen);
        this.add(swomen);
        this.setVisible(true);
        this.setBounds(920,350,200,400);
        frame.add(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
