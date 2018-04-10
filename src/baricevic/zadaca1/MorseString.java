package baricevic.zadaca1;

//from https://codereview.stackexchange.com/questions/74794/morse-code-string

public class MorseString {

    public static final char CHAR_SEPARATOR = ' ';
    public static final char WORD_SEPARATOR = '/';
    public static final char DOT = '.';
    public static final char DASH = '-';

    private String string;
    private String codeString;

    /*
     * Constructor that takes the Morse Code as a String as a parameter
     */

    public MorseString(String s) {
        if(!isValidMorse(s)) {
            throw new IllegalArgumentException("s is not a valid Morse Code");
        }
        if(!s.isEmpty()) {
            this.string = translate(s);
        } else {
            this.string = s;
        }
        this.codeString = s;
    }

    /*
     * Checks if it is a valid Morse Code
     */

    public static boolean isValidMorse(String s) {
        return s.matches("[" + DOT + "\\" + DASH + WORD_SEPARATOR + "\\s" + "]*");
    }

    /*
     * Traslates from Morse in a String to a String
     * e.g. ".... .." to "hi"
     */

    private String translate(String code) {
        String[] words = code.split(Character.toString(WORD_SEPARATOR));
        StringBuilder result = new StringBuilder(words.length * words[0].length()); // Rough guess of size
        for(String word : words) {
            String[] letters = word.trim().split(Character.toString(CHAR_SEPARATOR));
            for(String letter : letters) {
                result.append(MorseCode.decode(letter));
            }
            result.append(CHAR_SEPARATOR);
        }
        return result.toString().substring(0, result.length() - 1);
    }

    public static MorseString parse(String s) {
        if (!s.matches("[\\s\\dA-Za-z]*")) {
            throw new IllegalArgumentException("String too complicated");
        } else if(s.isEmpty()) {
            return new MorseString("");
        }
        int length = s.length();
        StringBuilder result = new StringBuilder(length * 4); // Rough estimate of length
        for(int i = 0; i < length; i++) {
            if(s.charAt(i) == ' ') {
                result.append(WORD_SEPARATOR).append(CHAR_SEPARATOR);
                continue;
            }
            result.append(MorseCode.encode(s.charAt(i))).append(CHAR_SEPARATOR);
        }
        return new MorseString(result.toString().trim());
    }

    /*
     * Returns the code as a String
     * e.g. if the object represents "hi" in Morse, it returns ".... .."
     */

    @Override
    public String toString() {
        return codeString;
    }

    /*
     * Returns the result of the translations
     * e.g. if the object represents "hi" in Morse, it returns "hi"
     */

    public String asString() {
        return string;
    }

}

enum MorseCode {

    A(".-"),
    B("-..."),
    C("-.-."),
    D("-.."),
    E("."),
    F("..-."),
    G("--."),
    H("...."),
    I(".."),
    J(".---"),
    K("-.-"),
    L(".-.."),
    M("--"),
    N("-."),
    O("---"),
    P(".--."),
    Q("--.-"),
    R(".-."),
    S("..."),
    T("-"),
    U("..-"),
    V("...-"),
    W(".--"),
    X("-..-"),
    Y("-.--"),
    Z("--.."),
    ZERO('0', "-----"),
    ONE('1', ".----"),
    TWO('2', "..---"),
    THREE('3', "...--"),
    FOUR('4', "....-"),
    FIVE('5', "....."),
    SIX('6', "-...."),
    SEVEN('7', "--..."),
    EIGHT('8', "---.."),
    NINE('9', "----.");

    private char character;
    private String code;

    private MorseCode(char character, String code) {
        this.character = character;
        this.code = code;
    }

    private MorseCode(String code) {
        this.character = this.name().charAt(0);
        this.code = code;
    }

    public static char decode(String s) {
        for(MorseCode mCode : MorseCode.values()) {
            if(mCode.code.equals(s)) {
                return mCode.character;
            }
        }
        throw new IllegalArgumentException("s is not a valid Morse Code");
    }

    public static String encode(char c) {
        for(MorseCode mCode : MorseCode.values()) {
            if(mCode.character == Character.toUpperCase(c)) {
                return mCode.code;
            }
        }
        throw new IllegalArgumentException(c + " cannot be found");
    }

}