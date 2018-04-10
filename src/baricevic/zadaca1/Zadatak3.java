package baricevic.zadaca1;

public class Zadatak3 {

    //3. Write a program that prints a multiplication table for numbers up to 12.

    public static void main(String[] args) {
        int numberToMultiply = 12;
        System.out.println("--------------------------------------------");
        for(int i = 0; i < numberToMultiply; i++){
            for(int j = 0; j < numberToMultiply; j++){
                System.out.print((i + 1) * (j + 1) + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
        System.out.println("Program has been executed.");
    }
}
