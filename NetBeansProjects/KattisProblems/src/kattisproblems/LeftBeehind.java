/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;

public class LeftBeehind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int sweet = keyboard.nextInt();
        int sour = keyboard.nextInt();

        while (true) {
            if (sweet + sour == 13) {
                System.out.println("Never speak again.");
            } else {
                if (sweet == sour) {
                    System.out.println("Undecided.");
                } else if (sweet > sour) {
                    System.out.println("To the convention.");
                } else if (sweet < sour) {
                    System.out.println("Left beehind.");
                }
            }

            sweet = keyboard.nextInt();
            sour = keyboard.nextInt();
            if (sweet == 0 && sour == 0) {
                break;
            }
        }
    }

}
