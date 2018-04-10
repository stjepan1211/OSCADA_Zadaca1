package baricevic.zadaca1;

public class Zadatak10 {
    //10. Write a program that automatically converts English text to Morse code and vice versa.

    public static void main(String[] args) {

        MorseString string = MorseString.parse("Morse test");
        System.out.println(string);
        System.out.println(string.asString());

        boolean isValid = MorseString.isValidMorse("----.");
        System.out.println(isValid);
    }

}
