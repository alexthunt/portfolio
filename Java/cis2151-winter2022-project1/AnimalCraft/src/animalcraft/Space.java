package animalcraft;

import java.util.Random;

public class Space {

    Random rand = new Random();

    private String description;
    private boolean hasHammer;
    private boolean hasShovel;
    private boolean hasAxe;
    private String descriptionHasHammer;
    private String descriptionHasShovel;
    private String descriptionHasAxe;
    private final String DBCdescription;

    public Space(String DBCdescription) {
        this.DBCdescription=DBCdescription;
        hasHammer = rand.nextBoolean();
        hasShovel = rand.nextBoolean();
        hasAxe = rand.nextBoolean();
        if (hasHammer) {
            descriptionHasHammer = "a";
        } else {
            descriptionHasHammer = "no";
        }
        if (hasShovel) {
            descriptionHasShovel = "a";
        } else {
            descriptionHasShovel = "no";
        }
        if (hasAxe) {
            descriptionHasAxe = "an";
        } else {
            descriptionHasAxe = "no";
        }
        this.description = DBCdescription + " It has " + descriptionHasHammer + " hammer. It has " + descriptionHasShovel + " shovel. It has " + descriptionHasAxe + " axe.";
    }

    public void setHasHammer(boolean hasHammer) {
        this.hasHammer = hasHammer;
        if (hasHammer) {
            descriptionHasHammer = "a";
        } else {
            descriptionHasHammer = "no";
        }
        this.description = DBCdescription + " It has " + descriptionHasHammer + " hammer. It has " + descriptionHasShovel + " shovel. It has " + descriptionHasAxe + " axe.";
    }

    public void setHasShovel(boolean hasShovel) {
        this.hasShovel = hasShovel;
        if (hasShovel) {
            descriptionHasShovel = "a";
        } else {
            descriptionHasShovel = "no";
        }
        this.description = DBCdescription + " It has " + descriptionHasHammer + " hammer. It has " + descriptionHasShovel + " shovel. It has " + descriptionHasAxe + " axe.";
    }

    public void setHasAxe(boolean hasAxe) {
        this.hasAxe = hasAxe;
        if (hasAxe) {
            descriptionHasAxe = "an";
        } else {
            descriptionHasAxe = "no";
        }
        this.description = DBCdescription + " It has " + descriptionHasHammer + " hammer. It has " + descriptionHasShovel + " shovel. It has " + descriptionHasAxe + " axe.";
    }

    public String getDescription() {
        return description;
    }

    public boolean HasHammer() {
        return hasHammer;
    }

    public boolean HasShovel() {
        return hasShovel;
    }

    public boolean HasAxe() {
        return hasAxe;
    }

    public boolean IsDiggable() {
        return false;
    }

    public boolean IsBuildable() {
        return false;
    }

    public boolean IsChoppable() {
        return false;
    }
}
