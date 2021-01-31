package labs_examples.exception_handling.labs;

import java.util.Scanner;

class NotEnoughMoneyException extends Exception {
    @Override
    public String toString(){
        return "NotEnoughMoneyException {You don't have enough money}";
    }
}

public class Exercise7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you have?");
        int x = scanner.nextInt();
        try {
            money(x);
        } catch (NotEnoughMoneyException exc) {
            System.out.println("No money");
        }
    }

    public static void money(int x) throws NotEnoughMoneyException{
        if(x < 50) {
            throw new NotEnoughMoneyException();
        } else
            System.out.println("Great you have money");
    }
}
