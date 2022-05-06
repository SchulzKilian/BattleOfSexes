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
        g.drawRect(0, 0, 300, 300);
        g.setColor(new Color(0xF060FA));
        g.fillArc(0, 0, 300, 300, 0, angle1);
        g.setColor(new Color(0xF59CFF));
        g.fillArc(0, 0, 300, 300, angle1, angle2);
        g.setColor(new Color(0x008EFF));
        g.fillArc(0, 0, 300, 300, angle1+angle2, angle3);
        g.setColor(new Color(0x7FC6FF));
        g.fillArc(0, 0, 300, 300, angle1+angle2+angle3, angle4);
    }
}