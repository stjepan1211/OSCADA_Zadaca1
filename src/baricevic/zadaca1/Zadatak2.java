package baricevic.zadaca1;

import javax.swing.*;

public class Zadatak2 {
    //2. Write a program that asks the user for a number n and gives them the possibility
    // to choose between computing the sum and computing the product of 1,…,n.

    public static void main(String[] args) {
        int result = 0;
        int number;
        Object[] functions = {"Sum", "Factorial"};

        while (true){
            try {
                number = Integer.parseInt(JOptionPane.showInputDialog("Input number greater than 0."));
                if(number > 0){
                    int n = JOptionPane.showOptionDialog(null,
                            "Which function would you like to execute?",
                            "Choose function.",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            functions,
                            functions[0]);

                    switch (functions[n].toString()){
                        case "Sum":
                            result = Zadatak2.addNumbers(number);
                            break;
                        case "Factorial":
                            result = Zadatak2.multiplyNumbers(number);
                            break;
                    }
                    break;
                }

            }
            catch (Exception exception) {
                JOptionPane.showMessageDialog(null,"Error occured. Try with number.",
                        "Error",0, null);
            }
        }

        JOptionPane.showMessageDialog(null,Integer.toString(result),
                "Result",1, null);
        System.out.println("Program has been executed.");
    }

    private static int addNumbers(int number){
        if(number != 0)
            return number + addNumbers(number - 1);
        else
            return 0;
    }

    private static int multiplyNumbers(int number){
        return number == 1 ? 1 : number * multiplyNumbers(number - 1);

    }
}
