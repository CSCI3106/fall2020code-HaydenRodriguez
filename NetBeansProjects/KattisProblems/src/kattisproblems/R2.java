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
public class R2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int num1 = keyboard.nextInt();
        int mean = keyboard.nextInt();
        
        System.out.println(mean*2-num1);
    }
    
}
