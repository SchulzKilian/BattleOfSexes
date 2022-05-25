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
    Main f;

    InputsPanel(Main frame){
        f=frame;

        this.setLayout(new FlowLayout());
        this.setBackground(new Color(0xEDEBDE));
        a = new JTextField();
        a.setPreferredSize(new Dimension(180,40));
        a.setFont(new Font("Courier New", Font.BOLD , 20));
        a.setForeground(new Color(0x9F9F9F));
        a.setText("Enter a");
        a.addActionListener(this);


        b = new JTextField();
        b.setPreferredSize(new Dimension(180,40));
        b.setFont(new Font("Courier New", Font.BOLD , 20));
        b.setForeground(new Color(0x9F9F9F));
        b.setText("Enter b");
        b.addActionListener(this);

        c = new JTextField();
        c.setPreferredSize(new Dimension(180,40));
        c.setFont(new Font("Courier New", Font.BOLD , 20));
        c.setForeground(new Color(0x9F9F9F));
        c.setText("Enter c");
        c.addActionListener(this);

        fmen = new JTextField();
        fmen.setPreferredSize(new Dimension(180,40));
        fmen.setFont(new Font("Courier New", Font.BOLD , 20));
        fmen.setForeground(new Color(0x9F9F9F));
        fmen.setText("philanderers");
        fmen.addActionListener(this);

        fwomen = new JTextField();
        fwomen.setPreferredSize(new Dimension(180,40));
        fwomen.setFont(new Font("Courier New", Font.BOLD , 20));
        fwomen.setForeground(new Color( 0x9F9F9F));
        fwomen.setText("fast women");
        fwomen.addActionListener(this);

        smen = new JTextField();
        smen.setPreferredSize(new Dimension(180,40));
        smen.setFont(new Font("Courier New", Font.BOLD , 20));
        smen.setForeground(new Color(0x9F9F9F));
        smen.setText("faithful men");
        smen.addActionListener(this);

        swomen = new JTextField();
        swomen.setPreferredSize(new Dimension(180,40));
        swomen.setFont(new Font("Courier New", Font.BOLD , 20));
        swomen.setForeground(new Color(0x9F9F9F));
        swomen.setText("coy women");
        swomen.addActionListener(this);


        this.add(a);
        this.add(b);
        this.add(c);
        this.add(fmen);
        this.add(fwomen);
        this.add(smen);
        this.add(swomen);
        this.setVisible(true);
        this.setBounds(920,350,200,400);
        frame.frame.add(this);

    }

    public void getvalue(){
        int aval = Integer.parseInt(a.getText());
        f.a=aval;
        int bval = Integer.parseInt(b.getText());
        f.b=bval;
        int cval = Integer.parseInt(c.getText());
        f.c=cval;

        int smenValue = Integer.parseInt(smen.getText());
        f.slowmen=smenValue;
        int fmenValue = Integer.parseInt(fmen.getText());
        f.fastmen=fmenValue;
        int swomenValue = Integer.parseInt(swomen.getText());
        f.slowwomen=swomenValue;
        int fwomenValue = Integer.parseInt(fwomen.getText());
        f.fastwomen=fwomenValue;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*int smenValue = Integer.parseInt(smen.getText());
        f.slowmen=smenValue;
        int fmenValue = Integer.parseInt(fmen.getText());
        f.fastmen=fmenValue;
        int swomenValue = Integer.parseInt(swomen.getText());
        f.slowwomen=swomenValue;
        int fwomenValue = Integer.parseInt(fwomen.getText());
        f.fastwomen=fwomenValue;*/

    }
}
