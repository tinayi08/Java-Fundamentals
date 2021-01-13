package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {

    ArrayList<Card> cards = new ArrayList<>();
    public int handValue;

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    public void printHandFinalComp(Player player) {
        System.out.println();
        System.out.println(player.getName() + "'s hand:");
        StringBuilder sb = new StringBuilder();
        for (Card c : cards) {
            sb.append(c.getFaceValue()).append(c.getSuit()).append(" ");
        }
        System.out.println(sb.toString());
    }

    public void printHand(Player player) {
        if (player.getName().equalsIgnoreCase("computer")) {
            System.out.println();
            System.out.println(player.getName() + "'s current hand:");
            StringBuilder sb = new StringBuilder();
            //this line will get the card from array "cards" at index 0 -- 1st card
            sb.append(cards.get(0).getFaceValue()).append(cards.get(0).getSuit()).append(" ");
            int numRemainingCards = cards.size() - 1;
            sb.append(numRemainingCards).append(" ").append("cards face down");

            System.out.println(sb.toString());
        }
        else {
            System.out.println();
            System.out.println(player.getName() + "'s current hand:");
            StringBuilder sb = new StringBuilder();
            for (Card c : cards) {
                sb.append(c.getFaceValue()).append(c.getSuit()).append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    // will return hand value
    public int scoreTotal() {
        int score = 0;
        for (Card c : cards ) {
            score+= c.getScoreValue();
        }
        return score;
    }

    public void blackjackOrBust () {
        if (scoreTotal() > 21) {
            System.out.println("Busted");
        } else if (scoreTotal() == 21) {
            System.out.println("Blackjack!");
        }
    }
}

