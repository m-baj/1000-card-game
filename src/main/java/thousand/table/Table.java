package thousand.table;

import thousand.cards.Card;

import java.util.ArrayList;

public class Table {
    private final ArrayList<Card> cards;

    public Table() {
        cards = new ArrayList<>();
    }
    public ArrayList<Card> getCards() {return cards;}
    public void putCardOnTable(Card card) { this.cards.add(card); }
    
}

