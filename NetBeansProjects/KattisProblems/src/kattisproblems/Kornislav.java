/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;
public class Kornislav {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int[] sides = new int[4];
        
        for(int i=0; i<4;i++){
            sides[i]=keyboard.nextInt();
        }
        Arrays.sort(sides);
        System.out.println(sides[0]*sides[2]);
    }
    
}
