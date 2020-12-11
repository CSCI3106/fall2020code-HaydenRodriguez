/*
 */
package kattisproblems;

/**
 *
 * @author hayden
 */
import java.util.*;

public class SodaSlurper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int startEmpties = keyboard.nextInt();
        int foundEmpties = keyboard.nextInt();
        int costForNew = keyboard.nextInt();

        int totalEmpties = startEmpties + foundEmpties;
        int sodasBought = 0;

        while (totalEmpties >= costForNew) {
            int leftover = totalEmpties % costForNew;
            int sodasBoughtTemp = (totalEmpties / costForNew);

            sodasBought += sodasBoughtTemp;
            totalEmpties = sodasBoughtTemp + leftover;
        }

        System.out.println(sodasBought);
    }

}
