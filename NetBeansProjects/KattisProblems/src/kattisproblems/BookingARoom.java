/*

 */
package kattisproblems;

/**
 *
 * @author hayden
 */
import java.util.*;

public class BookingARoom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int total = keyboard.nextInt();
        int taken = keyboard.nextInt();
        int[] totalRooms = new int[total];
        int[] takenRooms = new int[taken];

        if (total == taken) {
            System.out.println("too late");
        } else {
            for (int i = 1; i <= totalRooms.length; i++) {
                totalRooms[i - 1] = i;
            }

            for (int i = 0; i < takenRooms.length; i++) {
                takenRooms[i] = keyboard.nextInt();
            }

            for (int i = 0; i < totalRooms.length; i++) {
                boolean isVacant = true;
                for (int j = 0; j < takenRooms.length; j++) {
                    if (takenRooms[j] == totalRooms[i]) {
                        isVacant = false;
                    }

                }
                if (isVacant == true) {
                    System.out.println(totalRooms[i]);
                    break;
                }
            }
            
        }
    }

}
