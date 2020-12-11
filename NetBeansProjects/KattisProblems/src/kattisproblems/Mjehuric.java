/*
 */
package kattisproblems;

/**
 *
 * @author hayden rodriguez
 */
import java.util.*;

public class Mjehuric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[] array = new int[5];
        int[] ordered = {1, 2, 3, 4, 5,};
        
        for (int i = 0; i < 5; i++) {
            array[i] = keyboard.nextInt();
        }

        while (!Arrays.equals(array, ordered)) {
            if (array[0] > array[1]) {
                array = swapElements(array, 0, 1);
            } else if (array[1] > array[2]) {
                array = swapElements(array, 1, 2);
            } else if (array[2] > array[3]) {
                array = swapElements(array, 2, 3);
            } else if (array[3] > array[4]) {
                array = swapElements(array, 3, 4);
            }

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }

    public static int[] swapElements(int[] array, int index1, int index2) {
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }
}
