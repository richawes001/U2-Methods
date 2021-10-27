import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    //DECLARE VARIABLES

    JFrame frame;

    public ArtworkGUI() {
        //CREATE THE GUI

        frame = new JFrame("Artwork");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new MyDrawing();

        frame.add(panel);
        frame.setVisible(true);

    }

    private class MyDrawing extends JPanel{

        public MyDrawing(){
            //Set the background color

            setBackground(Color.cyan);

        }

        //Add the PaintComponent Method and create your drawing.

        public void paintComponent(Graphics g){

            super.paintComponent(g);

            g.setColor(Color.red);
            g.drawLine(200, 225, 300, 375);
            g.drawLine(200,225, 100, 375);
            g.drawLine(100, 375, 300, 375);

            g.setColor(Color.black);
            g.fillRect(100, 375, 200, 225);

            g.setColor(Color.darkGray);
            g.fillRect(125, 400, 150, 175);

            g.setColor(Color.lightGray);
            g.fillRect(150, 425, 100, 125);

            g.setColor(Color.white);
            g.fillRect(175, 450, 50, 75);


        }

    }
}
