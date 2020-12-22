package labs_examples.objects_classes_methods.labs.methods;

import java.util.Scanner;

/**
 * Create a recursive method named factorial that will return the factorial of any number passed to it.
 *
 * For instance, after creatin the factorial method, uncomment the two lines in the main() method. When you run
 * it, it should print 120. It should also work for any ther number you pass it.
 *
 */
public class Exercise_04 {

    public static void main(String[] args) {
//        int x = factorial(5);
//        System.out.println(x);

        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a = recursive(num);
        System.out.println(a);

    }

    public static int recursive(int num) {
        int total;
        if (num == 1) {
            return 1;
        }
        total = recursive(num - 1) * num;
        return total;
    }
}
