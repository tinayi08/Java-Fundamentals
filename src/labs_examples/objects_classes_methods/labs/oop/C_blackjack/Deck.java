package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private Card[] cards;
    private ArrayList<Integer> usedCards = new ArrayList<>();
    private char[] suits = new char[]{'♠', '♦', '♥', '♣'};


    public Deck() {
        cards = new Card[52];
        populateDeck();
    }

    private void populateDeck() {
        int count = 0;
        for (int i = 1; i <= 13; i++) {
            for (char c : suits) {
                Card card = new Card(c,i);
                cards[count] = card;
                count++;
            }
        }
    }

    /**
     * This method will deal a random card to the player.
     * It will check to make sure that the card has not been used first.
     * If the card has not been used, it will be assigned to the player's hand.
     *
     * @param player
     */
    public void deal(Player player){
        Random rand = new Random();
        int n = rand.nextInt(52);

        while (usedCards.contains(n)) {
            n = rand.nextInt(52);
        }
        usedCards.add(n);
        player.getHand().getCards().add(cards[n]);
        return;
    }

    /**
     * This method will deal a card to the user,
     * then the computer, then the user again, and the computer
     * again. Starting the game with each player having 2 cards each.
     *
     * @param user
     * @param computer
     */
    public void dealInitialCards(Player user, Player computer) {
        deal(user);
        deal(computer);
        deal(user);
        deal(computer);
    }
}
