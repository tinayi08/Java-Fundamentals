package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class Player {
    String name;
    Hand hand;
    int potValue;
    int tableBalance;

    public int getTableBalance() {
        return tableBalance;
    }

    public void setTableBalance(int tableBalance) {
        this.tableBalance = tableBalance;
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


    public Player(boolean isComputer) {
        if(isComputer) {
            this.name = "computer";
            hand = new Hand();
        }
    }

    public void setNewBalance (int amount){
        tableBalance += amount;
    }

    public boolean viableBet (int newBet) {
        if (newBet > tableBalance) {
            return false;
        }
        return true;
    }

    public boolean noMoreMoneyGameOver() {
        if (tableBalance == 0) {
            System.out.println("Game over, you have lost all your money. Thank you for playing.");
            return true;
        }
        return false;
    }

    public void moreCards(Deck deck, Player player) {
        Scanner scanner = new Scanner(System.in);
        if(name.equalsIgnoreCase("computer")){
            while(hand.scoreTotal() <= 21) {
                System.out.println();
                if (hand.scoreTotal() < 16) {
                    System.out.println("Computer will take another card.");
                    deck.deal(player);
                    hand.print(true);
                } else {
                    System.out.println("Computer will not take anymore cards.");
                    return;
                }
            }

        } else {
            while (hand.scoreTotal() < 21) {
                System.out.println();
                System.out.println(name + ", would you like another card?");
                String yesOrNo = scanner.next();
                if (yesOrNo.equalsIgnoreCase("yes")) {
                    deck.deal(player);
                    hand.print(false);
                    blackjackOrBust();
                } else {
                    return;
                }
            }
        }
    }

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

    public void placeBet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Great, how much money would you like to bet this round?");
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
