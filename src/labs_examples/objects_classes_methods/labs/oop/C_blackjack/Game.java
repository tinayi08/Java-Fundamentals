package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class Game {
    private Player user;
    private Player computer;
    private Deck deck;


    /**
     * This method will initialize the players and the deck.
     *
     */
    public void init() {
        user = new Player(false);
        user.newPlayer();
        computer = new Player(true);
        deck = new Deck();
    }

    /**
     * This method carries the game logic. All the moves in
     * the game will come from this method. User places a bet,
     * both players are dealt cards, user can ask for more cards,
     * it will evaluate who the winner is, declare how much money
     * the user has won or lost. If the user is out of money, the game
     * will end. It will also ask if the user would like to play again or not.
     * The game will automatically continue until the user does not want
     * to play anymore or the user has run out of money.
     *
     */
    public void run() {

        do {
            user.placeBet();
            deck.dealInitialCards(user, computer);
            user.getHand().print(false);
            computer.getHand().print(true);
            user.moreCards(deck, user);
            computer.moreCards(deck, computer);
            computer.getHand().printFinalComp(computer);

            int winningPot = whoWon();
            user.setNewBalance(winningPot);
            if (user.isOutOfMoney()) {
                return;
            }
            System.out.println("Your new balance is " + user.getTableBalance() + " dollars");
            reset();
        } while (nextRound());
    }

    /**
     * This method will reset the PotValue and the player's hand.
     *
     */
    public void reset() {
        user.setPotValue(0);
        user.getHand().getCards().clear();
        computer.getHand().getCards().clear();
    }

    /**
     * This method prompts the player if they  would like to play
     * another round.
     *
     * @return true if player wants to play another round, false otherwise
     */
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

    /**
     * This method will evaluate the score of both players.
     * It will declare who the winner is and will declare how much
     * the player has won or lost.
     *
     * @return the amount the user has won or lost
     */
    private int whoWon() {
        int winnings;
        if ((user.score() > computer.score() && user.score() <= 21) || (computer.score() > 21 && user.score() <= 21)) {
            System.out.println("\n" + user.getName() + " won " + (user.getPotValue())*2 + " dollars!");
            winnings = user.getPotValue();
        } else if ((computer.score() > user.score() && computer.score() <= 21) || (user.score() > 21 && computer.score() <= 21)) {
            System.out.println("\n" + "Computer won, you have lost your " + user.getPotValue() +" dollars.");
            winnings = -(user.getPotValue());
        } else if (user.score() == computer.score()) {
            System.out.println("\n" + "You tied. You will receive your " + user.getPotValue() + " dollars back.");
            winnings = 0;
        } else {
            System.out.println("\n" + "There are no winners, you have lost your " + user.getPotValue() +" dollars.");
            winnings = -(user.getPotValue());
        }
        System.out.println("-----");
        return winnings;
    }
}
