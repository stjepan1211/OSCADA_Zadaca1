package baricevic.zadaca1;

public class Helper {

    public static void main(String[] args) {
        int col = 4, rows = 4;

        for (int i = 0; i < col; i++){
            for (int j = 0; j < rows; j++){
                System.out.print("[" + i + "]" + "[" + j + "]\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("[" + i + "]" + "[" + j + "]\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.print("[" + i + "]" + "[" + j + "]\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

    }
}
