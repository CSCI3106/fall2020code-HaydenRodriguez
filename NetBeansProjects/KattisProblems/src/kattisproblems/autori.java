/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;
public class autori {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String phrase = keyboard.nextLine();
        
        for(int i=0; i<phrase.length();i++)
        {
            if(phrase.charAt(i) >= 'A' && phrase.charAt(i) <= 'Z')
                System.out.print(phrase.charAt(i));
        }
        
        
        
        
    }
    
}
