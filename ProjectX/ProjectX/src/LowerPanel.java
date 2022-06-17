import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LowerPanel extends JPanel{
    JButton startButton;
    JButton stopButton;
    ArrayList<Integer> population;
    LowerPanel(JFrame frame, ArrayList<Integer> pop, Main m){
        population = pop;
        this.setBackground(new Color(0xFFEDEBDE, true));
        this.setBounds(1170,500,210,175);
        startButton = new JButton();
        startButton.setFocusable(false);
        startButton.setLayout(null);
        startButton.setBounds(5,5,200,80);
        startButton.addActionListener(
                e -> {
                    m.inputs.getvalue();
                    Main.allowed = true;
                    startButton.setEnabled(false);
                    stopButton.setEnabled(true);
                    m.calltoaction();

                }
        );
        startButton.setOpaque(true);
        startButton.setText("<html>start simulation");
        startButton.setFont(new Font("Courier New", Font.BOLD , 20));
        startButton.setForeground(new Color(0xFF7379C2));
        startButton.setBackground(new Color(0x07379C2, true));
        startButton.isBackgroundSet();

        stopButton = new JButton();
        stopButton.setFocusable(false);
        stopButton.setEnabled(false);
        stopButton.setLayout(null);
        stopButton.setBounds(5,90,200,80);
        stopButton.addActionListener(
                e -> {startButton.setEnabled(true);
                    stopButton.setEnabled(false);
                    Main.allowed = false;
                    System.out.println(population);
                    statsFrame statistics = new statsFrame(population);
                    statistics.show();

                }
        );
        stopButton.setOpaque(true);
        stopButton.setText("stop simulation");
        stopButton.setFont(new Font("Courier New", Font. BOLD , 20));
        stopButton.setForeground(new Color(0x7379C2));
        stopButton.setBackground(new Color(0x07379C2, true));
        stopButton.isBackgroundSet();

        this.setLayout(null);
        this.add(startButton);
        this.add(stopButton);
        this.setVisible(true);
    }
}