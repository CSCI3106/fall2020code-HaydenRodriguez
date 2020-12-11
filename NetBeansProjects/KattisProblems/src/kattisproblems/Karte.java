/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;

public class Karte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String cards = keyboard.nextLine();                                     // initially accepts the input 
        String[] cardsArr = new String[cards.length()/3];                       // array for the cards
        int P, H, K, T = 13;                                                    // 13 cards in each suit

        for (int i = 0; i < cards.length()/3; i++) {
            int k = 0;
            cardsArr[i] = cards.substring(k,k+3);                               //stores the different cards in an array
            k=k+3;
        }
        System.out.println(cardsArr.toString());
      
    }

}
