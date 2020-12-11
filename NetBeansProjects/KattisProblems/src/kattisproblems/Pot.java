/*
Algorithm:
1. Take a number n between 1 and 10
2. Use that number in a loop to run n times
3. In loop, accept n number of new int values
4. From those values, interpret the last digit as an exponent
5. Using this, add the total of all the values and display.
 */
package kattisproblems;

/**
 *
 * @author Hayden Rodriguez
 */
import java.util.*;
public class Pot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int n = Integer.parseInt(keyboard.nextLine());
        long sum = 0;
        
        for(int i=0; i<n; i++)
        {
            String entry = keyboard.next();
            sum += Math.pow(Integer.parseInt(entry.substring(0, entry.length()-1)), entry.charAt(entry.length()-1)-'0');
        }
        
        System.out.println(sum);
    }
    
}
