import javax.swing.*;
import java.awt.*;

public class populationGraph extends JPanel {
    static int[][] population;
    populationGraph(int[][] pop) {
        this.setPreferredSize(new Dimension(700,900));
        population=pop;

    }
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(new Color(0x262424));
        g2D.setFont(new Font("Courier New", Font.BOLD , 15));
        g2D.drawString("population",5,138);

        g2D.setPaint(new Color(0x262424));
        g2D.setFont(new Font("Courier New", Font.BOLD , 15));
        g2D.drawString("time",340,515 );

        for (int i=0; i<10-1; i++){
            g2D.setStroke(new BasicStroke(3));
            g2D.setColor(new Color (0xE18E3B));
            g2D.drawLine((population[i][0])+15,500-((population[i][1])+15),(population[i+1][0])+15,500-((population[i+1][1])+15));
            int[] xPoints = new int[4];
            int[] yPoints = new int[4];
            xPoints[0] = (population[i][0])+15;
            xPoints[1] = (population[i][0])+15;
            xPoints[2] = (population[i+1][0])+15;
            xPoints[3] = (population[i+1][0])+15;

            yPoints[0] = 500-((population[i][1])+15);
            yPoints[1] = 500;
            yPoints[2] = 500;
            yPoints[3] = 500-((population[i+1][1])+15);

            g2D.setColor(new Color (0x8BE18E3B, true));
            g2D.fillPolygon(xPoints,yPoints,4);

        }

        g2D.setPaint(new Color(0x262424));
        g2D.setStroke(new BasicStroke(3));
        g2D.drawLine(15, 150, 15, 500);

        g2D.setPaint(new Color(0x262424));
        g2D.setStroke(new BasicStroke(3));
        g2D.drawLine(15, 500, 690, 500);
    }
}
