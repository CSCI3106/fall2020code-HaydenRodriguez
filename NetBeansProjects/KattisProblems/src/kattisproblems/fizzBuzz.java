/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;
public class fizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int fizz = Integer.parseInt(keyboard.next());
        int buzz = Integer.parseInt(keyboard.next());
        int n = Integer.parseInt(keyboard.next());
        
        for (int i=1; i<=n; i++)
        {
            if(i%fizz==0 && i%buzz==0)
                System.out.println("FizzBuzz");
            else if(i%fizz==0)
                System.out.println("Fizz");
            else if(i%buzz==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
        
    }
    
}
