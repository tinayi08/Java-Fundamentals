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

    public Player(String name, int potValue, int tableBalance) {
        this.name = name;
        hand = new Hand();
        this.potValue = potValue;
        this.tableBalance = tableBalance;
    }
    // if returns false - no more cards
    //if returns true - more cards

    public void dealCard(Deck deck, Player player) {
        deck.deal(this);
        hand.printHand(player);
        //int score = hand.scoreTotal();
        //System.out.println(name + "'s current score: " + score);

    }

    public int newBalance(Player user, Player computer, BlackjackController controller){
        int winPot = controller.winnings(user, computer);
        int newBal = winPot + user.getTableBalance();
        return newBal;
    }

    public void noMoreMoney (int newBal) {
        if (newBal == 0) {
            System.out.println("Game over, you have lost all your money. Thank you for playing.");
            return;
        }
    }

    public boolean exit (int newBal) {
        if (newBal == 0) {
            return true;
        } else
            return false;
    }

    public void moreCards(Deck deck, Player player) {
        Scanner scanner = new Scanner(System.in);
        if(name.equalsIgnoreCase("computer")){
            while(hand.scoreTotal() < 21) {
                System.out.println();
                if (hand.scoreTotal() < 16) {
                    System.out.println("Computer will take another card.");
                    dealCard(deck, player);
                    hand.blackjackOrBust();
                } else {
                    System.out.println("Computer will not take anymore cards.");
                    hand.printHandFinalComp(player);
                    return;
                }
            }
        } else {
            while (hand.scoreTotal() < 21) {
                System.out.println();
                System.out.println(name + ", would you like another card?");
                String yesOrNo = scanner.next();
                if (yesOrNo.equalsIgnoreCase("yes")) {
                    dealCard(deck, player);
                    hand.blackjackOrBust();
                } else {
                    return;
                }
            }
        }
    }
}
