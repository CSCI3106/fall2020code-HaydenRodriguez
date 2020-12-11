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
import java.io.*;
public class LuhnsChecksumAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(keyboard.readLine());
        for(int i = 0; i < n; i++){
            String in = keyboard.readLine();
            int total = 0;
            for(int j = 0; j < in.length(); j++){
                if(j%2 == in.length() % 2){
                    int add = (in.charAt(j) - 48) * 2;
                    if(add >9){
                        int p = add % 10;
                        add = Math.floorDiv(add, 10);
                        
                        add += p;
                    }

                    total+= add;
                }
                else{
                    total+= in.charAt(j)-48;
                }
            }
            if(total%10==0){
                System.out.println("PASS");
            }
            else{
                System.out.println("FAIL");
            }
        }
    }
    
}
