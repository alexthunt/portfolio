package project2;

import java.io.Serializable;

public class GameState implements Serializable {

    private Player player;
    private Island island;

    public GameState(int YCo, int XCo) {
        player = new Player(YCo, XCo);
        island = new Island();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setIsland(Island island) {
        this.island = island;
    }

    public Player getPlayer() {
        return player;
    }

    public Island getIsland() {
        return island;
    }
}
