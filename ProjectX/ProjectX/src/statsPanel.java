import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.sql.SQLOutput;
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
        population= pop;
        xAxis = (int) (700/(population.size()+1));
        //population.sort(Comparator.reverseOrder());
        yAxis = (float)350/(float)(population.get(0));
        peter = new ImageIcon("gif.png").getImage();
        timer = new Timer(5, this);
        timer.start();

    }
    public void normalizevals(ArrayList<Integer> populations){
        for(Integer i:populations) {
            //System.out.println(i);
        }
        int max = 0;
        int min = 0;

        for (int i:populations ){
            if (i>max){
                max = i;
            }
            if (i<min){
                min = i;
            }
        }
        int dif = max-min;
        //System.out.println(dif);
        for (int i=0; i<populations.size();i++){
            float x = ((float)populations.get(i)-min)/dif;
            populations.set(i, (int) ( 350*x));
        }

    }
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        //g2D.drawImage(peter, x, y, null);

        g2D.setPaint(new Color(0x262424));
        g2D.setFont(new Font("Courier New", Font.BOLD, 15));
        g2D.drawString("population", 5, 288);

        g2D.setPaint(new Color(0x262424));
        g2D.setFont(new Font("Courier New", Font.BOLD, 15));
        g2D.drawString("time", 321, 665);

        g2D.setPaint(new Color(0x262424));
        g2D.setFont(new Font("Courier New", Font.BOLD, 32));
        g2D.drawString("The Simulation has ended!", 217, 30);


        int endLine = 0;
        normalizevals(population);
        for (int i = 0; i < population.size() - 1; i++) {
            g2D.setStroke(new BasicStroke(3));
            g2D.setColor(new Color(0xE18E3B));
            Shape l = new Line2D.Double(xAxis * i +15, 700 -population.get(i),xAxis * (i+1) + 15,700 -population.get(i+1));
            g2D.draw(l);
        }

        g2D.setPaint(new Color(0x262424));
        g2D.setStroke(new BasicStroke(3));
        g2D.drawLine(15, 300, 15, 650);

        g2D.setPaint(new Color(0x262424));
        g2D.setStroke(new BasicStroke(3));
        g2D.drawLine(15, 650, 660, 650);
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