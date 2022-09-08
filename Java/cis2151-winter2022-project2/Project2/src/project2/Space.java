package project2;

import java.io.Serializable;
import java.util.Random;

public class Space implements Serializable {

    private boolean isDiggable;
    private boolean isBuildable;
    private boolean isChoppable;
    private boolean hasAxe;
    private boolean hasHammer;
    private boolean hasShovel;

    public Space() {
        Random rand = new Random();
        isDiggable = rand.nextBoolean();
        isBuildable = rand.nextBoolean();
        isChoppable = rand.nextBoolean();
        hasAxe = rand.nextBoolean();
        hasHammer = rand.nextBoolean();
        hasShovel = rand.nextBoolean();
    }

    public boolean getHasAxe() {
        return hasAxe;
    }

    public void setHasAxe(boolean hasAxe) {
        this.hasAxe = hasAxe;
    }

    public boolean getHasHammer() {
        return hasHammer;
    }

    public void setHasHammer(boolean hasHammer) {
        this.hasHammer = hasHammer;
    }

    public boolean getHasShovel() {
        return hasShovel;
    }

    public void setHasShovel(boolean hasShovel) {
        this.hasShovel = hasShovel;
    }

    public boolean getIsDiggable() {
        return isDiggable;
    }

    public void setIsDiggable(boolean isDiggable) {
        this.isDiggable = isDiggable;
    }

    public boolean getIsBuildable() {
        return isBuildable;
    }

    public void setIsBuildable(boolean isBuildable) {
        this.isBuildable = isBuildable;
    }

    public boolean getIsChoppable() {
        return isChoppable;
    }

    public void setIsChoppable(boolean isChoppable) {
        this.isChoppable = isChoppable;
    }
}
