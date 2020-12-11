/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;
public class lastFactorialDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int counter = keyboard.nextInt();
        
        for(int i=0; i<counter; i++)
        {
            int factorial = keyboard.nextInt();
            int factSum=1;
            
            for(int j=1; j<=factorial; j++)
            {
                factSum *= j;
            }
            String answer = Integer.toString(factSum);
            System.out.println(answer.charAt(answer.length()-1));
        }
    }
    
}
