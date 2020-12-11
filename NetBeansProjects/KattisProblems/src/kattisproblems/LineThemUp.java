/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;

public class LineThemUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int n = keyboard.nextInt();
        if (n > 2) {
            int[] initial = new int[n];

            for (int i = 0; i < n; i++) {
                char temp = keyboard.next().charAt(0);
                initial[i] = temp;
            }

            boolean isIncreasing = true;
            for (int i = 0; i < n - 1; i++) {
                if (initial[i] > initial[i + 1]) {
                    isIncreasing = false;
                }
            }

            if (isIncreasing == true) {
                System.out.println("INCREASING");
            }

            boolean isDecreasing = true;
            for (int i = 0; i < n - 1; i++) {
                if (initial[i] < initial[i + 1]) {
                    isDecreasing = false;
                }
            }

            if (isDecreasing == true) {
                System.out.println("DECREASING");
            }

            if (isIncreasing == false && isDecreasing == false) {
                System.out.println("NEITHER");
            }
        } else if (n == 2) {
            int[] initial = new int[n];

            initial[0] = keyboard.next().charAt(0);
            initial[1] = keyboard.next().charAt(0);

            boolean isIncreasing = true;
            if (initial[0] >= initial[1]) {
                isIncreasing = false;
            }
            if (isIncreasing == true) {
                System.out.println("INCREASING");
            }

            boolean isDecreasing = true;
            if (initial[0] <= initial[1]) {
                isDecreasing = false;
            }
            if (isDecreasing == true) {
                System.out.println("DECREASING");
            }

            if (isIncreasing == false && isDecreasing == false) {
                System.out.println("NEITHER");
            }
        }
    }

}
