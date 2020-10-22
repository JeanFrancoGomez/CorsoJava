package Cap1_2_3.Ex1;

import textio.TextIO;

public class Dadi {
    public static void main(String[] args){
        Integer a,b;

        a= (int) (Math.random()*5+1);
        a = (Integer)a;
        TextIO.put("Give me a number ");
        b=(Integer)TextIO.getInt();

        TextIO.putln("The machine number is  "+a);
        TextIO.putln("Your number is         "+b);
        /*
        if(a==b)
            TextIO.put("You win");
        else
            TextIO.put("You lose");
        */

        //Integer.compare(a,b) ? TextIO.put("You win") : TextIO.put("You lose");
    }

}