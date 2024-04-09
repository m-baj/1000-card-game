package game.cards;

import java.util.ArrayList;


public class Deck {
    private ArrayList<Card> cards;
    public Deck() {
        cards = new ArrayList<>();
        for (CardSuit suit : CardSuit.values()) {
            for (CardRank rank : CardRank.values()) {
                Card card = new Card(suit, rank, CardValues.cardValues.get(rank));
                cards.add(card);
            }
        }
    }
    public ArrayList<Card> getCards() {return cards;}

    public Card getCard(CardSuit suit, CardRank rank) throws CardNotFoundException {
        for (Card card : cards) {
            if (card.getSuit() == suit && card.getRank() == rank) {
                return card;
            }
        }
        throw new CardNotFoundException("Card: " + rank + ", " + suit + " not found");
    }

    public Card removeCard(CardSuit suit, CardRank rank) throws CardNotFoundException {
        Card card = getCard(suit, rank);
        cards.remove(card);
        return card;
    }

}
