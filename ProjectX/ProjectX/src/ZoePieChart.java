import java.awt.*;
import javax.swing.*;

public class ZoePieChart extends JPanel {// draw rectangles and arcs
    int[] angle;
    float[] perc;
    ZoePieChart(float tot, float a1, float a2, float a3, float a4, JFrame frame) {
        JLabel s1 = new JLabel();
        JLabel s2 = new JLabel();
        JLabel s3 = new JLabel();
        JLabel s4 = new JLabel();
        perc = getPercentage(tot,a1,a2,a3,a4);
        angle = getAngle(perc);
        //System.out.println(angle);

        this.setLayout(null);
        this.setBounds(920,10,500,300);
        this.setBackground(new Color(0xFFEDEBDE, true));
        this.add(s1);
        s1.setBounds(285,15,205,67);
        this.add(s2);
        s2.setBounds(285,82,205,67);
        this.add(s3);
        s3.setBounds(285,149,205,67);
        this.add(s4);
        s4.setBounds(285,216,205,67);

        s1.setOpaque(true);
        s1.setBackground(new Color( 0xFFEDEBDE));
        s1.setText("<html>coy women<br>"+(int)a1+"("+Math.round(perc[0] * 100.0)/100.0+"%)</html>");
        JLabel label = new JLabel("<html>First line<br>Second line</html>");
        s1.setFont(new Font("Courier New", Font.BOLD , 20));
        s1.setForeground(new Color(0xD58B40));
        s2.setOpaque(true);
        s2.setBackground(new Color(0xFFEDEBDE));
        s2.setText("<html>fast women<br>"+(int)a2+"("+Math.round(perc[1] * 100.0)/100.0+"%)</html>");
        s2.setFont(new Font("Courier New", Font.BOLD , 20));
        s2.setForeground(new Color(0xFFF3B880, true));
        s3.setOpaque(true);
        s3.setBackground(new Color(0xFFEDEBDE));
        s3.setText("<html>philanderers<br>"+(int)a3+"("+Math.round(perc[2] * 100.0)/100.0+"%)</html>");
        s3.setFont(new Font("Courier New", Font.BOLD , 20));
        s3.setForeground(new Color(0x238891));
        s4.setOpaque(true);
        s4.setBackground(new Color(0xFFEDEBDE));
        s4.setText("<html>faithful men<br>"+(int)a4+"("+Math.round(perc[3] * 100.0)/100.0+"%)</html>");
        s4.setFont(new Font("Courier New", Font.BOLD , 20));
        s4.setForeground(new Color(0x83C5BF));

        frame.add(this);
    }
    ZoePieChart(float tot, float a1, float a2, float a3, float a4, JPanel frame) {
        JLabel s1 = new JLabel();
        JLabel s2 = new JLabel();
        JLabel s3 = new JLabel();
        JLabel s4 = new JLabel();
        perc = getPercentage(tot,a1,a2,a3,a4);
        angle = getAngle(perc);
        //System.out.println(angle);

        this.setLayout(null);
        //this.setBounds(920,10,500,300);
        this.setBackground(new Color(0xFFEDEBDE, true));
        this.add(s1);
        s1.setBounds(285,15,205,67);
        this.add(s2);
        s2.setBounds(285,82,205,67);
        this.add(s3);
        s3.setBounds(285,149,205,67);
        this.add(s4);
        s4.setBounds(285,216,205,67);

        s1.setOpaque(true);
        s1.setBackground(new Color( 0xFFEDEBDE));
        s1.setText("<html>coy women<br>"+(int)a1+"("+Math.round(perc[0] * 100.0)/100.0+"%)</html>");
        JLabel label = new JLabel("<html>First line<br>Second line</html>");
        s1.setFont(new Font("Courier New", Font.BOLD , 20));
        s1.setForeground(new Color(0xD58B40));
        s2.setOpaque(true);
        s2.setBackground(new Color(0xFFEDEBDE));
        s2.setText("<html>fast women<br>"+(int)a2+"("+Math.round(perc[1] * 100.0)/100.0+"%)</html>");
        s2.setFont(new Font("Courier New", Font.BOLD , 20));
        s2.setForeground(new Color(0xCE9E6E));
        s3.setOpaque(true);
        s3.setBackground(new Color(0xFFEDEBDE));
        s3.setText("<html>philanderers<br>"+(int)a3+"("+Math.round(perc[2] * 100.0)/100.0+"%)</html>");
        s3.setFont(new Font("Courier New", Font.BOLD , 20));
        s3.setForeground(new Color(0x238891));
        s4.setOpaque(true);
        s4.setBackground(new Color(0xFFEDEBDE));
        s4.setText("<html>faithful men<br>"+(int)a4+"("+Math.round(perc[3] * 100.0)/100.0+"%)</html>");
        s4.setFont(new Font("Courier New", Font.BOLD , 20));
        s4.setForeground(new Color(0x83C5BF));

        frame.add(this);

    }
    public float[] getPercentage(float tot, float a1, float a2, float a3, float a4) {
        float[] res = new float[4];
        res[0] = (float)(a1/tot)*100;
        res[1] = (float)(a2/tot)*100;
        res[2] = (float)(a3/tot)*100;
        res[3] = (float)(a4/tot)*100;
        return res;
    }

    public int[] getAngle(float[] res) {
        int[] angle = new int[4];
        angle[0] = (int)((res[0]/100)*360);
        angle[1] = (int)((res[1]/100)*360);
        angle[2] = (int)((res[2]/100)*360);
        angle[3] = (int)((res[3]/100)*360);
        return angle;
    }

    public void paintComponent(Graphics g){ //, int a1,int a2, int a3 ,int a4) {
        super.paintComponent(g); // call superclass's paintComponent
        // start at 0 and sweep 360 degrees
        g.setColor(new Color(0xFFEDEBDE));
        g.drawRect(10, 20, 260, 260);
        g.setColor(new Color(0xD58B40));
        g.fillArc(10, 20, 260, 260, 0, 360);
        g.fillArc(10, 20, 260, 260, 0, angle[0]);
        g.setColor(new Color(0xCE9E6E));
        g.fillArc(10, 20, 260, 260, angle[0], angle[1]);
        g.setColor(new Color(0x238891));
        g.fillArc(10, 20, 260, 260, angle[0]+angle[1], angle[2]);
        g.setColor(new Color(0x83C5BF));
        g.fillArc(10, 20, 260, 260, angle[0]+angle[1]+angle[2], angle[3]);

    }
}