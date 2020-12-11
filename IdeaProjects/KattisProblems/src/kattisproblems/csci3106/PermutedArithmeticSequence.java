package kattisproblems.csci3106;

/**
 * A short description of the program.
 * Algorithm(step by step pseudocode)
 *
 * @author Rodriguez, Hayden
 * @assignment Permuted Arithmetic Sequence - Kattis
 * @date November 11, 2020
 */

import java.util.*;

public class PermutedArithmeticSequence {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int N = keyboard.nextInt();

        for (int i = 0; i < N; i++) {
            int M = keyboard.nextInt();
            long[] nums = new long[M];

            for (int k = 0; k < M; k++) {
                nums[k] = keyboard.nextLong();    // fills array
            }

            boolean isArithmetic = true;
            long diff = nums[1] - nums[0];
            for(int j = 2; j < nums.length; j++)
            {
                if(nums[j] - nums[j-1] != diff)
                {
                    isArithmetic = false;           // checks if arithmetic
                    break;
                }
            }

            Arrays.sort(nums);
            boolean isPermutedArith = true;
            diff = nums[1] - nums[0];
            for(int j = 2; j < nums.length; j++)
            {
                if(nums[j] - nums[j-1] != diff)
                {
                    isPermutedArith = false;           // checks if arithmetic
                    break;
                }
            }


            if (isArithmetic == false && isPermutedArith == true)
                System.out.println("permuted arithmetic");
            else if (isArithmetic == true && isPermutedArith == true)
                System.out.println("arithmetic");
            else if (isArithmetic == false && isPermutedArith == false)
                System.out.println("non-arithmetic");

        }

    }

}
