/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;

public class OddManOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int counter = keyboard.nextInt();

        for (int i = 1; i <= counter; i++) {
            int guests = keyboard.nextInt();

            long[] inviteNums = new long[guests];
            for (int j = 0; j < guests; j++) {
                inviteNums[j] = keyboard.nextLong();
            }

            Arrays.sort(inviteNums);
            for (int k = 0; k < inviteNums.length; k = k + 2) {
                if (inviteNums.length - 1 != k) {
                    if (inviteNums[k] != inviteNums[k + 1]) {
                        System.out.println("Case #" + i + ": " + inviteNums[k]);
                        break;
                    }
                } else if (k == inviteNums.length - 1) {
                    System.out.println("Case #" + i + ": " + inviteNums[k]);
                }

            }

        }
    }

}
