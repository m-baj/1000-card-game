package thousand.game;

import thousand.cards.Card;
import thousand.cards.Deck;
import thousand.player.Player;
import thousand.table.Musik;
import thousand.table.Table;

import java.util.ArrayList;
import java.util.List;

public class TwoPlayerGame implements Game {

    public static int numberOfCardsInMusik = 2;

    private final List<Player> players;
    private final Deck deck;
    private final Table table;
    private final List<Musik> musiks;

    public TwoPlayerGame(ArrayList<Player> players, Deck deck, Table table, List<Musik> musiks) {
        this.players = players;
        this.deck = deck;
        this.table = table;
        this.musiks = musiks;
    }

    @Override
    public void dealCards() {
        Musik firstMusik = musiks.getFirst();
        Musik secondMusik = musiks.getLast();
        while (!deck.isEmpty()) {
            dealCardTo(players.getFirst());
            dealCardTo(players.getLast());
            if (firstMusik.getCardCount() < numberOfCardsInMusik) {
                dealCardTo(firstMusik);
                dealCardTo(secondMusik);
            }
        }
    }

    private void dealCardTo(CardRecipient recipient) {
        Card card = deck.popFirstCard();
        recipient.receiveCard(card);
    }

    public void shuffleDeck() {deck.shuffle();}
}
