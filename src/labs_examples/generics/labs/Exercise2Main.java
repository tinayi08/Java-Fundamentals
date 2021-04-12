package labs_examples.generics.labs;

import java.util.ArrayList;

public class Exercise2Main<T> {

    /**
     * Generics Exercise 2:
     *
     *      Create a class with a generic method that takes in an ArrayList of any
     *      Numeric type and returns the sum of all
     *      Numbers in the ArrayList
     */

    public static void main(String[] args) {
        Exercise2Main obj = new Exercise2Main();

        System.out.println(obj.total());
    }



    public double total() {
        ArrayList<Number> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(5.5);

        double sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i).doubleValue();
        }
        return sum;

    }
}
