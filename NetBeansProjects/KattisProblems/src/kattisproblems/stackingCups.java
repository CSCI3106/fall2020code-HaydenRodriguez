/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;
public class stackingCups {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int N = keyboard.nextInt();
        
        int[] radiusArray = new int[N];
        String[] colorArray = new String[N];
        
        for(int i=0; i<N; i++)
        {
            if(!keyboard.hasNextInt()){
                colorArray[i] = keyboard.next();
                radiusArray[i] = keyboard.nextInt();
            }
            else{
                radiusArray[i] = (keyboard.nextInt())/2;
                colorArray[i] = keyboard.next();
            }
        }
        int[] indexKey = new int[N];    // for indexes
        int[] radiusSorted = new int[N];
        radiusSorted = Arrays.copyOf(radiusArray, N);   //copies radius values into new array
        Arrays.sort(radiusSorted);              //sorts the new array
         
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N;j++)
            {
                if(radiusArray[i] == radiusSorted[j]){      //loop that creates the order for indexKey
                    indexKey[i] = j;
                }
            }
        }
        
        String[] colorsSorted = new String[colorArray.length];
        for(int i=0;i<colorArray.length; i++)
        {
            colorsSorted[i]=colorArray[indexKey[i]];
        }
        
        for(int i=0;i<colorArray.length;i++)
        {
           for(int j=0; j<colorArray.length;j++)
           {
               if(i==indexKey[j]){
                   System.out.println(colorArray[j]);
               }
           }
        }

    }
    
}
