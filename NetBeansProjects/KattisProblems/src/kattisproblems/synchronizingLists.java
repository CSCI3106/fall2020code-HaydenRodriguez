/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;

public class synchronizingLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int n = (keyboard.nextInt());
        
        while (n != 0) {
            int[] numbers1 = new int[n];
            int[] numbers2 = new int[n];
            
            for (int i = 0; i < n; i++) { 
                numbers1[i] = keyboard.nextInt();
            }
            for (int j = 0; j <n; j++) {
                numbers2[j] = keyboard.nextInt();
            }
            
            int[] numbers1Sorted = new int[n];
            for (int i = 0; i < n; i++) {
                numbers1Sorted[i] = numbers1[i];
            }
            int[] indexKey = new int[n];
            
            Arrays.sort(numbers1Sorted);
            
            for (int i = 0; i < n; i++) {
                
                for (int j = 0; j < n; j++) {
                    if (numbers1[i] == numbers1Sorted[j]) {
                        indexKey[i] = j;
                    }
                }
            }
            Arrays.sort(numbers2);
            for (int i = 0; i < n; i++) {
                System.out.println(numbers2[indexKey[i]]);
            }
            System.out.println("");
            n =keyboard.nextInt();
            
        }
        
    }
    
}
