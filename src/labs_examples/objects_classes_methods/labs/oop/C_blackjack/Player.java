package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class Player {
    private String name;
    private Hand hand;
    private int potValue;
    private int tableBalance;

    public int getTableBalance() {
        return tableBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

    /**
     * This method is used to create a player object.
     * If the player is a computer, it will assign the object's name
     * as "Computer" and create a hand object for the computer.
     *
     * @param isComputer
     */
    public Player(boolean isComputer) {
        if (isComputer) {
            this.name = "computer";
            hand = new Hand();
        }
    }

    public int score() {
        return hand.scoreTotal();
    }

    /**
     * This method will add the winning bet or lost bet to the user's
     * table balance (money the user brought to gamble with).
     *
     * @param amount
     */
    public void setNewBalance(int amount){
        tableBalance += amount;
    }

    private boolean viableBet(int newBet) {
        if (newBet > tableBalance) {
            return false;
        }
        return true;
    }

    public boolean isOutOfMoney() {
        if (tableBalance == 0) {
            System.out.println("Game over, you have lost all your money. Thank you for playing.");
            return true;
        }
        return false;
    }

    /**
     * This method will check to see if the player would like more cards.
     * If the player is the computer, the method will automatically give
     * the computer another card if the computer's card score is less than 16.
     * Once the computer's score is over 16, the computer will not take any more cards.
     *
     * If the player is the user, the user will be able to input whether or not the user
     * would like more cards. The user will be prompted until their card score is 21 or over.
     *
     * @param deck
     * @param player
     */
    public void moreCards(Deck deck, Player player) {
        Scanner scanner = new Scanner(System.in);
        if (name.equalsIgnoreCase("computer")){
            while (hand.scoreTotal() <= 21) {
                if (hand.scoreTotal() < 16) {
                    System.out.println("\nComputer will take another card.");
                    deck.deal(player);
                    hand.print(true);
                } else {
                    System.out.println("\nComputer will not take anymore cards.");
                    return;
                }
            }
        }
        while (hand.scoreTotal() < 21) {
            System.out.println("\n" + name + ", would you like another card? Enter yes or no.");
            String yesOrNo = scanner.next();
            while (!yesOrNo.equalsIgnoreCase("yes") && !yesOrNo.equalsIgnoreCase("no")) {
                System.out.println("Please enter a valid answer.");
                yesOrNo = scanner.next();
            }
            if (yesOrNo.equalsIgnoreCase("yes")) {
                deck.deal(player);
                hand.print(false);
                blackjackOrBust();
            } else {
                return;
            }
        }
    }

    /**
     * This method is used to help create a new player.
     * This method gathers the player's name, creates
     * the hand for the player and will record how much money
     * the player has brought to gamble with.
     *
     */
    public void newPlayer() {
        System.out.println("Welcome to Blackjack, what is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Welcome " + name + ". How much money did you bring to the table?");
        int money = scanner.nextInt();
        this.tableBalance = money;
        this.name = name;
        this.hand = new Hand();
    }

    /**
     * This method will collect the player's bet.
     * It will also check to make sure that the bet is viable.
     * The player can not bet more money than he/she has.
     */
    public void placeBet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Great, how much money would you like to bet this round?");
        //TODO - Try Catch handle if user inputs something other than int
        int bet = scanner.nextInt();
        while (!viableBet(bet)) {
            System.out.println("You don't have enough money, please enter a new bet.");
            bet = scanner.nextInt();
        }
        potValue += bet;
    }

    public void blackjackOrBust () {
        if (hand.scoreTotal() > 21) {
            System.out.println("Busted");
        } else if (hand.scoreTotal() == 21) {
            System.out.println("Blackjack!");
        }
    }
}
