package kattisproblems.csci3106;

/**
 * A short description of the program.
 * Algorithm(step by step pseudocode)
 *
 * @author Rodriguez, Hayden
 * @assignment SavingForRetirement - Kattis
 * @date November 14, 2020
 */

import java.util.*;

public class SavingForRetirement {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int bobAge = keyboard.nextInt();
        int bobRetireAge = keyboard.nextInt();
        int bobYearlySavings = keyboard.nextInt();
        int aliceAge = keyboard.nextInt();
        int aliceYearlySavings = keyboard.nextInt();
        int aliceRetireAge;                             // find

        int bobTotal = (bobRetireAge - bobAge) * bobYearlySavings;

        System.out.println(aliceAge + ((bobTotal / aliceYearlySavings) + 1));
    }

}
