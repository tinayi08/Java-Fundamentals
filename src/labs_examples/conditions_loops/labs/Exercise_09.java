package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main (String[] args) {
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            if(i == 5) {
                break;
            }
            i++;
        }

    }
}
