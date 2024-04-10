package thousand.player;

import thousand.cards.Card;

import java.util.ArrayList;

public class HumanplayerStrategy implements CardChoosingStrategy{
    @Override
    public Card chooseCardToPlay(ArrayList<Card> cards) {
        return cards.getFirst();
    }
}
