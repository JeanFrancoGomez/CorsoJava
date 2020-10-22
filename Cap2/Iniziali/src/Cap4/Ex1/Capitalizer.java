package Cap4.Ex1;

import textio.TextIO;

public class Capitalizer {

    public static void main(String[] args){
        
       String line;       
       char ch;        
       char[] lineOut;
       
       
       System.out.println("Enter a line of text.");
       System.out.print("? ");
       line = TextIO.getln();
       lineOut = new char[line.length()];

       ch = line.charAt(0);
       ch = Character.toUpperCase(ch);

       if(Character.isLetter(ch)){
           lineOut[0]=ch;
       }else{
            lineOut[0]=line.charAt(0);
       }

       int i=1;
       while( i < line.length() ) {
            if( Character.isWhitespace(line.charAt(i)) ) { 
                lineOut[i]=' ';
                i++;
                ch = line.charAt(i);
                ch = Character.toUpperCase(ch);

                lineOut[i]=ch;
            }else{
                lineOut[i]=line.charAt(i);
            }
            i++;
       }
       System.out.println(lineOut);
    }
    
}
