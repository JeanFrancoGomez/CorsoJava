package Cap1_2_3.Ex3_1;

import textio.TextIO;

public class DadiSnakeEyes {
    
    public static void main(String[] args){
        int a=0,b=0,i=0;

        while(!(a==1 && b==1)){
            a = (int)(Math.random()*6)+1;
            b = (int)(Math.random()*6)+1;
            i++;
        }
        TextIO.put(i);
    }

}
