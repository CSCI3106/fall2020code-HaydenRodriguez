/*
 */
package kattisproblems;

/**
 *
 * @author hayden
 */
import java.util.*;

public class skocimis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int A = keyboard.nextInt();
        int B = keyboard.nextInt();
        int C = keyboard.nextInt();
        int jumps = (B-A)>(C-B)? B-A-1: C-B-1;
        System.out.println(jumps);
    }

}
