package thousand.game;

public class TwoPlayerGameFactory implements GameFactory{
    public TwoPlayerGameFactory() {}

    @Override
    public Game createGame() {
        return new TwoPlayerGame();
    }
}
