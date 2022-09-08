package finalproject;

import java.io.Serializable;

public class Yahtzee implements Serializable {

    private final Dice dice1;
    private final Dice dice2;
    private final Dice dice3;
    private final Dice dice4;
    private final Dice dice5;
    private boolean playerOnesTurnActive;
    private final ScoreCard player1ScoreCard;
    private final ScoreCard player2ScoreCard;
    private int gamePhase;

    public Yahtzee() {
        dice1 = new Dice();
        dice2 = new Dice();
        dice3 = new Dice();
        dice4 = new Dice();
        dice5 = new Dice();
        playerOnesTurnActive = true;
        player1ScoreCard = new ScoreCard();
        player2ScoreCard = new ScoreCard();
        gamePhase = 0;
    }

    public int getGamePhase() {
        return gamePhase;
    }

    public void incrementGamePhase() {
        if (gamePhase <= 2) {
            gamePhase++;
        } else {
            gamePhase = 0;
        }
    }
    
    public void resetGamePhase() {
        gamePhase = 0;
    }

    public ScoreCard getPlayer1ScoreCard() {
        return player1ScoreCard;
    }

    public ScoreCard getPlayer2ScoreCard() {
        return player2ScoreCard;
    }

    public boolean isPlayerOnesTurnActive() {
        return playerOnesTurnActive;
    }

    public void setPlayerOnesTurnActive(boolean playerOnesTurnActive) {
        this.playerOnesTurnActive = playerOnesTurnActive;
    }

    public Dice getDice1() {
        return dice1;
    }

    public Dice getDice2() {
        return dice2;
    }

    public Dice getDice3() {
        return dice3;
    }

    public Dice getDice4() {
        return dice4;
    }

    public Dice getDice5() {
        return dice5;
    }

}
