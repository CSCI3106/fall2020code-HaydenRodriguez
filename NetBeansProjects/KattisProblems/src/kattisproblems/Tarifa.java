/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;
public class Tarifa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int gbPerMonth = keyboard.nextInt();
        int monthCount = keyboard.nextInt();
        int totalGB = 0;
        
        for(int i=0; i<monthCount; i++)
        {
            totalGB+=gbPerMonth;
            totalGB-= keyboard.nextInt();
        }
        totalGB+=gbPerMonth;
        System.out.println(totalGB);
    }
    
}
