/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;
public class Soylent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int counter = keyboard.nextInt();
        
        for(int i=0; i<counter;i++)
        {
            int calories=keyboard.nextInt();
            if(calories%400==0){
                System.out.println(calories/400);
            }else{
                System.out.println((calories/400)+1);
            }
        }
    }
    
}
