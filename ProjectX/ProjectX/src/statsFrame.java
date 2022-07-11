import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class statsFrame extends JFrame {
    statsPanel panel;
    statsFrame(ArrayList<Integer> population, Main m) {

        panel = new statsPanel(population,m);
        this.setBackground(new Color(0xFFEDEBDE));
        panel.setBackground(new Color(0xFFEDEBDE, true));
        this.setSize(1000,800);
        this.setLayout(null);
        this.add(panel);
        panel.setVisible(true);
        panel.setBounds(0,0,1000,800);
        ZoePieChart p=new ZoePieChart(m.gesamt,m.slowwomen,m.fastwomen,m.fastmen,m.slowmen,this);
        this.add(p);
        p.setBounds(5,450,450,300);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.getContentPane().setBackground(new Color(0xFFEDEBDE, true));
        //this.setLocationRelativeTo(null);
        this.setVisible(true);
        //this.pack();
        /*Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        pack();
        this.setSize(screenSize.width,screenSize.height);*/
        JPanel data2=new JPanel();
        data2.setLayout(null);
        data2.setSize(500,300);
        data2.setBackground(new Color(0xFFEDEBDE));
        data2.setBounds(460,450,400,300);
        data2.setVisible(true);
        this.add(data2);
        JLabel s1 = new JLabel();
        JLabel s2 = new JLabel();
        JLabel s3 = new JLabel();
        JLabel s4 = new JLabel();
        float[] perc;
        perc = p.getPercentage(m.igesamt,m.islowwomen,m.ifastwomen,m.ifastmen,m.islowmen);
        this.setBackground(new Color(0xFFEDEBDE, true));
        data2.add(s1);
        s1.setBounds(0,15,205,67);
        data2.add(s2);
        s2.setBounds(0,82,205,67);
        data2.add(s3);
        s3.setBounds(0,149,205,67);
        data2.add(s4);
        s4.setBounds(0,216,205,67);

        s1.setOpaque(true);
        s1.setBackground(new Color( 0xFFEDEBDE));
        s1.setText("<html>coy women<br>"+(int)m.islowwomen+"("+Math.round(perc[0] * 100.0)/100.0+"%)</html>");
        JLabel label = new JLabel("<html>First line<br>Second line</html>");
        s1.setFont(new Font("Courier New", Font.BOLD , 20));
        s1.setForeground(new Color(0xF6A6A6));
        s2.setOpaque(true);
        s2.setBackground(new Color(0xFFEDEBDE));
        s2.setText("<html>fast women<br>"+(int)m.ifastwomen+"("+Math.round(perc[1] * 100.0)/100.0+"%)</html>");
        s2.setFont(new Font("Courier New", Font.BOLD , 20));
        s2.setForeground(new Color(0x9D6363, true));
        s3.setOpaque(true);
        s3.setBackground(new Color(0xFFEDEBDE));
        s3.setText("<html>philanderers<br>"+(int)m.ifastmen+"("+Math.round(perc[2] * 100.0)/100.0+"%)</html>");
        s3.setFont(new Font("Courier New", Font.BOLD , 20));
        s3.setForeground(new Color(0x7DC0A0));
        s4.setOpaque(true);
        s4.setBackground(new Color(0xFFEDEBDE));
        s4.setText("<html>faithful men<br>"+(int)m.islowmen+"("+Math.round(perc[3] * 100.0)/100.0+"%)</html>");
        s4.setFont(new Font("Courier New", Font.BOLD , 20));
        s4.setForeground(new Color(0xBFFFF2));
    }
    /*public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(3));
        g2D.setColor(new Color(0xFFEDEBDE, true));
        //g2D.fillRect(0,0,1000,800);
    }*/

}
