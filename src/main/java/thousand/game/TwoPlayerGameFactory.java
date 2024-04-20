package thousand.game;

import thousand.cards.Deck;
import thousand.player.CardChoosingStrategy;
import thousand.player.ComputerPlayerStrategy;
import thousand.player.HumanplayerStrategy;
import thousand.player.Player;
import thousand.table.Musik;
import thousand.table.Table;

import java.util.ArrayList;

public class TwoPlayerGameFactory implements GameFactory {
    public TwoPlayerGameFactory() {}

    @Override
    public TwoPlayerGame createGame() {
        Table table = new Table();
        ArrayList<Player> players = createPlayers();
        ArrayList<Musik> musiks = createMusiks();
        Deck deck = new Deck();
        return new TwoPlayerGame(players, deck, table, musiks);
    }

    private ArrayList<Musik> createMusiks() {
        Musik musik1 = new Musik();
        Musik musik2 = new Musik();
        ArrayList<Musik> musiks = new ArrayList<>();
        musiks.add(musik1);
        musiks.add(musik2);
        return musiks;
    }

    private ArrayList<Player> createPlayers() {
        ArrayList<Player> players = new ArrayList<>();

        CardChoosingStrategy strategy = new HumanplayerStrategy();
        Player humanPlayer = new Player(strategy);
        players.add(humanPlayer);

        CardChoosingStrategy strategy2 = new ComputerPlayerStrategy();
        Player computerPlayer = new Player(strategy2);
        players.add(computerPlayer);

        return players;
    }
}
