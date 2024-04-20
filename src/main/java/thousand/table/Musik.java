package thousand.table;

import thousand.cards.Card;
import thousand.game.CardRecipient;

import java.util.ArrayList;

public class Musik implements CardRecipient {
    private final ArrayList<Card> cards;
    public Musik() {
        cards = new ArrayList<>();
    }
    public void receiveCard(Card card) { cards.add(card); }
    public ArrayList<Card> getCards() { return cards; }
    public int getCardCount() { return cards.size(); }
}
