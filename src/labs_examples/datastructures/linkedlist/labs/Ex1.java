package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex1 {

    /**
     *      LinkedLists - Exercise_01
     *
     *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
     *
     *      1) create a LinkedList (from Java's libraries)
     *      2) add()
     *      3) addAll()
     *      4) addFirst()
     *      5) addLast()
     *      6) getFirst()
     *      7) getLast()
     *      8) get()
     *      9) set()
     *      10) push()
     *      11) pop()
     *      12) remove()
     *      13) contains()
     *      14) listIterator()
     *      15) clear()
     */

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("this");
        list.add("is");
        list.add("a");
        list.add("LinkedList.");

        Collection<String> collection = new ArrayList<String>();
        collection.add("Now");
        collection.add("adding");
        collection.add("from");
        collection.add("Collection");
        list.addAll(collection);

        list.addFirst("First");
        list.addLast("Last");

        System.out.println(list);
        System.out.println("First item on list is: " + list.getFirst());
        System.out.println("Last item on list is: " + list.getLast());
        System.out.println("Second item on list is: " + list.get(1));
        list.set(3, "New addition in index 3");
        System.out.println(list);
        list.push("Push");
        System.out.println(list);
        list.pop();
        System.out.println(list);
        list.remove(0   );
        System.out.println("Does this list contain word: java? " + list.contains("Java"));

        Iterator x = list.listIterator(5);
        while(x.hasNext()) {
            System.out.println(x.next());
        }
        list.clear();
        System.out.println(list);

    }
}
