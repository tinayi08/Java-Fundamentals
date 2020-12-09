package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 8: do-while loop
 *
 *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
 *
 */

public class Exercise_08 {
    public static void main(String [] args) {
        int i = 1000;
        do {
            System.out.println(i);
            i-=3;
        } while (i > 1);

        Scanner scan = new Scanner(System.in);
        int x = 0;
        do {
            System.out.println("Enter a number or -1 to quit");
            x = scan.nextInt();
            String s = scan.next();
            if (x != -1) {
                System.out.println("you entered " + x);
            } else {
                System.out.println("Goodbye");
            }

        } while (x != -1);
    }
}
