package baricevic.zadaca1;



public class Zadatak6 {
    //6. Write a method that reverses a array.
    public static void main(String[] args) {
        int array[] = new int[] {1, 2, 3, 4, 5};

        array = Zadatak6.reverseArray(array);
        System.out.println("Reversed:");
        Zadatak6.printArray(array);
        System.out.println("\nProgram has been executed.");

    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static int[] reverseArray(int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
