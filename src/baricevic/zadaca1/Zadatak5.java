package baricevic.zadaca1;

public class Zadatak5 {
    //5. Write a method that returns the largest element in a array.

    public static void main(String[] args) {
        short array[] = new short[]{12, 8, 5, 200, 123, 120};
        System.out.println(Zadatak5.getMax(array));
        System.out.println("Program has been executed.");

    }

    private static short getMax(short[] array){
        short max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
