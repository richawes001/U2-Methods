import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */

    static JTextField inputNumberField1, inputNumberField2;
    static JLabel resultLabel;

    public static void main(String[] args) {

        JFrame window = new JFrame("Calculator");
        JPanel panel = new JPanel();

        JLabel inputLabel1 = new JLabel("Enter first number: ");
        JLabel inputLabel2 = new JLabel("Enter second number: ");
        inputNumberField1 = new JTextField(15);
        inputNumberField2 = new JTextField(15);

        JButton buttonAdd = new JButton("Add");
        JButton buttonSub = new JButton("Subtract");
        JButton buttonMulti = new JButton("Multiply");
        JButton buttonDivide = new JButton("Divide");

        resultLabel = new JLabel("0.00");

        window.setSize(200, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        buttonAdd.addActionListener(new ButtonAddListener());
        buttonSub.addActionListener(new ButtonSubListener());
        buttonMulti.addActionListener(new ButtonMultiListener());
        buttonDivide.addActionListener(new ButtonDivideListener());

        panel.add(inputLabel1);
        panel.add(inputNumberField1);
        panel.add(inputLabel2);
        panel.add(inputNumberField2);

        panel.add(resultLabel);

        panel.add(buttonAdd);
        panel.add(buttonSub);
        panel.add(buttonMulti);
        panel.add(buttonDivide);

        window.add(panel);

        window.setVisible(true);

    }

    private static class ButtonAddListener implements ActionListener{

        /*
         1. Get Input - from the Text Fields
         2. Do the math with the Input
         3. Output to the result label
        */

        public void actionPerformed(ActionEvent e){

            double number1 = Double.parseDouble(inputNumberField1.getText());
            double number2 = Double.parseDouble(inputNumberField1.getText());

            resultLabel.setText(String.valueOf(number1 + number2));

        }

    }

    private static class ButtonSubListener implements ActionListener{

        public void actionPerformed(ActionEvent e){

            double number1 = Double.parseDouble(inputNumberField1.getText());
            double number2 = Double.parseDouble(inputNumberField1.getText());

            resultLabel.setText(String.valueOf(number1 - number2));

        }

    }

    private static class ButtonMultiListener implements ActionListener{

        public void actionPerformed(ActionEvent e){

            double number1 = Double.parseDouble(inputNumberField1.getText());
            double number2 = Double.parseDouble(inputNumberField1.getText());

            resultLabel.setText(String.valueOf(number1 * number2));

        }

    }

    private static class ButtonDivideListener implements ActionListener{

        public void actionPerformed(ActionEvent e){

            double number1 = Double.parseDouble(inputNumberField1.getText());
            double number2 = Double.parseDouble(inputNumberField1.getText());

            resultLabel.setText(String.valueOf(number1 / number2));

        }

    }

}
