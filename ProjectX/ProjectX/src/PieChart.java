import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class PieChart extends JPanel {// draw rectangles and arcs
    int angle1;
    int angle2;
    int angle3;
    int angle4;
    PieChart(int a1, int a2, int a3, int a4) {
        angle1 = a1;
        angle2 = a2;
        angle3 = a3;
        angle4 = a4;
    }
    public void paintComponent(Graphics g){ //, int a1,int a2, int a3 ,int a4) {
        super.paintComponent(g); // call superclass's paintComponent
        // start at 0 and sweep 360 degrees
        g.setColor(new Color(0x0FFFFFF, true));
        g.drawRect(20, 15, 270, 270);
        g.setColor(new Color(0x7AEFB9));
        g.fillArc(20, 15, 270, 270, 0, angle1);
        g.setColor(new Color(0x327067));
        g.fillArc(20, 15, 270, 270, angle1, angle2);
        g.setColor(new Color(0x554AC2));
        g.fillArc(20, 15, 270, 270, angle1+angle2, angle3);
        g.setColor(new Color(0x7D73E0));
        g.fillArc(20, 15, 270, 270, angle1+angle2+angle3, angle4);
    }
}