import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DominantGenePanel extends JPanel implements ActionListener {
    JRadioButton fmen;
    JRadioButton fwomen;
    JRadioButton smen;
    JRadioButton swomen;
    DominantGenePanel(JFrame frame) {
        this.setLayout(new FlowLayout());
        fmen = new JRadioButton("philanderers");
        fwomen = new JRadioButton("fast women");
        smen = new JRadioButton("faithful men");
        swomen = new JRadioButton("coy women");


        this.setVisible(true);
        frame.add(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
