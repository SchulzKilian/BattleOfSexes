import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LowerPanel extends JPanel{
    JButton startButton;
    JButton stopButton;

    LowerPanel(JFrame frame){
        this.setBackground(new Color(0xFFEDEBDE));
        startButton = new JButton();
        startButton.setFocusable(false);
        startButton.setLayout(null);
        startButton.setBounds(100,300,300,70);
        startButton.addActionListener(
                e -> {startButton.setEnabled(false);
                    stopButton.setEnabled(true);}
        );
        startButton.setOpaque(true);
        startButton.setText("start simulation");
        startButton.setFont(new Font("Courier New", Font.BOLD , 20));
        startButton.setForeground(new Color(0xFF7379C2));
        startButton.setBackground(new Color(0x07379C2, true));
        startButton.isBackgroundSet();

        stopButton = new JButton();
        stopButton.setFocusable(false);
        stopButton.setLayout(null);
        stopButton.setBounds(100,400,300,70);
        stopButton.addActionListener(
                e -> {startButton.setEnabled(true);
                    stopButton.setEnabled(false);}
        );
        stopButton.setOpaque(true);
        stopButton.setText("stop simulation");
        stopButton.setFont(new Font("Courier New", Font. BOLD , 20));
        stopButton.setForeground(new Color(0x7379C2));
        stopButton.setBackground(new Color(0x07379C2, true));
        stopButton.isBackgroundSet();

        this.setLayout(null);
        //this.setBounds(920,350,450,500);
        this.add(startButton);
        this.add(stopButton);
        this.setVisible(true);
        //frame.add(this);
    }
}