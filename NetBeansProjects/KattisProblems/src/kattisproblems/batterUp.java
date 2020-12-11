/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kattisproblems;

/**
 *
 * @author hayden
 */
import java.util.*;
public class batterUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int n = keyboard.nextInt();
        double total=0;
        int atBats=0;
        
        for(int i=0; i<n; i++)
        {
            int batter = keyboard.nextInt();
            
            if(batter == -1);
            else
            {
                atBats++;
                total+=batter;
            }
        }
        System.out.println(total/atBats);
    }
    
}
