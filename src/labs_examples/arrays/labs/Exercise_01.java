package labs_examples.arrays.labs;



import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        // DRY Don't  repeat yourself


        int [] array = new int [10];
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            System.out.println("Provide number " + (i+1));
            array[i] = scan.nextInt();
            sum+=array[i];
        }

        System.out.println("The total is " + sum);
        System.out.println("The average is " + sum/(double)array.length);
    }
}