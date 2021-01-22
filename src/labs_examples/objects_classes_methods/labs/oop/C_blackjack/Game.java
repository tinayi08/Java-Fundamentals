package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class Game {

    public void run() {

        Player user = new Player(false);
        user.newPlayer();
        Player computer = new Player(true);
        do {
            Deck deck = new Deck();
            user.placeBet();
            deck.dealInitialCards(user, computer);
            user.getHand().print(false);
            computer.getHand().print(true);
            user.moreCards(deck, user);
            computer.moreCards(deck, computer);
            computer.hand.printFinalComp(computer);

            int winningPot = whoWon(user, computer);
            user.setNewBalance(winningPot);
            if(user.noMoreMoneyGameOver()) {
                return;
            }
            System.out.println("Your new balance is " + user.getTableBalance() + " dollars");
            resetGame(user, computer);
        } while (nextRound());
    }

    public void resetGame(Player user, Player computer) {
        user.setPotValue(0);
        user.getHand().getCards().clear();
        computer.getHand().getCards().clear();
    }

    public boolean nextRound() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to play again?");
        String playAgain = scanner.next();
        if (playAgain.equalsIgnoreCase("yes")) {
            return true;
        } else {
            System.out.println("Game over, thank you for playing.");
            return false;
        }
    }

    public int whoWon (Player user, Player computer) {
        System.out.println();
        int userScore = user.getHand().scoreTotal();
        int compScore = computer.getHand().scoreTotal();
        int winnings;
        if ((userScore > compScore && userScore <= 21) || (compScore > 21 && userScore <= 21)) {
            System.out.println(user.getName() + " won " + (user.potValue)*2 + " dollars!");
            winnings = user.potValue;
        } else if ((compScore > userScore && compScore <= 21) || (userScore > 21 && compScore <= 21)) {
            System.out.println("Computer won, you have lost your " + user.potValue +" dollars.");
            winnings = -(user.potValue);
        } else if (userScore == compScore) {
            System.out.println("You tied. You will receive your " + user.potValue + " dollars back.");
            winnings = 0;
        } else {
            System.out.println("There are no winners, you have lost your " + user.potValue +" dollars.");
            winnings = -(user.potValue);
        }
        System.out.println("-----");
        return winnings;
    }
}
