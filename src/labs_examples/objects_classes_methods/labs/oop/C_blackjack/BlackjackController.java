package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {

//test




    public static void main(String [] args) {
        BlackjackController controller = new BlackjackController();
        System.out.println("Welcome to Blackjack, what is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Welcome " + name + ". How much money would you like to bet?");
        int initialPot = scanner.nextInt();
        Player user = new Player(name, initialPot);
        Player computer = new Player("Computer", 10);


        Deck deck = new Deck();
        deck.deal(user);
        deck.deal(computer);
        deck.deal(user);
        deck.deal(computer);

        user.getHand().printHand(user);
        computer.getHand().printHand(computer);

        user.moreCards2(deck, user);
        computer.moreCards2(deck, computer);

        controller.whoWon(user, computer);

        controller.wouldYouLikeToPlayAgain(user, computer, controller);
    }

    public void whoWon (Player user, Player computer) {
        System.out.println();
        int userScore = user.getHand().scoreTotal();
        int compScore = computer.getHand().scoreTotal();
        if ((userScore > compScore && userScore <= 21) || (compScore > 21 && userScore <= 21)) {
            System.out.println(user.getName() + " won " + (user.potValue)*2 + " dollars!");
        } else if ((compScore > userScore && compScore <= 21) || (userScore > 21 && compScore <= 21)) {
            System.out.println("Computer won, you have lost your " + user.potValue +" dollars.");
        } else if (userScore == compScore) {
            System.out.println("You tied. You will receive your " + user.potValue + " dollars back.");
        } else {
            System.out.println("There are no winners, you have lost your " + user.potValue +" dollars.");

        }

        System.out.println("-----");
    }

    public void wouldYouLikeToPlayAgain(Player player, Player comp, BlackjackController controller) {
        Scanner scanner = new Scanner (System.in);
        while(true) {
            System.out.println();
            System.out.println("Would you like to play again?");
            String playAgain = scanner.next();
            if (playAgain.equalsIgnoreCase("yes")) {
                System.out.println(player.getName() + ", how much would you like to bet?");
                int newPot = scanner.nextInt();
                Player user = new Player(player.getName(), newPot);
                Player computer = new Player("Computer", 10);
                Deck deck = new Deck();
                deck.deal(user);
                deck.deal(computer);
                deck.deal(user);
                deck.deal(computer);

                user.getHand().printHand(user);
                computer.getHand().printHand(computer);

                user.moreCards2(deck, user);
                computer.moreCards2(deck, computer);

                controller.whoWon(user, computer);
            } else {
                System.out.println("Game over, thank you for playing.");
                return;
            }
        }
    }
}



