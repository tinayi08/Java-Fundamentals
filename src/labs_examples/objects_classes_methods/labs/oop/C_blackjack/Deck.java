package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    Card[] cards;
    ArrayList<Integer> usedCards = new ArrayList<>();
    char[] suits = new char[]{'♠', '♦', '♥', '♣'};

    public Deck() {
        cards = new Card[52];
        populateDeck();
    }

    private void populateDeck() {
        int count = 0;
        for(int i = 1; i <= 13; i++) {
            for (char c : suits) {
                Card card = new Card(c,i);
                cards[count] = card;
                count++;
            }

        }
    }

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
}
