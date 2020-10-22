package Cap1_2_3.Ex6;

/**
 * Simulate choosing people at random and checking the day of the year they 
 * were born on.  If the birthday is the same as one that was seen previously, 
 * stop, and output the number of people who were checked.
 */
public class Compl2 {

    public static void main(String[] args) {

        boolean[] used;  // For recording the possible birthdays
                         //   that have been seen so far.  A value
                         //   of true in used[i] means that a person
                         //   whose birthday is the i-th day of the
                         //   year has been found.

        int count=0;       // The number of people who have been checked.
        int x=0;

        used = new boolean[365];  // Initially, all entries are false.


        for(int i=0; i<365; i++){
            x=(int)(Math.random()*365);
            used[x]=true;
        }

        for(int i=0; i<365; i++){
            if(used[i]==false){
                count++;
            }
        }

        System.out.println();
        System.out.println("A different birthday was " + count);
    }

} // end class BirthdayProblem
