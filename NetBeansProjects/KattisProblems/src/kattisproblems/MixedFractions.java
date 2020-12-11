/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;
public class MixedFractions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int numerator= keyboard.nextInt();
        int denominator = keyboard.nextInt();
        
        while(numerator!=0 && denominator!=0)
        {
            System.out.println((numerator/denominator)+ " "+(numerator%denominator)+ " / " + denominator);
            numerator= keyboard.nextInt();
            denominator = keyboard.nextInt();
        }
    }
    
}
