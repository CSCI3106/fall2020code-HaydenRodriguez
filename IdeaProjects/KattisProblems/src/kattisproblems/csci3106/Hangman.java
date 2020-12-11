package kattisproblems.csci3106;

/**
 * A short description of the program.
 * Algorithm(step by step pseudocode)
 *
 * @author Rodriguez, Hayden
 * @assignment Hangman - Kattis
 * @date October 31, 2020
 */

import java.util.*;

public class Hangman {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        String guessOrder = keyboard.nextLine();

        ArrayList<Character> charList = new ArrayList<Character>();       // list of letters w/ NO DUPLICATES

        for (int i = 0; i < word.length(); i++) {                         // fills charList w/ NO DUPLICATES
            if (!charList.contains(word.charAt(i))) {
                charList.add(word.charAt(i));
            }
        }

        int reqMatches = charList.size();                                  // reqMatches = number of correct guesses to win
        int matches = 0;                                                   // matches = stores correct guesses
        int wrongGuess = 0;                                                // loses once reaches 10

        for (int i = 0; i < 26; i++) {
            if (charList.contains(guessOrder.charAt(i))) {                   // adds number of correct guesses
                matches++;
                if (matches == reqMatches) {
                    System.out.println("WIN");
                    break;
                }
            } else {
                wrongGuess++;
                if (wrongGuess == 10) {
                    System.out.println("LOSE");
                    break;
                }
            }
        }

//        System.out.println(word);
//        System.out.println(guessOrder);
//        System.out.println(charList.toString());
//        System.out.println("reqMatches:" + reqMatches);
//        System.out.println("Matches:" + matches);

    }

}
