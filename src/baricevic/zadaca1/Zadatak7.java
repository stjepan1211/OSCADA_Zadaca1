package baricevic.zadaca1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadatak7 {
    //7. Write a method that returns the elements on odd positions in a array
    public static void main(String[] args) {

        int array[] = new int[] {1, 2, 3, 4, 5};
        Zadatak7.printArray(Zadatak7.getOdds(array));
        System.out.println("\nProgram has been executed.");

    }

    private static int[] getOdds(int[] array){
        int arrayOfOdds[];
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0) {
                indexes.add(i);
                continue;
            }
        }
        arrayOfOdds = new int[indexes.size()];
        for (int i = 0; i < arrayOfOdds.length; i++){
            arrayOfOdds[i] = array[indexes.get(i)];
        }
        return arrayOfOdds;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

}
