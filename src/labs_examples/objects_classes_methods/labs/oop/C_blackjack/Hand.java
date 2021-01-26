package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards = new ArrayList<>();
    private int handValue;

    public ArrayList<Card> getCards() {
        return cards;
    }


    /**
     * This method will print all cards of
     * the computer's hand
     *
     * @param player
     */
    public void printFinalComp(Player player) {
        System.out.println("\nComputer's hand:");
        StringBuilder sb = new StringBuilder();
        for (Card c : cards) {
            sb.append(c.getFaceValue()).append(c.getSuit()).append(" ");
        }
        System.out.println(sb.toString());
        player.blackjackOrBust();
    }

    /**
     * If the player is a computer, this method will print 1 card
     * and specify how many cards are faced down.
     *
     * If the player is not a computer, this method will print
     * all the user's cards.
     *
     * @param computer
     */
    public void print(boolean computer) {
        StringBuilder sb = new StringBuilder();
        if (computer) {
            System.out.println("\nComputer's current hand:");
            sb.append(cards.get(0).getFaceValue()).append(cards.get(0).getSuit()).append(" ");
            int numRemainingCards = cards.size() - 1;
            sb.append(numRemainingCards).append(" ").append("cards face down");
        }
        else {
            System.out.println("\nYour current hand:");
            for (Card c : cards) {
                sb.append(c.getFaceValue()).append(c.getSuit()).append(" ");
            }
        }
        System.out.println(sb.toString());
    }

    public int scoreTotal() {
        int score = 0;
        for (Card c : cards ) {
            score+= c.getScoreValue();
        }
        return score;
    }
}

