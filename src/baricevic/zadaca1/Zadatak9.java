package baricevic.zadaca1;

import java.util.Arrays;

public class Zadatak9 {
    //9. Write a program that prints Matrix code lookalike in console.
    public static void main(String[] args) {
        for (int[] row : new int[][]{{1, 2, 3}, {1, 2, 3}}){
            System.out.println(Arrays.toString(row));
        }

        System.out.println("\nProgram has been executed.");
    }


}
