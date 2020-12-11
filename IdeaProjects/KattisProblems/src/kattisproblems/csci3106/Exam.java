package kattisproblems.csci3106;
/*
 * @author  Rodriguez, Hayden
 * @assignment  Kattis - Exam
 * @date  November 30, 2020
 */

import java.util.*;

public class Exam {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int friendCorrect = keyboard.nextInt();
        String myAnswers = keyboard.next();
        String friendAnswers = keyboard.next();

        int sameAns = 0;
        int diffAns = 0;
        for (int i = 0; i < myAnswers.length(); i++) {
            if (myAnswers.charAt(i) == friendAnswers.charAt(i)) {
                sameAns++;
            } else {
                diffAns++;
            }
        }

        int myCorrect = 0;

        if (sameAns >= friendCorrect) {
            myCorrect = myCorrect + friendCorrect;
            myCorrect = myCorrect + (myAnswers.length() - sameAns);
        } else {
            myCorrect = myCorrect + sameAns;
            myCorrect = myCorrect + (myAnswers.length() - friendCorrect);
        }
        System.out.println(myCorrect);

    }
}

