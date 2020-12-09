package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }
        int x = 16 | 7;
        // 0001 0000
        // 0000 0111
        // 0001 0111
        System.out.println(x);
        // write your code below
        if (a & b) {
            System.out.println("a and be are true");
        } else {
            System.out.println("a and b are not both true");
        }
        if (a && b) {
            System.out.println("a and b are both true");
        } else {
            System.out.println("a and b are not both true");
        }
        if (a || b) {
            System.out.println("a or b are true");
        }

        if (a ^ b) {
            //one can be true but not both
            System.out.println("a or b is true");
        }
        if (!a) {
            System.out.println("a is true");
        }
    }

}

