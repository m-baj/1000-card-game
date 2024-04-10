package thousand.table;

import thousand.cards.Card;

import java.util.ArrayList;

public class Musik {
    private ArrayList<Card> cards;
    public Musik() {
        cards = new ArrayList<>();
    }
    public void addCard(Card card) { cards.add(card); }
    public ArrayList<Card> getCards() { return cards; }
}
