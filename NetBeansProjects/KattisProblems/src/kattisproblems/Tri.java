/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;

public class Tri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();

        if (a + b == c) {
            System.out.println(a + "+" + b + "=" + c);
        } else if (a * b == c) {
            System.out.println(a + "*" + b + "=" + c);
        } else if ((double) a / b == c) {
            System.out.println(a + "/" + b + "=" + c);
        } else if (a - b == c) {
            System.out.println(a + "-" + b + "=" + c);
        } else if (b * c == a) {
            System.out.println(a + "=" + b + "*" + c);
        } else if (b + c == a) {
            System.out.println(a + "=" + b + "+" + c);
        } else if (b - c == a) {
            System.out.println(a + "=" + b + "-" + c);
        } else if ((double) b / c == a) {
            System.out.println(a + "=" + b + "/" + c);
        }
        
        
    }
    
    public static void dummyMethod(){
        System.out.println("Hello");
    }
}
