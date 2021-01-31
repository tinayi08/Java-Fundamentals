package labs_examples.exception_handling.labs;

public class Exercise4 {

    public static void main(String[] args) {
        int [] array = {1, 5, 45, 9, 0};

        try {

            int x = array[0]/array[4];
            System.out.println(x);
            try {
                System.out.println(array[10]);
            } catch (ArrayIndexOutOfBoundsException exc1) {
                System.out.println("That array index is not valid");
            }
        } catch(ArithmeticException exc2) {
            System.out.println("That math is not possible");
        } finally {
            System.out.println("This block will always execute");
        }
    }
}
