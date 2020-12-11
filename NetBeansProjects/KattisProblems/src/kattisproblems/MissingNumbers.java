/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;

public class MissingNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();

        int[] kidsNums = new int[n];

        for (int i = 0; i < n; i++) {
            kidsNums[i] = keyboard.nextInt();
        }

        int[] correctNums = new int[kidsNums[n - 1]];
        for (int i = 0; i < kidsNums[n - 1]; i++) {
            correctNums[i] = i + 1;
        }

        if (Arrays.equals(kidsNums, correctNums)) {
            System.out.println("good job");
        } else {

            for (int i = 0; i < correctNums.length; i++) {

                if (Arrays.binarySearch(kidsNums, correctNums[i]) < 0) {
                    System.out.println(correctNums[i]);
                }

            }
        }

    }

}
