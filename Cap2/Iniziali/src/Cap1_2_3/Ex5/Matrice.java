package Cap1_2_3.Ex5;
/**
 * Esercizio di creare una matrice di interi
 */

import textio.TextIO;

public class Matrice {

    public static void main(String[] args){

        System.out.println("Righe della matrice:    ");
        int r=TextIO.getInt();
        System.out.println("Colonna della matrice:  ");
        int c=TextIO.getInt();

        int[][] a;
        a = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                //System.out.printf("Elemento [%d][%d]:",i+1,j+1);
                //a[i][j]=TextIO.getInt();
                a[i][j]= (int)(Math.random()*100)+1;
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.printf("%4d",a[i][j]);
            }
            System.out.println();
        }

    }
    
}