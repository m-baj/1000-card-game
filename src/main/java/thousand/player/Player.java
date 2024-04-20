package thousand.player;

import thousand.cards.Card;
import thousand.game.CardRecipient;

import java.util.ArrayList;

public class Player implements CardRecipient {
    private final CardChoosingStrategy cardChoosingStrategy;
    private final ArrayList<Card> hand = new ArrayList<>();
    public Player(CardChoosingStrategy cardChoosingStrategy) {
        this.cardChoosingStrategy = cardChoosingStrategy;
    }

    public Card chooseCard(ArrayList<Card> hand) {
        return this.cardChoosingStrategy.chooseCardToPlay(this.hand);
    }

    public ArrayList<Card> getHand() { return this.hand; }
    public void receiveCard(Card card) {
        hand.add(card);
    }
}
