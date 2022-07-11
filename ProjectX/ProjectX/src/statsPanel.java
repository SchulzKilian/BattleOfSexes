import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class statsPanel extends JPanel implements ActionListener {
    static ArrayList<Integer> population;
    final int PANEL_WIDTH = 1000;
    final int PANEL_HEIGTH = 800;
    Image peter;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x=0;
    int y=0;
    static int xAxis;
    static float yAxis;
    static Main m;
    ArrayList<Integer> indexes=new ArrayList<>();
    ArrayList<Integer> popcopy=new ArrayList<>();


    statsPanel(ArrayList<Integer> pop, Main m1) {
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGTH));
        //this.setBackground(new Color(0xFFEDEBDE));
        //this.setBounds(100,10,100,100);
        population= pop;
        m=m1;

        //population.sort(Comparator.reverseOrder());
        yAxis = (float)350/(float)(population.get(0));
        peter = new ImageIcon("gif.png").getImage();
        timer = new Timer(5, this);
        timer.start();


    }
    public void normalizevals(ArrayList<Integer> populations){
        popcopy.addAll(populations);


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
            populations.set(i, (int) ( 300*x));
        }

    }
    public ArrayList<int[]> fixlist(ArrayList<Integer> k){
        int b = 0;
        ArrayList<int[]> myarr = new ArrayList<>();
        for(int i=0;i<k.size();i++){
            if ((k.get(i)!= b)|| (i == k.size()-1)){
                indexes.add(i);
                myarr.add(new int[]{i, k.get(i)});
                b = k.get(i);
            }

        }
        return myarr;
    }
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        //g2D.drawImage(peter, x, y, null);

        g2D.setPaint(new Color(0x262424));
        g2D.setFont(new Font("Courier New", Font.BOLD, 15));
        g2D.drawString("population", 15, 35);

        g2D.setPaint(new Color(0x262424));
        g2D.setFont(new Font("Courier New", Font.BOLD, 15));
        g2D.drawString("time", 321, 375);

        g2D.setPaint(new Color(0x262424));
        g2D.setFont(new Font("Courier New", Font.BOLD, 32));
        //g2D.drawString("The Simulation has ended!", 217, 30);


        int endLine = 0;
        normalizevals(population);
        ArrayList<int[]>  fixedlist = fixlist(population);
        xAxis = (int) (800/(population.size()+1));
        int spacing=0;
        for (int i = 0;i<fixedlist.size()-1;i++) {
            int x1 = fixedlist.get(i)[0];
            int y1 = fixedlist.get(i)[1];
            int x= fixedlist.get(i+1)[0];
            int y= fixedlist.get(i+1)[1];
            g2D.setStroke(new BasicStroke(3));
            g2D.setColor(new Color(0xFC426A79, true));
            int[] arrx= {xAxis * x1 +40,xAxis * x1 +40,xAxis * x + 40,xAxis * x + 40};
            int[] arry={350,350 -y1,350 -y,350};
            //Polygon p= new Polygon(arrx,arry,4);
            g2D.fillPolygon(arrx,arry,4);
            g2D.setColor(new Color(0x000000));
            Shape l = new Line2D.Double(xAxis * x1 +40, 350 -y1,xAxis * x + 40,350 -y);
            g2D.draw(l);
            int cx = (xAxis * x1 +40)-(6/2);
            int cy = (350 -y1)-(6/2);
            g2D.fillOval(cx,cy,6,6);
            g2D.setPaint(new Color(0x000000));
            g2D.setFont(new Font("Courier New", Font.BOLD, 15));
            g2D.drawString("Population: ",800,25);
            g2D.drawString("Time: ",920,25);
            g2D.setFont(new Font("Courier New", Font.BOLD, 15));
            g2D.drawString(String.valueOf(popcopy.get(indexes.get(i))),804,spacing+45);
            g2D.setFont(new Font("Courier New", Font.BOLD, 15));
            if(i==0) g2D.drawString("0",924,spacing+45);
            else g2D.drawString(String.valueOf((x1+20)/4),924,spacing+45);
            spacing+=20;


        }
        g2D.setPaint(new Color(0x000000));
        g2D.setFont(new Font("Courier New", Font.BOLD, 17));
        g2D.drawString("Final: ",290,450);
        g2D.drawString("Initial: ",460,450);

        g2D.drawString("A value of: "+m.a,730,470);
        g2D.drawString("B value of: "+m.b,730,520);
        g2D.drawString("C value of : "+m.c,730,570);

        if (m.none==true){
            g2D.drawString("Dominant gene: "+"None",730,620);

        }
        else {
        if(m.dominantgene){
            g2D.drawString("Dominant gene: "+"Fast",730,620);


        }
        else if (m.dominantgene==false && m.none==false){
            g2D.drawString("Dominant gene: "+"Slow",730,620);}

        }








        g2D.setPaint(new Color(0x262424));
        g2D.setStroke(new BasicStroke(3));
        g2D.drawLine(40, 45, 40, 350);

        g2D.setPaint(new Color(0x262424));
        g2D.setStroke(new BasicStroke(3));
        g2D.drawLine(40, 350, 690, 350);
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