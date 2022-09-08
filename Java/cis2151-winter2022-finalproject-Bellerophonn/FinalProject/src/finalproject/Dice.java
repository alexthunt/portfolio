package finalproject;

import java.io.Serializable;
import java.util.Random;

public class Dice implements Serializable {

    Random rand = new Random();

    private int face;
    private boolean inPlay;

    public Dice() {
        face = (rand.nextInt(6) + 1);
        inPlay = true;
    }

    public int getFace() {
        return face;
    }

    public void rollDice() {
        face = (rand.nextInt(6) + 1);
    }

    public boolean isInPlay() {
        return inPlay;
    }

    public void setInPlay(boolean inPlay) {
        this.inPlay = inPlay;
    }

}
