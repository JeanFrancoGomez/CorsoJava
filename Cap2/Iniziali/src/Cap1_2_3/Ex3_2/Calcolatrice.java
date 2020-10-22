package Cap1_2_3.Ex3_2;

import textio.TextIO;

/**
 * Programma di una calcolatrice utilizando il switch che chiede prima l'operazione da fare
 * e dopo chiede gli argomenti per l'operazione
 */

public class Calcolatrice {

    public static void main(String[] args){
        TextIO.putln("Sceglie la tua operazione da fare");
        TextIO.putln("1. Somma");
        TextIO.putln("2. Sottrazione");
        TextIO.putln("3. Moltiplicazione");
        TextIO.putln("4. Divisione");
        int scelta = TextIO.getInt();

        switch(scelta){
            case 1:{
                int r=0;
                TextIO.putln("Quanti argomenti vuoi operare? ");
                int c=TextIO.getInt();
                for(int i=0; i<c ; i++){
                    TextIO.putln("Argomento "+(i+1)+": ");
                    r+=TextIO.getInt();
                }
                TextIO.putln("La somma è "+r);
                break;
            }
            case 2:{
                int r=0;
                TextIO.putln("Quanti argomenti vuoi operare? ");
                int c=TextIO.getInt();
                TextIO.putln("Argomento 1: ");
                r=TextIO.getInt();

                for(int i=1; i<c ; i++){
                    TextIO.putln("Argomento "+(i+1)+": ");
                    r-=TextIO.getInt();
                }
                TextIO.putln("La sottrazione è "+r);
                break;
            }
            case 3:{
                int r=1;
                TextIO.putln("Quanti argomenti vuoi operare? ");
                int c=TextIO.getInt();
                for(int i=0; i<c ; i++){
                    TextIO.putln("Argomento "+(i+1)+": ");
                    r*=TextIO.getInt();
                }
                TextIO.putln("Il prodotto è "+r);
                break;
            }
            case 4:{
                double r=0;
                TextIO.putln("Quanti argomenti vuoi operare? ");
                int c=TextIO.getInt();
                TextIO.putln("Argomento 1: ");
                r=TextIO.getInt();

                for(int i=1; i<c ; i++){
                    TextIO.putln("Argomento "+(i+1)+": ");
                    r/=TextIO.getInt();
                }
                TextIO.putln("La divisione è "+r);
                break;
            }
            default:
                TextIO.put("Scelta errata");
        }
    }

}
