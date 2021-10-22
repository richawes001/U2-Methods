import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    //Declare your frame, panel and three buttons.

    JFrame window;
    JPanel panel;
    JButton colorClicker1;
    JButton colorClicker2;
    JButton colorClicker3;
    Color panelBackground1 = new Color(198, 213, 126);
    Color buttonForeground1 = new Color(162, 205, 205);
    Color buttonBackground1 = new Color(213, 126, 126);
    Color panelBackground2 = new Color(59, 0, 0);
    Color buttonForeground2 = new Color(133, 40, 40);
    Color buttonBackground2 = new Color(255, 149, 197);
    Color panelBackground3 = new Color(81, 45 ,109);
    Color buttonForeground3 = new Color(10, 55, 77);
    Color buttonBackground3 = new Color(0, 193, 212);

    public ColorSwitchGUI(){

        //create your GUI

        window = new JFrame("Color Switch");
        panel = new JPanel();
        colorClicker1 = new JButton("Change the Colors");
        colorClicker2 = new JButton("Change the Colors");
        colorClicker3 = new JButton("Change the Colors");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340, 127);
        window.setLocationRelativeTo(null);

        colorClicker1.addActionListener(new ColorChanger1());
        colorClicker2.addActionListener(new ColorChanger2());
        colorClicker3.addActionListener(new ColorChanger3());

        panel.add(colorClicker1);
        panel.add(colorClicker2);
        panel.add(colorClicker3);
        window.add(panel);

        window.setVisible(true);

    }

    //add listeners to change the colors. Don't forget to link them to buttons.

    private  class ColorChanger1 implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {

            panel.setBackground(buttonForeground1);
            colorClicker1.setForeground(buttonBackground1);
            colorClicker1.setBackground(panelBackground1);
            colorClicker2.setForeground(buttonBackground1);
            colorClicker2.setBackground(panelBackground1);
            colorClicker3.setForeground(buttonBackground1);
            colorClicker3.setBackground(panelBackground1);

        }

    }

    private  class ColorChanger2 implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {

            panel.setBackground(buttonForeground2);
            colorClicker2.setForeground(buttonBackground2);
            colorClicker2.setBackground(panelBackground2);
            colorClicker1.setForeground(buttonBackground2);
            colorClicker1.setBackground(panelBackground2);
            colorClicker3.setForeground(buttonBackground2);
            colorClicker3.setBackground(panelBackground2);
        }

    }

    private  class ColorChanger3 implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {

            panel.setBackground(buttonForeground3);
            colorClicker3.setForeground(buttonBackground3);
            colorClicker3.setBackground(panelBackground3);
            colorClicker1.setForeground(buttonBackground3);
            colorClicker1.setBackground(panelBackground3);
            colorClicker2.setForeground(buttonBackground3);
            colorClicker2.setBackground(panelBackground3);
        }

    }

}
