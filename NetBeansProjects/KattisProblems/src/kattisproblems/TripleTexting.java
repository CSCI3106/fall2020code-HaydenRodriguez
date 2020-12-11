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
public class TripleTexting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String sent = keyboard.nextLine();
        
        int sentLength = sent.length();
        int interval = sentLength /3;
        
        String sub1 = sent.substring(0, interval);
        String sub2 = sent.substring(interval, (interval*2));
        String sub3 = sent.substring((interval*2), (interval*3));
        
        if(sub1.equals(sub2)){
            System.out.println(sub1);
        }
        else if (sub2.equals(sub3)){
            System.out.println(sub2);
        }
        else{
            System.out.println(sub3);
        }
        
        
    }
    
    
}
