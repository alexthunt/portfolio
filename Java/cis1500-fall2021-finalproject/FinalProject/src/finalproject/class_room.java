package finalproject;


public class class_room {
    private boolean blocked;
    private int location;
    private boolean enemyPresent;
    private int gold;

    public class_room(boolean blocked, int location, boolean NPCPresent, int gold) {
        this.blocked = blocked;
        this.location = location;
        this.enemyPresent = NPCPresent;
        this.gold = gold;
    }

    //getters
    
    public boolean isBlocked() {
        return blocked;
    }

    public int getLocation() {
        return location;
    }

    public boolean isNPCPresent() {
        return enemyPresent;
    }

    public int getGold() {
        return gold;
    }

    //setters
    
    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public void isNPCPresent(boolean NPCPresent) {
        this.enemyPresent = NPCPresent;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
    
}
