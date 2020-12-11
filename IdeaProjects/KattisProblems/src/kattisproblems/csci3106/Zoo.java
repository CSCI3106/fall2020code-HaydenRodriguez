package kattisproblems.csci3106;

import java.util.*;

public class Zoo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter("\\n");
        int n = keyboard.nextInt();
        int listNum = 1;

        while (n != 0) {
            String[] aniArray = new String[n];                               // stores ALL animals
            ArrayList<String> animals = new ArrayList<String>();             // for animals without duplicates
            for (int i = 0; i < n; i++) {
                String line = keyboard.next();
                String words[] = line.split(" ");                      // loop fills up array with ALL animals
                aniArray[i] = words[words.length-1].toLowerCase();
            }

            for(int i=0; i<aniArray.length;i++)
            {
                if(!animals.contains(aniArray[i])){                           // creates animal ArrayList WITHOUT duplicates
                    animals.add(aniArray[i]);
                }
            }
            Collections.sort(animals);

            int[] animalCount = new int[animals.size()];
            for(int i=0; i<aniArray.length;i++)
            {
                if(animals.contains(aniArray[i]))
                {
                    animalCount[animals.indexOf(aniArray[i])]++;             // adds up number of each animal
                }
            }
            System.out.println("List " + listNum + ":");
            //System.out.println(animals.toString());
            //System.out.println(Arrays.toString(animalCount));
            for(int i =0; i<animals.size();i++){
                System.out.println(animals.get(i) + " | " + animalCount[i]);
            }

            listNum++;
            n = keyboard.nextInt();
        }
    }
}
