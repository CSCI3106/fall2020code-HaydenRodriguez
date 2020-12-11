package kattisproblems.csci3106;
/*
 * @author  Rodriguez, Hayden
 * @assignment  Kattis - Sok
 * @date  Octeober 31, 2020
 */

import java.util.*;

public class Sok {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // amounts of juices
        Double orange = keyboard.nextDouble();
        Double apple = keyboard.nextDouble();
        Double pine = keyboard.nextDouble();
        // ratio of juices
        Double oPer = keyboard.nextDouble();
        Double aPer = keyboard.nextDouble();
        Double pPer = keyboard.nextDouble();
        Double oRatio = orange / oPer;
        Double aRatio = apple / aPer;
        Double pRatio = pine / pPer;

        Double keyRatio = Math.min(Math.min(oRatio, aRatio), pRatio);

        Double oLeft, aLeft, pLeft;
        if (keyRatio == oRatio)
            oLeft = 0.0;
        else
            oLeft = orange - (keyRatio * oPer);

        if (keyRatio == aRatio)
            aLeft = 0.0;
        else
            aLeft = apple - (keyRatio * aPer);

        if (keyRatio == pRatio)
            pLeft = 0.0;
        else
            pLeft = pine - (keyRatio * pPer);

        System.out.println(oLeft + " " + aLeft + " " + pLeft);


    }

}
