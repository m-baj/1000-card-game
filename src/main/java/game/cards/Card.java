package game.cards;

public class Card {
    private final CardSuit suit;
    private final CardRank rank;
    private final int value;

    public Card(CardSuit suit, CardRank rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    public CardSuit getSuit() {
        return suit;
    }
    public CardRank getRank() {
        return rank;
    }
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Color: " + suit + ", Rank: " + rank + ", Value: " + value;
    }
}
