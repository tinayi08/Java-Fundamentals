package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {

    private char suit;
    private int cardValue;

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public int getScoreValue() {
        if (cardValue > 10) {
            return 10;
        } else if (cardValue == 1) {
            return 11;
        } else
            return cardValue;
    }

    /**
     * This method assigns a faceValue to the cardValue.
     * CardValue of 1 is an Ace
     * CardValue of 11 is a Jack
     * CardValue of 12 is a Queen
     * CardValue of 13 is a King
     * Cards in between 1 and 11 are assigned their
     * corresponding number value
     *
     * @return the FaceValue of the card that is used
     */
    public String getFaceValue(){
        if (cardValue == 1) {
            return "Ace";
        } else if (cardValue > 1 && cardValue < 11) {
            return String.valueOf(cardValue);
        } else if (cardValue == 11) {
            return "Jack";
        } else if (cardValue == 12) {
            return "Queen";
        } else
            return "King";
    }

    private void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public Card(char suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }
}
