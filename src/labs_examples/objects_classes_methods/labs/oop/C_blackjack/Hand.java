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


    public void printHand(Player player) {
        System.out.println();
        System.out.println(player.getName() + "'s current hand:");
        StringBuilder sb = new StringBuilder();
        for (Card c : cards) {
            sb.append(c.getFaceValue()).append(c.getSuit()).append(" ");
        }
        System.out.println(sb.toString());
    }


    // will return hand value
    public int scoreTotal() {
        int score = 0;
        for (Card c : cards ) {
            score+= c.getScoreValue();
        }
        return score;
    }
    public boolean busted () {
        if(scoreTotal() <= 21) {
            return true;
        } else {
            return false;
        }
    }

    public void blackjackOrBust () {
        if (scoreTotal() > 21) {
            System.out.println("Busted");
        } else if (scoreTotal() == 21) {
            System.out.println("Blackjack!");
        }
    }

}

