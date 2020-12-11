/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;
public class coldputerScience {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int n = keyboard.nextInt();
        int counter=0;
        
        for(int i=0; i<n; i++)
        {
            int num = keyboard.nextInt();
            if(num<0)
                counter++;
        }
        System.out.println(counter);
    }
    
}
