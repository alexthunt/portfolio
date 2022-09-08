package animalcraft;

public class Player {

    private final String name;
    private Island island;
    private boolean hammerEquipped;
    private boolean ShovelEquipped;
    private boolean AxeEquipped;
    private int yCoordinate;
    private int xCoordinate;

    public Player(String name, int yCoordinate, int xCoordinate) {
        this.name = name;
        hammerEquipped = false;
        ShovelEquipped = false;
        AxeEquipped = false;
        this.yCoordinate = yCoordinate;
        this.xCoordinate = xCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setHammerEquipped(boolean hammerEquipped) {
        this.hammerEquipped = hammerEquipped;
    }

    public void setShovelEquipped(boolean ShovelEquipped) {
        this.ShovelEquipped = ShovelEquipped;
    }

    public void setAxeEquipped(boolean AxeEquipped) {
        this.AxeEquipped = AxeEquipped;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public String getName() {
        return name;
    }

    public boolean isHammerEquipped() {
        return hammerEquipped;
    }

    public boolean isShovelEquipped() {
        return ShovelEquipped;
    }

    public boolean isAxeEquipped() {
        return AxeEquipped;
    }

}
