/*
 */
package kattisproblems;

/**
 *
 * @author hayden
 */
import java.util.*;
public class ChanukahChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int N = keyboard.nextInt();
        
        for(int i=1;i<=N;i++)
        {
            int place = keyboard.nextInt();
            int days = keyboard.nextInt();
            int sum=0;
            for(int j=0;j<days;j++)
            {
                sum+=(j+2);
            }
            System.out.println(place + " " + sum);
        }
    }
    
}
