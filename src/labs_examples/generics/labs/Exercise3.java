package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Collection;

public class Exercise3<T, V> {
    /**
     * Generics Exercise 3:
     *
     *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
     *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
     *      numbers were passed in regardless of their type.
     *
     *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes
     *
     *      3) Write a generic method to exchange the positions of two different elements in an array.
     *
     *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
     *
     */
    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();
        System.out.println(obj.total(10.5,4));
        obj.palindromes();
    }

    public <T extends Number, V extends Number> double total (T val1, V val2) {
        double sum = val1.doubleValue() + val2.doubleValue();

        return sum;

    }

    public void palindromes () {
        int count = 0;
        Collection<String> str = new ArrayList();
        str.add("anna");
        str.add("madam");
        str.add("kayak");
        str.add("read");


            for(String s : str) {
                System.out.println(s);
            }


    }


}
