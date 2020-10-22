package Cap1_2_3.Ex8;

public class Compl1 {
    public static void main(String[] args) {

        int[] used;  // For recording the possible birthdays
                         //   that have been seen so far.  A value
                         //   of true in used[i] means that a person
                         //   whose birthday is the i-th day of the
                         //   year has been found.

        int count;       // The number of people who have been checked.

        used = new int[365];  // Initially, all entries are false.

        count = 0;

        while (true) {
                // Select a birthday at random, from 0 to 364.
                // If the birthday has already been used, quit.
                // Otherwise, record the birthday as used.

            int birthday;  // The selected birthday.
            birthday = (int)(Math.random()*365);
            count++;

            if(used[birthday]==0){
                used[birthday]=1;
            }
            else if(used[birthday]==1){
                used[birthday]=2;
            }
            else{
                used[birthday]=3;
            }

            System.out.printf("Person %d has birthday number %d%n", count, birthday);
            if(used[birthday]==3)
                break;
            
        } // end while

        System.out.println();
        System.out.println("A tripled birthday was found after " 
                + count + " tries.");
    }
}
