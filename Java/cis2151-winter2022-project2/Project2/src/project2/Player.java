package project2;

import java.io.Serializable;

public class Player implements Serializable {

    private int xCo;
    private int yCo;
    private boolean hasHammer;
    private boolean hasAxe;
    private boolean hasShovel;

    public Player(int yCo, int xCo) {
        this.xCo = xCo;
        this.yCo = yCo;
        hasHammer = false;
        hasAxe = false;
        hasShovel = false;
    }

    public int getxCo() {
        return xCo;
    }

    public void setxCo(int xCo) {
        this.xCo = xCo;
    }

    public int getyCo() {
        return yCo;
    }

    public void setyCo(int yCo) {
        this.yCo = yCo;
    }

    public boolean getHasHammer() {
        return hasHammer;
    }

    public void setHasHammer(boolean hasHammer) {
        this.hasHammer = hasHammer;
    }

    public boolean getHasAxe() {
        return hasAxe;
    }

    public void setHasAxe(boolean hasAxe) {
        this.hasAxe = hasAxe;
    }

    public boolean getHasShovel() {
        return hasShovel;
    }

    public void setHasShovel(boolean hasShovel) {
        this.hasShovel = hasShovel;
    }

}
