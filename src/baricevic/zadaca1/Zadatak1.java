package baricevic.zadaca1;

import javax.swing.JOptionPane;

public class Zadatak1 {
    //1. Write a program that asks the user for a number n and prints the sum of the numbers 1 to n

    public static void main(String[] args) {
        int sum = 0;
        int number;
        while (true){
            try {
                number = Integer.parseInt(JOptionPane.showInputDialog("Input number greater than 0."));
                if(number > 0){
                    sum += Zadatak1.addNumbers(number);
                    break;
                }

            }
            catch (Exception exception) {
                JOptionPane.showMessageDialog(null,"Error occured. Try with number.",
                        "Error",0, null);
            }
        }

        JOptionPane.showMessageDialog(null,Integer.toString(sum),
                "Result",1, null);
        System.out.println("Program has been executed.");
    }

    private static int addNumbers(int number){
        if(number != 0)
            return number + addNumbers(number - 1);
        else
            return 0;
    }
}
