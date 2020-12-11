/*
 */
package kattisproblems;

/**
 *
 * @author hayden
 */
import java.util.*;

public class BlackFriday {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();
        
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i]=keyboard.nextInt();
        }
        
        int[] checker = {6,5,4,3,2,1};
        
        
        for(int i=0;i<checker.length;i++)
        {
           int count=0;
           for(int j=0;j<array.length;j++)
           {
               if(checker[i]==array[j]){
                   count++;
               }
           }
           if(count==1){
              for(int k=0; k<array.length; k++){
                  if(checker[i]==array[k]){
                      System.out.println(k+1);
                  }
              }
              break;
           }
           if(count!=1 && i==5){
               System.out.println("none");
           }
        }
    }

}
