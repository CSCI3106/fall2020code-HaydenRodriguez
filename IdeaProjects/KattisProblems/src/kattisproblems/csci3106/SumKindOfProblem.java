package kattisproblems.csci3106;


import java.io.*;

public class SumKindOfProblem {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());    // N = number of lines

        for (int i = 1; i <= N; i++) {
            int sumPos = 0, sumOdd = 0, sumEven = 0;
            String line = reader.readLine();            // takes whole line of input
            String[] lineAndX = line.split(" ");    // splits the two numbers into a string array
            int X = Integer.parseInt(lineAndX[1]);      // stores the second element into and int variable


            for (int j = 1; j <= X; j++) {
                sumPos += j;                            // sum of the first X positive integers
            }

            int oddNum = 1;
            for (int k = 0; k < X; k++) {
                sumOdd += oddNum;                       // sum of the first X odd integers
                oddNum = oddNum + 2;
            }

            int evenNum = 2;
            for (int l = 0; l < X; l++) {
                sumEven += evenNum;                     // sum of the first even integers
                evenNum = evenNum + 2;
            }

            System.out.println(i + " " + sumPos + " " + sumOdd + " " + sumEven);
        }
    }
}
