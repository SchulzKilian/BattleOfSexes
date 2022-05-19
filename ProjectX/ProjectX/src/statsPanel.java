import javax.swing.*;
import java.awt.*;

public class statsPanel extends JPanel {
    static int[][] population;
    statsPanel(int[][] pop) {
        this.setPreferredSize(new Dimension(700,900));
        population=pop;

    }
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(new Color(0x262424));
        g2D.drawString("population",5,12);

        g2D.setPaint(new Color(0x262424));
        g2D.drawString("time",340,515 );

        for (int i=0; i<10-1; i++){
            g2D.setStroke(new BasicStroke(3));
            g2D.setColor(new Color (0xE18E3B));
            g2D.drawLine((population[i][0])+15,(population[i][1])+15,(population[i+1][0])+15,(population[i+1][1])+15);
        }

        g2D.setPaint(new Color(0x262424));
        g2D.setStroke(new BasicStroke(3));
        g2D.drawLine(15, 15, 15, 500);

        g2D.setPaint(new Color(0x262424));
        g2D.setStroke(new BasicStroke(3));
        g2D.drawLine(15, 500, 690, 500);
    }
}