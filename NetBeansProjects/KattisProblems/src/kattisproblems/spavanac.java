/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;
public class spavanac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int hr = keyboard.nextInt();
        int min = keyboard.nextInt();
        
        if(min >= 45)
        {
            System.out.println(hr + " " + (min-45));
        }
        else if(min<45 && hr != 0)
        {
            System.out.println((hr-1) + " " + (60-(45-min)));
        }
        else if(min<45 && hr==0)
        {
            System.out.println((23) + " " + (60-(45-min)));
        }
    }
    
}
