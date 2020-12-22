package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int a = 10;
        int b = 5;
        int multi = multiply(a, b);

        System.out.println("multiply " + a + " * " + b + ": " + multi);

        double div = divide(a, b);
        System.out.println("divide " + a + " * " + b + ": " + div);

        String s = joke("I cant think of a joke");
        System.out.println(s);
        int years = 2;
        int t = time(years);
        System.out.println("number of seconds in " + years + " years is " + t);

        int v = varargs("hello", "how", "many", "strings", "is", "this");
        System.out.println("count is:" + v);
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b) {
        return a * b;

    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static double divide(int a, int b) {
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static String joke(String jokes) {

        return jokes;
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int time (int years){
        int seconds = years * 365 * 24 * 60 * 60;
        return seconds;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int varargs(String...s) {
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            count++;
        }
        return count;
    }

}
