import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class statsPanel extends JPanel implements ActionListener {
    static ArrayList<Integer> population;
    final int PANEL_WIDTH = 900;
    final int PANEL_HEIGTH = 700;
    Image peter;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x=0;
    int y=0;
    static int xAxis;
    static float yAxis;

    statsPanel(ArrayList<Integer> pop) {
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGTH));
        //this.setBounds(100,10,100,100);
        population=pop;
        xAxis = (int) (700/(population.size()+1));
        //population.sort(Comparator.reverseOrder());
        yAxis = (float)350/(float)(population.get(0));
        System.out.println(yAxis);
        peter = new ImageIcon("gif.png").getImage();
        timer = new Timer(5, this);
        timer.start();

    }
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(peter, x, y, null);

        g2D.setPaint(new Color(0x262424));
        g2D.setFont(new Font("Courier New", Font.BOLD, 15));
        g2D.drawString("population", 5, 138);

        g2D.setPaint(new Color(0x262424));
        g2D.setFont(new Font("Courier New", Font.BOLD, 15));
        g2D.drawString("time", 100, 515);

        g2D.setPaint(new Color(0x262424));
        g2D.setFont(new Font("Courier New", Font.BOLD, 32));
        g2D.drawString("The Simulation has ended!", 340, 200);


        int endLine = 0;
        for (int i = 0; i < population.size() - 1; i++) {
            g2D.setStroke(new BasicStroke(3));
            g2D.setColor(new Color(0xE18E3B));
            Shape l = new Line2D.Double(xAxis * i +15,500-(((population.get(i)) + 15)*yAxis),xAxis * (i+1) + 15,500-(((population.get(i + 1)) + 15)*yAxis));

            //g2D.drawLine(xAxis * i +15, 500-(((population.get(i)) + 15)*yAxis), xAxis * (i+1) + 15, 500-(((population.get(i + 1)) + 15)*yAxis));
            g2D.draw(l);
            int[] xPoints = new int[4];
            float[] yPoints = new float[4];
            xPoints[0] = xAxis * i +15;
            xPoints[1] = xAxis * i +15;
            xPoints[2] = xAxis * (i+1) +15;
            xPoints[3] = xAxis * (i+1) +15;

            yPoints[0] = 500-(((population.get(i)) + 15)*yAxis);
            yPoints[1] = 500;
            yPoints[2] = 500;
            yPoints[3] = 500-(((population.get(i + 1)) + 15)*yAxis);

            g2D.setColor(new Color(0x8BE18E3B, true));
            
            //g2D.fillPolygon(xPoints, yPoints, 4);

        }

        g2D.setPaint(new Color(0x262424));
        g2D.setStroke(new BasicStroke(3));
        g2D.drawLine(15, 150, 15, 500);

        g2D.setPaint(new Color(0x262424));
        g2D.setStroke(new BasicStroke(3));
        g2D.drawLine(15, 500, 660, 500);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x>PANEL_WIDTH-peter.getWidth(null) || x<0){
            xVelocity = xVelocity * -1;
        }
        if(y>PANEL_HEIGTH-500-peter.getHeight(null) || y<0){
            yVelocity = yVelocity * -1;
        }
        x = x + xVelocity;
        y = y + yVelocity;
        repaint();
    }
}