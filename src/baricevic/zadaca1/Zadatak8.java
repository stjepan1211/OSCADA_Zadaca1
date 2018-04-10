package baricevic.zadaca1;

import java.util.ArrayList;

public class Zadatak8 {
    //8. Write a method that takes a int number and returns a array of its digits.
    public static void main(String[] args) {
        Zadatak8.printArray(Zadatak6.reverseArray(Zadatak8.getArrayOfDigits(12345)));
        System.out.println("\nProgram has been executed.");
    }

    private static int[] getArrayOfDigits(int number){
        int digitsCounter = 0;
        int arrayOfIntegers[];
        int originalNumber = number;
        while (number > 0) {
            digitsCounter++;
            number = number / 10;
        }
        arrayOfIntegers = new int[digitsCounter];
        digitsCounter = 0;
        while (originalNumber > 0) {
            arrayOfIntegers[digitsCounter] = originalNumber % 10;
            digitsCounter++;
            originalNumber = originalNumber / 10;
        }

        return  arrayOfIntegers;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
