package thousand.player;

import thousand.cards.Card;

import java.util.ArrayList;

public class ComputerPlayerStrategy implements CardChoosingStrategy {

    @Override
    public Card chooseCardToPlay(ArrayList<Card> hand) {
        return hand.getLast();
    }
}
