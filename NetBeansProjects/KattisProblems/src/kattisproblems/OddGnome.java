/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;

public class OddGnome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int N = keyboard.nextInt();

        for (int i = 0; i < N; i++) {
            int gnomes = keyboard.nextInt();
            int[] gnomeArray = new int[gnomes];

            for (int j = 0; j < gnomes; j++) {
                gnomeArray[j] = keyboard.nextInt();
            }

            int start = gnomeArray[0];

            for (int k = 1; k < gnomeArray.length - 1; k++) {
                start++;
                if (gnomeArray[k] != start) {
                    System.out.println(k + 1);
                    break;
                }
            }
        }

    }

}
