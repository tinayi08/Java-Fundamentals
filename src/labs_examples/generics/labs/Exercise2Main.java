package labs_examples.generics.labs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise2Main<T> {

    /**
     * Generics Exercise 2:
     *
     *      Create a class with a generic method that takes in an ArrayList of any
     *      Numeric type and returns the sum of all
     *      Numbers in the ArrayList
     */

    public static void main(String[] args) {
        ArrayList<Number> array = new ArrayList<>(Arrays.asList(10045345.123464, 2000000, 5.5));
        ArrayList<Number> array2 = new ArrayList<>(Arrays.asList(165.33, 2.4, 3.2));
        System.out.println(total(array2));
        System.out.println(total(array));
    }



    public static <T extends Number> long total(ArrayList<T> array) {

        long sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i).longValue();
        }
        return sum;

    }
}
