/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;
public class Bijele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int king1 = keyboard.nextInt();
        int queen1 = keyboard.nextInt();
        int rooks2 = keyboard.nextInt();
        int bishops2 = keyboard.nextInt();
        int knights2 = keyboard.nextInt();
        int pawns8 = keyboard.nextInt();
        
        System.out.print(1-king1 + "\t");
        System.out.print(1-queen1+ "\t");
        System.out.print(2-rooks2+ "\t");
        System.out.print(2-bishops2+ "\t");
        System.out.print(2-knights2+ "\t");
        System.out.print(8-pawns8+ "\t");
        
    }
    
}
