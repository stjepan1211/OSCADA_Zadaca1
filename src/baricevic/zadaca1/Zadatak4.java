package baricevic.zadaca1;

public class Zadatak4 {
    //4. Write a program that prints the next 20 leap years.
    public static void main(String[] args) {
        int year = 2018;
        int numberOfYearsToPrint = 12;
        int leapYearGap = 4;
        boolean isNextLeapFounded = false;

        while (!isNextLeapFounded) {
            if(year % 4 == 0){
                isNextLeapFounded = true;
                break;
            }
            year++;
        }

        while (numberOfYearsToPrint > 0) {
            numberOfYearsToPrint--;
            System.out.println(year);
            year += leapYearGap;
        }
        System.out.println("Program has been executed.");

    }
}
