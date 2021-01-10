package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class Player {
    String name;
    Hand hand;
    int potValue;
    int wager;

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

    public Player(String name, int potValue) {
        this.name = name;
        hand = new Hand();
        this.potValue = potValue;
    }
    // if returns false - no more cards
    //if returns true - more cards
    public boolean computerAI() {
        if(hand.scoreTotal() < 16) {
            return true;
        } else
            return false;
    }

    public void placeBet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println(name + " how much would you like to wager this round?");
        int wager = scanner.nextInt();
        this.wager = wager;
    }

    public int getWager() {
        return wager;
    }

    public void setWager(int wager) {
        this.wager = wager;
    }


    public void dealCard(Deck deck, Player player) {
        deck.deal(this);
        hand.printHand(player);
        //int score = hand.scoreTotal();
        //System.out.println(name + "'s current score: " + score);

    }

    //didnt use this one because i was unsure of how to make it loop. created moreCards2 instead with void instead of boolean
    public boolean moreCards () {
        Scanner scanner = new Scanner(System.in);
        if (name.equalsIgnoreCase("computer")) {
            while (hand.scoreTotal() < 21) {
                System.out.println();
                System.out.println("Computer, would you like another card?");
                if (hand.scoreTotal() < 16) {
                    System.out.println("Yes");
                    return true;
                } else {
                    System.out.println("Computer does not want anymore cards");
                    return false;
                }
            }
            return false;
        } else {
            while (hand.scoreTotal() < 21) {
                System.out.println();
                System.out.println(name + ", would you like another card?");
                String yesOrNo = scanner.next();
                if (yesOrNo.equalsIgnoreCase("yes")) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
    }

    public void moreCards2(Deck deck, Player player) {
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
