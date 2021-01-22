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


    public void printFinalComp(Player player) {
        System.out.println();
        System.out.println("Computer's hand:");
        StringBuilder sb = new StringBuilder();
        for (Card c : cards) {
            sb.append(c.getFaceValue()).append(c.getSuit()).append(" ");
        }
        System.out.println(sb.toString());
        player.blackjackOrBust();
    }

    public void print(boolean computer) {
        if (computer) {
            System.out.println();
            System.out.println("Computer's current hand:");
            StringBuilder sb = new StringBuilder();
            sb.append(cards.get(0).getFaceValue()).append(cards.get(0).getSuit()).append(" ");
            int numRemainingCards = cards.size() - 1;
            sb.append(numRemainingCards).append(" ").append("cards face down");

            System.out.println(sb.toString());
        }
        else {
            System.out.println();
            System.out.println("Your current hand:");
            StringBuilder sb = new StringBuilder();
            for (Card c : cards) {
                sb.append(c.getFaceValue()).append(c.getSuit()).append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    public int scoreTotal() {
        int score = 0;
        for (Card c : cards ) {
            score+= c.getScoreValue();
        }
        return score;
    }

}

