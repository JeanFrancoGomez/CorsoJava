package Cap5.Ex1;

public class PairOfDice {

    private int die1;   // Number showing on the first die.
    private int die2;   // Number showing on the second die.

    public int getDie1() {
        die1 = (int)(Math.random()*6) + 1;
        return die1;
    }

    public int getDie2() {
        die2 = (int)(Math.random()*6) + 1;
        return die2;
    }

    @Override
    public String toString() {
        return "Die1=" + die1 + ", Die2=" + die2;
    }
    
}
