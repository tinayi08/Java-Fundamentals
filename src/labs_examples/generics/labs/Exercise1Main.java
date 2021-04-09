package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */
public class Exercise1Main {

    public static void main(String[] args) {
        Exercise1<Integer> obj = new Exercise1(100, 150);
        System.out.println(obj.getVal1());
        System.out.println(obj.getVal2());

        Exercise1<String> obj2 = new Exercise1<String>("Val1 is a String", "Val2 is also a string");
        System.out.println(obj2.getVal1());
        System.out.println(obj2.getVal1());

        Exercise1V<String, Integer> obj3 = new Exercise1V<String, Integer>("Val1 is a string", 5);
        System.out.println(obj3.getVal1() + " But val2 is " + obj3.getVal2());

    }
}
