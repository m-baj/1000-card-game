package game;

public class Card {
    private final CardSuit color;
    private final CardRank rank;
    private final int value;

    public Card(CardSuit color, CardRank rank, int value) {
        this.color = color;
        this.rank = rank;
        this.value = value;
    }

    public CardSuit getColor() {
        return color;
    }
    public CardRank getRank() {
        return rank;
    }
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Color: " + color + ", Rank: " + rank + ", Value: " + value;
    }
}
