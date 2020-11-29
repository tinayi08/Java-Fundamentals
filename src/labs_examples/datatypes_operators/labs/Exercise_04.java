package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below
        if (b < a){
            System.out.println("b is less than a");
        }
        if (a <= 1){
            System.out.println("a is less than or equal to 1");
        }
        if (b >= 2){
            System.out.println("b is greater or equal to 2");
        }
        if (b == 2){
            System.out.println("b is equal to 2");
        }
    }

}

