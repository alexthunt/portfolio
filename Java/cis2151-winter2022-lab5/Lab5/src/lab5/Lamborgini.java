package lab5;

public class Lamborgini implements Driveable{
    private int currentLitersInTank;
    private int kilometersPerLiter;
    private int maxLitersInTank;

    public Lamborgini() {
        currentLitersInTank = 75;
        maxLitersInTank = 75;
        kilometersPerLiter = 10;
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
        return "Lamborgini";
    }
}
