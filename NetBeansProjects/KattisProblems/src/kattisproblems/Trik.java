/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;
public class Trik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String moveSequence = keyboard.nextLine();
        int left = 1;
        int middle = 0;
        int right = 0;
        int placeHolder =0;
        
        for(int i=0; i<moveSequence.length(); i++)
        {
            switch(moveSequence.charAt(i))
            {
                case 'A':
                    placeHolder = left;
                    left = middle;
                    middle = placeHolder;
                    break;
                case 'B':
                    placeHolder = middle;
                    middle = right;
                    right = placeHolder;
                    break;
                case 'C':
                    placeHolder =left;
                    left = right;
                    right = placeHolder;
                    break;
            }
            
        }
        
        if(left == 1){
            System.out.println("1");
        }else if(middle ==1){
            System.out.println("2");
        }else if(right==1){
            System.out.println("3");
        }
    }
    
}
