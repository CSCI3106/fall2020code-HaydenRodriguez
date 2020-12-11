/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kattisproblems;

/**
 *
 * @author Hayden Rodriguez
 */
import java.util.*;
public class QuadrantSelection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();
        
        System.out.println(quad(x,y));
    }
    
    public static int quad(int x, int y)
    {
        if(x>0)
            return(y<0)? 4: 1;
        return(y>0)? 2: 3;
    }
}
