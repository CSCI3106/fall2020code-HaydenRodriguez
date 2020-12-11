/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;

public class Sibice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int matches = keyboard.nextInt();
        double length = keyboard.nextDouble();
        double width = keyboard.nextDouble();
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

        for (int i = 1; i <= matches; i++) {
            double matchLength = keyboard.nextDouble();
            if (matchLength <= diagonal) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }

    }

}
