/*
/* take one line of input containing two numbers, reverse the numbers,
/* and display back the greater of the two numbers.
 */
package kattisproblems;

/**
 *
 * @author Hayden Rodriguez
 */
import java.util.*;
public class Filip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        StringBuffer one = new StringBuffer(keyboard.next());
        StringBuffer two = new StringBuffer(keyboard.next());
        
        String number1 = one.reverse().toString();
        String number2 = two.reverse().toString();
        
        int first = Integer.parseInt(number1);
        int second = Integer.parseInt(number2);
        
        System.out.println(Math.max(first, second));
    }
    
}
