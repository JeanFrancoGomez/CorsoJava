package Cap5.Ex3;

import Cap5.Ex1.PairOfDice;
import Cap5.Ex2.NegativeNumException;
import Cap5.Ex2.StatCalc;

public class Ex3 {

    public static void main(String[] args) throws NegativeNumException {

        PairOfDice dadi= new PairOfDice();
        StatCalc calc = new StatCalc();

        for(int i=0;i<10000;i++){
            calc.enter(dadi.getDie1()+dadi.getDie2());
        }

        System.out.println("Di 1000 tiri dei dadi");
        System.out.println("La media dei tiri:                  "+calc.getMean());
        System.out.println("La deviazione standard di tiri:     "+calc.getStandardDeviation());
        System.out.println("Il valore massimo dei tiri:         "+calc.getMax());
    }
    
}
