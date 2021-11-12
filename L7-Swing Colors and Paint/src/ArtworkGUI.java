import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    //DECLARE VARIABLES

    JFrame frame;
    Color colorOne = new Color(255, 187, 187);
    Color colorTwo = new Color(255, 28, 28);
    Color colorThree = new Color(147, 69, 69);
    Color colorFour = new Color(110, 94, 94);
    Color colorFive = new Color(155, 57, 57);
    Color colorSix = new Color(180, 138, 138);

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

            setBackground(colorSix);

        }

        //Add the PaintComponent Method and create your drawing.

        public void paintComponent(Graphics g){

            super.paintComponent(g);

            g.setColor(colorOne);
            g.drawLine(200, 225, 300, 375);
            g.drawLine(200,225, 100, 375);
            g.drawLine(100, 375, 300, 375);

            g.setColor(colorTwo);
            g.fillRect(100, 375, 200, 225);

            g.setColor(colorThree);
            g.fillRect(125, 400, 150, 175);

            g.setColor(colorFour);
            g.fillRect(150, 425, 100, 125);

            g.setColor(colorFive);
            g.fillRect(175, 450, 50, 75);


        }

    }
}
