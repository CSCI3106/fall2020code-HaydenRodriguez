/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;

public class DigitProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);          

        String numString = keyboard.next();
        int[] numArray = new int[numString.length()];
        int product;

        for (int i = 0; i < numString.length(); i++) {
            char temp = numString.charAt(i);
            String temp2 = Character.toString(temp);
            numArray[i] = Integer.parseInt(temp2);
        }

        do {

            product = 1;
            for (int i = 0; i < numArray.length; i++) {
                if (numArray[i] != 0) {
                    product *= numArray[i];
                }
            }

            String number = Integer.toString(product);
            Arrays.fill(numArray, 0);
            for (int i = 0; i < number.length(); i++) {
                char temp = number.charAt(i);
                String temp2 = Character.toString(temp);
                numArray[i] = Integer.parseInt(temp2);
            }

        } while (product > 9);

        System.out.println(product);
    }

}
