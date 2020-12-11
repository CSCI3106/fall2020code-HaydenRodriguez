package kattisproblems.csci3106;
/*
 * @author  Rodriguez, Hayden
 * @assignment  Kattis - Shopaholic
 * @date  November 14, 2020
 */
import java.util.*;
public class Shopaholic {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // number of items that she buys
        int items = keyboard.nextInt();

        // array that holds the different prices of items
        int[] prices = new int[items];
        // for loop to store the different prices
        for(int i = 0; i < items; i++)
        {
            prices[i] = keyboard.nextInt();
        }
        Arrays.sort(prices);



    }

}
