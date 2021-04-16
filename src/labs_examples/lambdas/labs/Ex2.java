package labs_examples.lambdas.labs;

import java.util.function.Predicate;
import java.util.function.ToIntFunction;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */
public class Ex2 {

    public static void main(String[] args) {
        Ex2 obj = new Ex2();
        obj.predicateMethod("method");
        obj.toIntFunctionMethod(5);
    }

    public void predicateMethod(String str) {
        Predicate<String> characterLength = s -> (s.length() < 10);
        System.out.println("Does the word " + str + " have less than 10 characters? " + characterLength.test(str));

    }

    public void toIntFunctionMethod(int value) {
        ToIntFunction<Integer> math = i -> (i * i);
        System.out.println(math.applyAsInt(value));
    }

}
