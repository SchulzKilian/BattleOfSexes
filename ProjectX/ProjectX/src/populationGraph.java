import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicSplitPaneUI;

import static java.awt.Color.BLACK;

public class populationGraph extends JPanel {// draw rectangles and arcs
    int[][] population;   //[0] time, [1] num pop
    int popSize = population.length;
    populationGraph(int[][] population,JFrame frame) {
        this.setLayout(null);
        this.setBounds(920,10,500,300);
        this.setBackground(new Color(0xFFEDEBDE, true));
        JLabel time = new JLabel("<html>t<br>i<br>m<br>e</html>");
        time.setHorizontalTextPosition(JLabel.CENTER);
        time.setFont(new Font("Courier New", Font.PLAIN , 9));
        time.setBounds(0,100,13,13);
        JLabel pop = new JLabel("population");
        pop.setFont(new Font("Courier New", Font.PLAIN , 9));
        time.setBounds(200,290,20,10);
        frame.add(this);
    }

    public void paintComponent(Graphics g){ //, int a1,int a2, int a3 ,int a4) {
        super.paintComponent(g);
        g.setColor(new Color(0x0000FFF, true));
        g.drawLine(15,15,15,285);
        g.drawLine(15,285,15,485);
        for (int i=0; i<popSize-1; i++){
            g.setColor(new Color (0x50673E));
            g.drawLine((population[i][0])+15,(population[i][1])+15,(population[i+1][0])+15,(population[i+1][1])+15);
        }
    }
}