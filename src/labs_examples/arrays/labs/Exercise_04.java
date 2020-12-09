package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main (String [] args) {
        int[][] array = new int[][] {
            {1, 5, 3},
            {6, 3},
            {4, 99, 67}
        };

        System.out.println("end");
        for (int[] outer : array) {
            for (int val : outer) {
                System.out.print(val + "-");
            }
            System.out.println();
        }
    }
}
