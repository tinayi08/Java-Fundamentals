package labs_examples.conditions_loops.labs;


import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        Scanner scan = new Scanner(System.in);

        // 2) prompt user
        System.out.println("What day of the week?");
        // 3) assign input to variable as int
        int week = scan.nextInt();

        // 4) write completed code here
        if (week == 1) {
            System.out.println("Monday");
        } else if (week == 2) {
            System.out.println("Tuesday");
        } else if (week == 3) {
            System.out.println("Wednesday");
        } else if (week == 4){
            System.out.println("Thursday");
        } else if (week == 5) {
            System.out.println("Friday");
        } else if (week == 6) {
            System.out.println("Saturday");
        } else if (week == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Other");
        }

        if (week > 1) {
            if (week > 2) {
                if (week > 3) {
                } else {
                    System.out.println("wed");
                }
            } else {
                System.out.println("Tuesday");
            }
        } else {
            System.out.println("Monday");
        }
    }
}
