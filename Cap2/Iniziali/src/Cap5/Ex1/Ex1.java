package Cap5.Ex1;

public class Ex1 {
    
    public static void main(String[] args){

        PairOfDice pairOfDice = new PairOfDice();
        int c=1;
        while(!isTwo(pairOfDice)) {
            c++;
        }
        
        System.out.println("You roll "+c+" times for two");

    }

    synchronized public static boolean isTwo(PairOfDice x) {
        int a=x.getDie1();
        int b=x.getDie2();
        System.out.println(x.toString());
        
        if(a==1 && b==1){
            return true;
        }
        else{
            return false;
        }
    }

}
