import javax.swing.*;

public class LastLetterWord {

    /*
    Create a program that takes the last 3 letters of each String
    and outputs them as one string.

    Use a method to find and return the last three letters and a string parameter.

    Ex:  Goodbye, Hello, Morning -> byelloing
    */

    /* The Plan
    1. Get Input
    2. Isolate last three letters of any word
    3. Combine 2. of all three words
    4. Display results
    */


    public static void main(String[] args) {

        String wordOne = JOptionPane.showInputDialog("Enter word one.");
        String wordTwo = JOptionPane.showInputDialog("Enter word two.");
        String wordThree = JOptionPane.showInputDialog("Enter word three.");

        String output = lastThree(wordOne) + lastThree(wordTwo) + lastThree(wordThree);

        JOptionPane.showMessageDialog(null, output);

        System.exit(0);

    }

    public static String lastThree(String word){

        String newWord;

        if(word.length() <=3) {
            newWord = word;
        }else{
            newWord = word.substring(word.length()-3);
        }

        return newWord;

    }

}
