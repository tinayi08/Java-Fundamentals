package labs_examples.datastructures.stack.labs;

import java.util.Stack;

public class Ex1 {

    /**
     *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
     *
     *      1) instantiate a new Stack
     *      2) demonstrate the use of EVERY method in the Stack class - there are 5
     */
    public static void main(String[] args) {
        Stack<String> newStack = new Stack();

        newStack.push("Pushing");
        newStack.push("new");
        newStack.push("Strings");
        newStack.push("more");
        newStack.push("Strings");
        newStack.push("in");
        newStack.push("this");
        newStack.push("stack");
        System.out.println(newStack);


        System.out.println("Peek: " + newStack.peek());

        System.out.println("Stack is empty: " + newStack.empty());

        System.out.println("Depth of \"more\" is: " + newStack.search("more"));

        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        System.out.println(newStack);
    }
}
