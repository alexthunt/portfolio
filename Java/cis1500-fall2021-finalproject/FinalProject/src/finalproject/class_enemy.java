
package finalproject;

import java.util.Random;

public class class_enemy {
    private int hitPoints;
    private int strength;
    private int dexterity;
    private int intelligence;
    Random rand = new Random();
    
    //constructor

    public class_enemy(int hitPoints, int strength, int dexterity, int intelligence) {
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
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

    //setters

    public void initializeHitPoint (int initialHealth) {
        hitPoints = initialHealth;
    }
    
    public void setHitPoints(int incomingDamage) {
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
    
    
}
