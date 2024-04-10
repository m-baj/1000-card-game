package thousand.table;

import thousand.cards.Card;

import java.util.ArrayList;

public class Table {
    private ArrayList<Card> cards;
    private ArrayList<Musik> musiks;

    public Table() {
        cards = new ArrayList<>();
        musiks = new ArrayList<>();
    }
    public ArrayList<Card> getCards() {return cards;}
    public void putCardOnTable(Card card) { this.cards.add(card); }
    public ArrayList<Musik> getMusiks() {return musiks;}
}
