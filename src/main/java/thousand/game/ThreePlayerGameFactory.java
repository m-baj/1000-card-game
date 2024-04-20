package thousand.game;

public class ThreePlayerGameFactory implements GameFactory{
    public Game createGame() {
        return new ThreePlayerGame();
    }
}
