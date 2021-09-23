import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */

    /* The Plan
    1. Get Input - The word
    2. Figure out where the first P is (Isolate it)
    3. Isolate the next three letters
    4. Display results
     */

    public static void main(String[] args){

    String word = JOptionPane.showInputDialog("Enter a word that has a p, and three letters after it.");

    JOptionPane.showMessageDialog(null, splitPeas(word));

    System.exit(0);

    }

    public static String splitPeas(String word){

       int pIndex = word.indexOf('p');

       String split = word.substring(pIndex, pIndex + 4);

       return split;

    }

}
