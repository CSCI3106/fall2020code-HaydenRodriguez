package kattisproblems.csci3106;

/**
 * A short description of the program.
 * Algorithm(step by step pseudocode)
 *
 * @author Rodriguez, Hayden
 * @assignment Recount - Kattis
 * @date November 4, 2020
 */

import java.util.*;
import java.io.*;

public class Recount {

    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> names = new ArrayList<String>();          // ArrayList to hold all names

        do {
            names.add(keyboard.readLine());                         // fills array list with ALL names
        } while (!names.get(names.size() - 1).equals("***"));

        names.remove(names.size() - 1);                         // removes *** when done

        Collections.sort(names);

        int count = 1;
        int maxCount = 0;
        String winner = names.get(0);
        for (int i = 1; i < names.size(); i++) {
            if (names.get(i).equals(names.get(i - 1))) {
                count++;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                    winner = names.get(i - 1);

                } else if (maxCount == count) {
                    winner = "Runoff!";
                }
                count = 1;
            }
        }
        if (maxCount < count) {
            maxCount = count;
            winner = names.get(names.size() - 1);
        } else if (maxCount == count) {
            winner = "Runoff!";
        }

        System.out.println(winner);

    }

}
