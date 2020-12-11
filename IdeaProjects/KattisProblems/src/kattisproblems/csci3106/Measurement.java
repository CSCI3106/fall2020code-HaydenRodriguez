package kattisproblems.csci3106;
/*
 * @author  Rodriguez, Hayden
 * @assignment  Kattis - Measurement
 * @date  December 1, 2020
 */

import java.util.*;

public class Measurement {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Double number = keyboard.nextDouble();
        String fromUnit = keyboard.next();
        keyboard.next();
        String toUnit = keyboard.next();
        Double[] conversions = {1.0, 1000.0, 12.0, 3.0, 22.0, 10.0, 8.0, 3.0};

        if (fromUnit.length() > 3) {
            if (fromUnit.equals("thou"))
                fromUnit = "th";
            else if (fromUnit.equals("inch"))
                fromUnit = "in";
            else if (fromUnit.equals("foot"))
                fromUnit = "ft";
            else if (fromUnit.equals("yard"))
                fromUnit = "yd";
            else if (fromUnit.equals("chain"))
                fromUnit = "ch";
            else if (fromUnit.equals("furlong"))
                fromUnit = "fur";
            else if (fromUnit.equals("mile"))
                fromUnit = "mi";
            else if (fromUnit.equals("league"))
                fromUnit = "lea";
        }
        if (toUnit.length() > 3) {
            if (toUnit.equals("thou"))
                toUnit = "th";
            else if (toUnit.equals("inch"))
                toUnit = "in";
            else if (toUnit.equals("foot"))
                toUnit = "ft";
            else if (toUnit.equals("yard"))
                toUnit = "yd";
            else if (toUnit.equals("chain"))
                toUnit = "ch";
            else if (toUnit.equals("furlong"))
                toUnit = "fur";
            else if (toUnit.equals("mile"))
                toUnit = "mi";
            else if (toUnit.equals("league"))
                toUnit = "lea";
        }
        String[] units = {"th","in","ft","yd","ch","fur","mi","lea"};
        int start = 0;
        int end = 0;
        for(int i = 0; i < units.length; i++)
        {
            if(fromUnit.equals(units[i])) {
                start = i;
                break;
            }
        }
        for(int i = 0; i < units.length; i++)
        {
            if(toUnit.equals(units[i])) {
                end = i;
                break;
            }
        }

        if(start < end) {
            for(int i = start+1; i <= end; i++)
            {
                number = number / conversions[i];
            }
        }else if(end < start) {
            for(int i = start; i > end; i--)
            {
                number = number * conversions[i];
            }
        }
        System.out.println(number);
    }

}
