import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleFrame
{

    public static void main(String[] args)
    {
        JFrame window = new JFrame("This is a simple window.");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click for 1 Vbuck");

        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // window centered on screen
        window.setLocationRelativeTo(null);

        button.addActionListener(new ButtonListener());

        panel.add(button);
        window.add(panel);

        // always be last
        window.setVisible(true);

    }

    private static class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e){

            JOptionPane.showMessageDialog(null, "You just got a Vbuck");

        }

    }

}
