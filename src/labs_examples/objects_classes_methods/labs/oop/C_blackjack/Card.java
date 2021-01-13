package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {

    public char suit;
    public int cardValue;

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    //setting the score value of the card so J Q K equal 10
    public int getScoreValue() {
        if (cardValue > 10) {
            return 10;
        } else if (cardValue == 1) {
            return 11;
        } else
            return cardValue;
    }


    //setting the face value of the cards Ace, J, Q, K
    public String getFaceValue(){
        if(cardValue == 1) {
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

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public Card(char suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }
}
