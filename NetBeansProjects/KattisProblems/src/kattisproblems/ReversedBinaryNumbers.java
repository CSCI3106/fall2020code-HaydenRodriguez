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
public class ReversedBinaryNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int number = keyboard.nextInt();
        StringBuffer binaryNum = new StringBuffer(Integer.toBinaryString(number));
        
        String reverseBinary = (binaryNum.reverse()).toString();
        int finalNum = Integer.parseInt(reverseBinary, 2);
        
        System.out.println(finalNum);
        
    }
    
}
