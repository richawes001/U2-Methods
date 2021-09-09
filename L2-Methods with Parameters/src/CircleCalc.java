import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {

        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius?"));

       areaCircle(radius);

       circumferenceCircle(radius);

        System.exit(0);

    }

    public static void areaCircle(double radius){

        DecimalFormat round = new DecimalFormat("#.##");

        double area = Math.PI * (Math.pow(radius, 2));

        JOptionPane.showMessageDialog(null, "Your circle's area is " + round.format(area));

    }

    public static void circumferenceCircle(double radius){

        DecimalFormat round = new DecimalFormat("#.##");

        double circumference = 2 * Math.PI * radius;

        JOptionPane.showMessageDialog(null, "Your circle's circumference is " + round.format(circumference));

    }

}
