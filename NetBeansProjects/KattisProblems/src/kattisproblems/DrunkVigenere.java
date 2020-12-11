/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;

public class DrunkVigenere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);                      // A=65 Z=90 , (int)'A'-65=0

        String message = keyboard.nextLine();
        String key = keyboard.nextLine();
        int[] messageNums = new int[message.length()];
        int[] keyNums = new int[key.length()];

        for (int i = 0; i < message.length(); i++) {
            messageNums[i] = (int) message.charAt(i);
        }

        for (int i = 0; i < key.length(); i++) {
            keyNums[i] = (int) key.charAt(i) - 65;
        }

        int[] decryption = new int[message.length()];

        for (int i = 0; i < message.length(); i++) {
            int sum;
            if (i % 2 != 0) {
                sum = messageNums[i] + keyNums[i];
            } else {
                sum = messageNums[i] - keyNums[i];
            }

            if (sum > 90) {
                sum -= 26;
            }
            if (sum < 65) {
                sum += 26;
            }
            decryption[i] = sum;
        }

        for (int i = 0; i < decryption.length; i++) {
            System.out.print((char) decryption[i]);
        }

    }

}
