package lab5;

public class ChevyCruise implements Driveable {
    private int currentLitersInTank;
    private int kilometersPerLiter;
    private int maxLitersInTank;

    public ChevyCruise() {
        currentLitersInTank = 60;
        kilometersPerLiter = 15;
        maxLitersInTank = 60;
    }
    
    
    
    @Override
    public boolean drive(int kilometersToDrive) {
        if (kilometersToDrive <= (currentLitersInTank*kilometersPerLiter)) {
            currentLitersInTank = (currentLitersInTank-(kilometersToDrive/kilometersPerLiter));
            return true;
        }
        return false;
    }

    @Override
    public double getKilometersPerLiter() {
        return kilometersPerLiter;
    }

    @Override
    public double getLitersInTank() {
        return currentLitersInTank;
    }
    
    @Override
    public String toString() {
        return "ChevyCruse";
    }
}
