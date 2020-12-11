/*
ALgorithm:
1. Take the number of lines (n) that the user is going to input
2. Use that number in a loop to take n amount of lines 
3. Each line has two numbers that are going to be multiplied
4. Add the sum of the products and output it.
*/
package kattisproblems;

/**
 *
 * @author Hayden Rodriguez
 */
import java.util.*;
public class QALY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int n = keyboard.nextInt();
        double sum = 0;
        
        for(int i=0; i<n; i++)
        {
           String xWord = keyboard.next();
           String yWord = keyboard.next();
           
           double x = Double.parseDouble(xWord);
           double y = Double.parseDouble(yWord);
           
           sum = (x*y) + sum;
            
        }
        System.out.println(sum);
    }
    
}
