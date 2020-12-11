/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;
public class NastyHacks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int count = keyboard.nextInt();
        
        for(int i=0; i<count; i++)
        {
            int revIfDontAdv = Integer.parseInt(keyboard.next());
            int y = Integer.parseInt(keyboard.next());
            int z = Integer.parseInt(keyboard.next());
            int revIfAdvertise = y-z;
            
            
            if(revIfDontAdv > revIfAdvertise){
                System.out.println("do not advertise");
            }
            else if(revIfDontAdv < revIfAdvertise){
                System.out.println("advertise");
            }
            else{
                System.out.println("does not matter");
            }
        }
    }
    
}
