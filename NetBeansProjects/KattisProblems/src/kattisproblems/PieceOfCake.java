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
public class PieceOfCake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double sideLength = keyboard.nextDouble();
        int cut1 = keyboard.nextInt();
        int cut2 = keyboard.nextInt();
        int volume;
        
        int x,y;
        int z = 4;
        
        if(cut1 >= sideLength /2){
            x = cut1;
        }else{
            x = (int)sideLength - cut1;
        }
        if(cut2 >= sideLength /2){
            y = cut2;
        }else{
            y = (int)sideLength - cut2;
        }
        volume = x*y*z;
        System.out.println(volume);
        
    }
    
}
