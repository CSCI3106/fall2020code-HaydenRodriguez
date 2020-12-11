package kattisproblems.csci3106;
/*
 * @author  Rodriguez, Hayden
 * @assignment  Kattis - Mirror Images
 * @date  November 19, 2020
 */

import java.util.*;

public class MirrorImages {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int N = keyboard.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Test " + (i + 1));
            int rows = keyboard.nextInt();
            keyboard.nextLine();
            String[] output = new String[rows];
            for (int j = rows; j > 0; j--) {
                output[j - 1] = new StringBuilder(keyboard.nextLine()).reverse().toString();
            }
            for (String j : output) {
                System.out.println(j);
            }
        }

    }

}
