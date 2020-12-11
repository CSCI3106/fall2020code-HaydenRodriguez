package kattisproblems.csci3106;
/*
 * @author  Rodriguez, Hayden
 * @assignment  Kattis - Paradox With Averages
 * @date  November 25, 2020
 */

import java.util.*;
import java.io.*;

public class ParadoxWithAverages {

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int testCases = keyboard.nextInt();           // number of test cases

        for (int i = 0; i < testCases; i++) {
            int csStudents = keyboard.nextInt();        // number of CS students
            int econStudents = keyboard.nextInt();      // number of econ students

            ArrayList<Integer> csArray = new ArrayList<>();          // making CS array for scores
            ArrayList<Integer> econArray = new ArrayList<>();      // making econ array for scores

            for (int j = 0; j < csStudents; j++) {
                csArray.add(j, keyboard.nextInt());        // fill the array for CS scores
            }

            for (int k = 0; k < econStudents; k++) {
                econArray.add(k, keyboard.nextInt());     // fill the array for econ scores
            }

            int scoreTotal = 0;
            for (int l = 0; l < csArray.size(); l++) {
                scoreTotal += csArray.get(l);
            }
            double csAvg = (double) scoreTotal / csArray.size();     // calculate CS average

            scoreTotal = 0;
            for (int m = 0; m < econArray.size(); m++) {
                scoreTotal += econArray.get(m);
            }
            double econAvg = (double) scoreTotal / econArray.size(); // calculate econ average


            Collections.sort(csArray);                       // sort both of the arrays
            Collections.sort(econArray);

//            System.out.println(csStudents);
//            System.out.println(econStudents);
//            System.out.println(csArray.toString());
//            System.out.println(econArray.toString());
//            System.out.println(csAvg + " " + econAvg);

            double newCSAvg = 0;
            double newEconAvg = 0;
            int count = 0;
//            do {
                for(int n = 0; n < csArray.size(); n++)
                {
                    if(csArray.get(n) > econAvg && csArray.get(n) < csAvg){
//                        econArray.add(csArray.get(n));
//                        csArray.remove(n);
                        count++;
                    }
                }
//                econArray.add(csArray.get(0));                  // put lowest CS IQ into econ group
//                csArray.remove(0);                        // remove lowest IQ from CS group
//
//                scoreTotal = 0;
//                for (int l = 0; l < csArray.size(); l++) {
//                    scoreTotal += csArray.get(l);
//                }
//                newCSAvg = (double) scoreTotal / csArray.size();     // calculate CS average
//
//                scoreTotal = 0;
//                for (int m = 0; m < econArray.size(); m++) {
//                    scoreTotal += econArray.get(m);
//                }
//                newEconAvg = (double) scoreTotal / econArray.size(); // calculate econ average
//
//                count++;
////                System.err.println(newCSAvg + " " + newEconAvg);
////                System.err.println(csAvg + " " + econAvg);
//            } while (csAvg > newCSAvg && econAvg > newEconAvg);       // loops until both averages are higher

            System.out.println(count);

        }


    }

}
