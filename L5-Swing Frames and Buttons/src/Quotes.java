import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
    */

    public static void main(String[] args) {

        JFrame window = new JFrame("The window that has buttons for quotes.");

        JPanel panel = new JPanel();

        JButton button1 = new JButton("Click for Quote 1");
        JButton button2 = new JButton("Click for Quote 2");
        JButton button3 = new JButton("Click for Quote 3");

        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setLocationRelativeTo(null);

        button1.addActionListener(new Button1Listener());
        button2.addActionListener(new Button2Listener());
        button3.addActionListener(new Button3Listener());

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        window.add(panel);

        window.setVisible(true);

    }

    private static class Button1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e){

            JOptionPane.showMessageDialog(null, "Jennifer dumped me. \n Arin Hanson from that one episode of Battle Kid");

        }

    }

    private static class Button2Listener implements ActionListener{

        public void actionPerformed(ActionEvent e){

            JOptionPane.showMessageDialog(null, "I'm not seeing enough movement! \n Tyler Blevins from New Years 2019");

        }

    }

    private static class Button3Listener implements ActionListener{

        public void actionPerformed(ActionEvent e){

            JOptionPane.showMessageDialog(null, "What? \n Wesley Richards from every single day");

        }

    }

}
