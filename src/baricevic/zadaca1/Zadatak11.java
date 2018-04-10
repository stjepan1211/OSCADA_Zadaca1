package baricevic.zadaca1;

public class Zadatak11 {
    /*Specijalan zadatak. Napraviti program u javi kao što je u javascript-u na
    adresi https://github.com/tjakopec/OSC3JS/tree/master/12_aplikacije/02_inchooZadatak*/


    //algoritam je kopiran iz inchoo.js datoteke
    private static int[][] populateMatrix(int numberOfRows, int numberOfColums){
        int matrix[][] = new int[numberOfRows][numberOfColums];

        int counter = 1;
        int r = 0, k = 1;
        int pocetakDL = numberOfColums-1, krajDL = 0; //vrhovi dijagonale matrice - pocetne vrijednosti
        int pocetakDG = numberOfRows - 2, krajDG = 0; //stupcima s lijeve strane ce se pocetna vrijednost uvecavati
        int pocetakLD = 1, krajLD = numberOfColums; // a s desne strane umanjivati, gornjim redovima ce se pocetne vrijednosti
        int pocetakGD = 1, krajGD = numberOfRows-1; //uvecavati a donjima umanjivati

        while (counter <= (numberOfRows * numberOfColums)) { //iteriraj dok brojac ne dođe do redovi*stupci
            for(int i = pocetakDL; i >= krajDL; i--){ //popuni od donjeg desnog elementa do donjeg lijevog
                matrix[numberOfColums-k][i] = counter++;
            }
            pocetakDL--; //iduci put ce pocetak iteracije kroz red biti od pocetnog trenutnog stupca - 1
            krajDL++;//iduci put ce kraj iteracije kroz red biti od krajnjeg trenutnog stupca + 1

            for(int i = pocetakDG; i >= krajDG; i--){ //popuni od donjeg lijevog elementa do gornjeg lijevog
                matrix[i][r]= counter++;
            }
            pocetakDG--; //iduci put ce pocetak iteracije kroz stupac biti od pocetnog trenutnog stupca - 1
            krajDG++;//iduci put ce kraj iteracije kroz stupac biti od krajnjeg trenutnog stupca + 1

            for(int i=pocetakLD; i<krajLD;i++){ //popuni od gornjg lijevog elementa do gornjeg desnog
                matrix[r][i]=counter++;
            }
            pocetakLD++; //iduci put ce pocetak iteracije kroz red biti od pocetnog trenutnog stupca + 1
            krajLD--; //iduci put ce kraj iteracije kroz red biti od krajnjeg trenutnog stupca - 1

            for(int i = pocetakGD; i < krajGD;i++){ //popuni od gornjeg desnog elementa do donjeg desnog
                matrix[i][numberOfRows - k] = counter++;
            }
            pocetakGD++; //iduci put ce pocetak iteracije kroz stupac biti od pocetnog trenutnog stupca + 1
            krajGD--; //iduci put ce kraj iteracije kroz strupca biti od krajnjeg trenutnog stupca - 1
            r++; //counteri da se zna koliko se koraka treba "uvuci" u matricu po redu i stupcu
            k++;
        }

        return matrix;
    }

    public static void main (String[] args)
    {
        int r = 3, c = 3;
        int m[][] = populateMatrix(r ,c);
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
