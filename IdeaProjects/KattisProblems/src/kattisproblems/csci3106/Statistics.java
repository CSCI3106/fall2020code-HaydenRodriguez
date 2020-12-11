package kattisproblems.csci3106;
/*
 * @author  Rodriguez, Hayden
 * @assignment  Kattis - Statistics
 * @date  Date October 28, 2020
 */

import java.util.*;

public class Statistics {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int count = 1;
        while (keyboard.hasNextInt()) {
            int N = keyboard.nextInt();
            int[] numbers = new int[N];

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                numbers[i] = keyboard.nextInt();

                if (numbers[i] > max)
                    max = numbers[i];
                if (numbers[i] < min)
                    min = numbers[i];
            }
            System.out.println("Case " + count + ": " + min + " " + max + " " + (max - min));
            count++;
        }
    }

}
