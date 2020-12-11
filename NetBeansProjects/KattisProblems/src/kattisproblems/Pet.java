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
public class Pet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int count =6;
        int max=0;
        int place=0;
        
        for(int i=1; i<count; i++)
        {
            int num1 = keyboard.nextInt();
            int num2 = keyboard.nextInt();
            int num3 = keyboard.nextInt();
            int num4 = keyboard.nextInt();
            
            int sum = num1+num2+num3+num4;
            
            if(sum>max){
                max=sum;
                place=i;
            }
            
        }
        System.out.println(place+ " " + max);
    }
    
}
