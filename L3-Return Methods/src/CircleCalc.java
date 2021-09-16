import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {

    //create and run the program

    public static void main(String[] args) {

        // 1.
        double radius = getInput("Please enter the radius.");
        // 2.
        double area = area(radius);
        // 3.
        double perimeter = perimeter(radius);
        // 4.
        JOptionPane.showMessageDialog(null, displayResults(area, perimeter));

        System.exit(0);

    }

     //method to get input from user   USEFUL

    public static double getInput(String message){

        return Double.parseDouble(JOptionPane.showInputDialog(message));

    }

    //re-write the method to calculate a circle's area using parameters and return statement

    public static double area(double radius){

        return Math.PI * (Math.pow(radius, 2));

    }

    //re-write the method to calculate a circle's perimeter using parameters and return statement

    public static double perimeter(double radius){

        return 2 * Math.PI * radius;

    }

    public static String displayResults(double area, double perimeter){

        DecimalFormat round = new DecimalFormat("#.00");

        String message = "The area is: " + round.format(area);

        message += "\nThe perimeter is: " + round.format(perimeter);

        return message;


    }

}
