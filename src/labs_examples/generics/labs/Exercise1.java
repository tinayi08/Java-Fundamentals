package labs_examples.generics.labs;

public class Exercise1<T> {

    /**
     * Generics Exercise 1:
     *
     *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
     *      2.) Create a few objects of your generic class with different data types to demonstrate it's
     *          dynamic usage.
     */

    T val1;
    T val2;

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public T getVal2() {
        return val2;
    }

    public void setVal2(T val2) {
        this.val2 = val2;
    }

    public Exercise1(T val1, T val2) {
        this.val1 = val1;
        this.val2 = val2;
    }




}
