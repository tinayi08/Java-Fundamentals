package labs_examples.exception_handling.labs;

public class Exercise2 {
    public static void main(String[] args) {
        int [] array = {1, 5, 45, 9, 0};

        try {
            int x = array[0]/array[4];
            int i = array[10];
            System.out.println(i);
            System.out.println(x);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("That array index does not exist");
        } catch(ArithmeticException exc2) {
            System.out.println("That math is not possible");
        }
    }
}
