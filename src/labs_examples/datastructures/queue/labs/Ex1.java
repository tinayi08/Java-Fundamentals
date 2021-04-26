package labs_examples.datastructures.queue.labs;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class Ex1 {

    /**
     *      Demonstrate your mastery of Java's (sun's) built-in Queue class
     *      (as seen in the import statement
     *      above) by completing the following:
     *
     *      1) instantiate a new Queue
     *      2) demonstrate the use of EVERY method in the Queue class - there are 7
     */


    public static void main(String[] args) {
        PriorityQueue<String> newQueue = new PriorityQueue();

        Queue<String> nQueue = new LinkedList<>();
        newQueue.add("one");
        newQueue.add("two");
        newQueue.add("three");
        newQueue.add("four");
        newQueue.add("five");

        //retrieves and removes head
        String remove = newQueue.remove();
        System.out.println(remove);

        System.out.println(newQueue);

        //element retrieves head but does not remove
        String element = newQueue.element();
        System.out.println(element);
        System.out.println(newQueue);

        //peek
        String peek = newQueue.peek();
        System.out.println(peek);
        System.out.println(newQueue);

        int size = newQueue.size();
        System.out.println("Size is: " + size);

        newQueue.clear();
        System.out.println(newQueue);
    }
}
