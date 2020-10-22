package Cap4.Ex2;

import textio.TextIO;

public class Ex2 {

    public static void main(String[] args){
        
        TextIO.put("Inserisce un numero in esadecimale: ");
        String str=TextIO.getln();

        int valore = 0;
        for (int i = 0; i <str.length (); i ++){
            char aux=str.charAt(i);
            int x = hexValue(aux);

            if (x != -1) {
                valore=-1;
                break;
            } else {
                valore = (int) (valore + x * (Math.pow(16, i)));
            }

        }

        TextIO.put("Il numero in decimale è:            " + valore);

    }

    public static int hexValue(char x) {

        switch(x){
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case 'a':
                return 10;
            case 'b':
                return 11;
            case 'c':
                return 12;
            case 'd':
                return 13;
            case 'e':
                return 14;
            case 'f':
                return 15;
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                return -1;
        }

    }

}
