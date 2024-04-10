package thousand.player;

import thousand.cards.Card;

import java.util.ArrayList;

public interface CardChoosingStrategy {
    Card chooseCardToPlay(ArrayList<Card> hand);
}
