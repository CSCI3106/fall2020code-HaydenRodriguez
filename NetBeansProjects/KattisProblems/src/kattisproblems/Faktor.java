/*
Algorithm;
1. Take one line of code containing two numbers
2. Multiply the two numbers, then minus the first number from the product
3. Add one to the difference and display it back
 */
package kattisproblems;

/**
 *
 * @author Hayden Rodriguez
 */
import java.util.*;
public class Faktor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int x = Integer.parseInt(keyboard.next());
        int y = Integer.parseInt(keyboard.next());
        
        int prod = x*y;
        prod = (prod - x) + 1 ;
        
        System.out.println(prod);
    }
    
}
