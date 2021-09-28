import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
    */

    public static void main(String[] args) {

        JFrame window = new JFrame("Feet to meters, and vice-versa");

        JPanel panel = new JPanel();

        JButton button1 = new JButton("Convert feet to meters.");
        JButton button2 = new JButton("Convert meters to feet.");

        window.setSize(350, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setLocationRelativeTo(null);

        button1.addActionListener(new Button1Listener());
        button2.addActionListener(new Button2Listener());

        panel.add(button1);
        panel.add(button2);

        window.add(panel);

        window.setVisible(true);

    }

    private static class Button1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e){

            DecimalFormat round = new DecimalFormat("#.##");

            double feet = Double.parseDouble(JOptionPane.showInputDialog("Please enter your distance."));

            double meters = feet / 3.281;

            JOptionPane.showMessageDialog(null, round.format(meters) + " meters");

        }

    }

    private static class Button2Listener implements ActionListener {

        public void actionPerformed(ActionEvent e){

            DecimalFormat round = new DecimalFormat("#.##");

            double meters = Double.parseDouble(JOptionPane.showInputDialog("Please enter your distance."));

            double feet = meters * 3.281;

            JOptionPane.showMessageDialog(null, round.format(feet) + " feet");

        }

    }

}
