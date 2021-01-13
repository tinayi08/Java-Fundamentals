package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {

    public static void main(String [] args) {

        BlackjackController controller = new BlackjackController();
        System.out.println("Welcome to Blackjack, what is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Welcome " + name + ". How much money did you bring to the table?");
        int money = scanner.nextInt();
        System.out.println("Great, how much money would you like to bet this round?");
        int initialPot = scanner.nextInt();
        Player user = new Player(name, initialPot, money);
        Player computer = new Player("Computer", 10, 10);
        Deck deck = new Deck();
        deck.deal(user);
        deck.deal(computer);
        deck.deal(user);
        deck.deal(computer);
        user.getHand().printHand(user);
        computer.getHand().printHand(computer);


        user.moreCards(deck, user);
        computer.moreCards(deck, computer);
        controller.whoWon(user, computer);
        int winningPot = controller.winnings(user, computer);
        int newBal = user.newBalance(user, computer, controller);
        user.noMoreMoney(newBal);
        if (newBal > 0) {
            controller.wouldYouLikeToPlayAgain(user, computer, controller, winningPot, newBal);
        }
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

    public int winnings(Player user, Player computer) {
        int userScore = user.getHand().scoreTotal();
        int compScore = computer.getHand().scoreTotal();
        int winnings;
        if((userScore > compScore && userScore <= 21) || (compScore > 21 && userScore <= 21)) {
            winnings = (user.potValue);
        } else if ((compScore > userScore && compScore <= 21) || (userScore > 21 && compScore <= 21)) {
            winnings = -(user.potValue);
        }else if (userScore == compScore) {
            winnings = 0;
        } else {
            winnings = -(user.potValue);
        }
        return winnings;
    }

    public void wouldYouLikeToPlayAgain(Player player, Player comp, BlackjackController controller, int winningPot, int newBal) {
        Scanner scanner = new Scanner (System.in);

        while(true) {
            System.out.println();
            System.out.println("Your new balance is " + newBal + " dollars");
            System.out.println("Would you like to play again?");
            String playAgain = scanner.next();
            int newBalance = newBal;
            if (playAgain.equalsIgnoreCase("yes")) {
                System.out.println(player.getName() + ", how much would you like to bet?");
                int newBet = scanner.nextInt();
                while(newBet > newBalance) {
                    System.out.println("You don't have enough money, please enter a new bet.");
                    newBet = scanner.nextInt();
                }
                Player user = new Player(player.getName(), newBet, newBalance);
                Player computer = new Player("Computer", 10, 10);
                Deck deck = new Deck();
                deck.deal(user);
                deck.deal(computer);
                deck.deal(user);
                deck.deal(computer);
                user.getHand().printHand(user);
                computer.getHand().printHand(computer);
                user.moreCards(deck, user);
                computer.moreCards(deck, computer);
                controller.whoWon(user, computer);
                winningPot = controller.winnings(user, computer);
                newBal = user.newBalance(user, computer, controller);
                user.noMoreMoney(newBal);
                if (user.exit(newBal)) {
                    return;
                }
            } else {
                System.out.println("Game over, thank you for playing.");
                return;
            }
        }
    }

}






