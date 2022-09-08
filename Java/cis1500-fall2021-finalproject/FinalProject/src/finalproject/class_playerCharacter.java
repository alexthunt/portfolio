
package finalproject;

import java.util.Random;

public class class_playerCharacter {
    private int hitPoints;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int playerGold;
    Random rand = new Random();

    //constructor

    public class_playerCharacter(int strength, int dexterity, int intelligence) {
        hitPoints = 20;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        playerGold = 0;
    }
    


    //getters
    
    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getPlayerGold() {
        return playerGold;
    }
    
    //setters
    
    public void healToFull() {
        hitPoints = 20;
    }
    
    public void setHitPoints(int incomingDamage) {
        if (incomingDamage < 1) {
            incomingDamage = 1;
        }
        hitPoints = hitPoints-incomingDamage;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setPlayerGold(int incomingGold) {
        playerGold = playerGold+incomingGold;
    }


    
    
}
