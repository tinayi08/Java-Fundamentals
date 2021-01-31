package labs_examples.exception_handling.labs;

public class Exercise5 {

    public static void main(String[] args) {
        try {
            System.out.println(array());
        } catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("That index does not exist ");
        }
    }

    public static int array() throws ArrayIndexOutOfBoundsException {
        int [] array = {0, 4, 7, 2, 5};
        return array[10];
    }
}
