package Cap5.Ex2;

import textio.TextIO;

public class Ex2 {
    
    public static void main(String[] args) throws NegativeNumException {
        StatCalc calc = new StatCalc();
        double in;

        while(true){
            
            TextIO.put("Inserisce un numero (per finire lo zero):    ");
            in=TextIO.getDouble();

            if(in!=0){   
                    try{
                        calc.enter(in);
                    }
                    catch( NumberFormatException e ){
                        TextIO.put(e.toString());
                    }
            }
            else{
                break;
            }   
        }

        TextIO.putln("Numeri in totale:     "+calc.getCount());
        TextIO.putln("Somma dei numeri:     "+calc.getSum());
        TextIO.putln("Media dei numeri:     "+calc.getMean());
        TextIO.putln("Deviazione standard:  "+calc.getStandardDeviation());
        TextIO.putln("Minimo dei numeri:    "+calc.getMin());
        TextIO.putln("Massimo dei numeri:   "+calc.getMax());

    }
}
