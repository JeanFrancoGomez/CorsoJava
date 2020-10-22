package Cap1_2_3.Ex4;

import textio.TextIO;

public class MatriceNum {
    public static void main(String[] args){
        int n1=1; //Inizializzo il mio intero a incrementare
        int n2=1;
        for(int i=0;i<12;i++){ //Ciclo for per le righe
            for(int j=0;j<12;j++){ //Ciclo for per le colonne
               System.out.printf("%4d",n2);         
               n2=n2+n1;
            }
            TextIO.putln(); //Stampo il a capo
            n2=n1+1;
            n1++;
        }
    }    
}
