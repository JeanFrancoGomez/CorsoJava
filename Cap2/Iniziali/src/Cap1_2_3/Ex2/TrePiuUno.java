package Cap1_2_3.Ex2;

import textio.TextIO;

public class TrePiuUno {

    public static void main(String[] args) {
        TextIO.put("Give me a number: ");
        int n = TextIO.getInt();

        while(n!=1){
            if(n%2==0){
                n=n/2;
                TextIO.put(n+" ");
            }
            else{
                n=3*n+1;
                TextIO.put(n+" ");
            }
        }
    }

}