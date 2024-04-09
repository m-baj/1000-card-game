package game.cards;

import java.util.HashMap;
import java.util.Map;

public class CardValues {
    public static final Map<CardRank, Integer> cardValues;

    static {
        cardValues = new HashMap<>();
        cardValues.put(CardRank.ACE, 11);
        cardValues.put(CardRank.TEN, 10);
        cardValues.put(CardRank.KING, 4);
        cardValues.put(CardRank.QUEEN, 3);
        cardValues.put(CardRank.JACK, 2);
        cardValues.put(CardRank.NINE, 0);
    }
}
