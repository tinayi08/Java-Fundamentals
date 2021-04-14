package labs_examples.lambdas.labs;


/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */
public class Exercise1 {

    public static void main(String[] args) {
        //part 2
        Exercise1FuncInterfaceP1 obj = () -> {
            System.out.println("I have redefined the lambda expression");
        };

        obj.method();
        //part 2
        Exercise1AnonInnerClass objAnon = new Exercise1AnonInnerClass();
        objAnon.method();

        //Part 4
        Ex1FuncInterfaceP3 obj3 = (int a) -> {
            return a * a;
        };
        System.out.println(obj3.sum(5));
        Ex1AnonInnerClassP4 obj4 = new Ex1AnonInnerClassP4();
        System.out.println(obj4.sum(10));
    }
}
