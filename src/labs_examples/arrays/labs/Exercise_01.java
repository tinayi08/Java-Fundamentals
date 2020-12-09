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

        int [] array = new int [10];
        System.out.println("Provide number 1");
        array[0] = scan.nextInt();
        System.out.println("Provide number 2");
        array[1] = scan.nextInt();
        System.out.println("Provide number 3");
        array[2] = scan.nextInt();
        System.out.println("Provide number 4");
        array[3] = scan.nextInt();
        System.out.println("Provide number 5");
        array[4] = scan.nextInt();
        System.out.println("Provide number 6");
        array[5] = scan.nextInt();
        System.out.println("Provide number 7");
        array[6] = scan.nextInt();
        System.out.println("Provide number 8");
        array[7] = scan.nextInt();
        System.out.println("Provide number 9");
        array[8] = scan.nextInt();
        System.out.println("Provide number 10");
        array[9] = scan.nextInt();
        int count = 0;
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum+=array[i];
            count++;
        }
        System.out.println("The total is " + sum);
        System.out.println("The average is " + sum/(double)count);
    }
}