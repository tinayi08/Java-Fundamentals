package labs_examples.exception_handling.labs;

public class Exercise6 {

    public static void main(String[] args) {
        try {
            method();
        } catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("That index does not exist ");
        }
    }

    public static void method() throws ArrayIndexOutOfBoundsException {
        array();
    }
    public static int array() throws ArrayIndexOutOfBoundsException {
        try {
            int [] array = {0, 4, 7, 2, 5};
            return array[10];
        } catch (ArrayIndexOutOfBoundsException exc1){
            System.out.println("Exception caught");
            throw exc1;
        }
    }
}

