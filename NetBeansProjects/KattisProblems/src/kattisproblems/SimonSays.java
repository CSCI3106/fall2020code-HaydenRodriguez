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
public class SimonSays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int count = keyboard.nextInt();
        
        for(int i=0; i<=count; i++){
            String command = keyboard.nextLine();
            
            if (command.startsWith("Simon says")){
                System.out.println(command.substring(11));
            }
            
        }
    }
    
}
