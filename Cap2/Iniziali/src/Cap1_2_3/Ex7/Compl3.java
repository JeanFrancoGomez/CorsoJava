package Cap1_2_3.Ex7;

/**
 * Simulate choosing people at random and checking the day of the year they 
 * were born on.  If the birthday is the same as one that was seen previously, 
 * stop, and output the number of people who were checked.
 */
public class Compl3 {

    public static void main(String[] args) {

        boolean[] used;  // For recording the possible birthdays
                         //   that have been seen so far.  A value
                         //   of true in used[i] means that a person
                         //   whose birthday is the i-th day of the
                         //   year has been found.

        int count;       // The number of people who have been checked.

        used = new boolean[365];  // Initially, all entries are false.

        count = 0;
        int aux=0;

        while (true) {
                // Select a birthday at random, from 0 to 364.
                // If the birthday has already been used, quit.
                // Otherwise, record the birthday as used.

            int birthday;  // The selected birthday.
            birthday = (int)(Math.random()*365);
            
            if(used[birthday]==false){
                used[birthday] = true;
                aux++;
            }
            
            count++;

            System.out.printf("Person %d has birthday number %d%n", count, birthday);

            if ( aux==365 ) {  
                    // This day was found before; It's a duplicate.  We are done.
                break;
            }

        } // end while

        System.out.println();
        System.out.println("Servono " + count + " tries.");
    }

} // end class BirthdayProblem