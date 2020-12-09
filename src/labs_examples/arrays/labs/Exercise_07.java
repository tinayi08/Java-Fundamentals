package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main (String [] args) {
        ArrayList <String> fruits = new ArrayList<>();
        fruits.add("apples");
        fruits.add("bananas");
        fruits.add("oranges");
        fruits.add("kiwi");
        fruits.add("strawberry");
        fruits.add("peaches");
        System.out.println(fruits);

        fruits.remove("kiwi");
        System.out.println(fruits);
        System.out.println(fruits.size());
        fruits.add(3,"apples");
        System.out.println(fruits.lastIndexOf("apples"));
        fruits.set(1,"cranberry");
        System.out.println(fruits);
    }

}
