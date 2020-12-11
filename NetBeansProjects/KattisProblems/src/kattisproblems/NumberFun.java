/*
 */
package kattisproblems;

/**
 *
 * @author hayden
 */
import java.util.*;
public class NumberFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int n = keyboard.nextInt();
        
        for(int i=0;i<n;i++){
            int a = keyboard.nextInt();
            int b = keyboard.nextInt();
            int c = keyboard.nextInt();
            
            if(a+b==c){
                System.out.println("Possible");
            }else if(a-b==c || b-a==c){
                System.out.println("Possible");
            }else if(a*b==c){
                System.out.println("Possible");
            }else if((double)a/b==c || (double)b/a==c){
                System.out.println("Possible");
            }else{
                System.out.println("Impossible");
            }      
        }
    }
    
}
