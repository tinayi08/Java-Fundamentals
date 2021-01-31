package labs_examples.exception_handling.labs;

public class Exercise1 {
    public static void main(String[] args) {
        int [] array = {1, 5, 45, 9, 0};

        try {
            int i = array[10];
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("That array index does not exist");
        }
    }

}
