package cis1500_project3_alexanderhunt;

public class Plane {

    private final String make;
    private final String model;
    private final int number;
    private final int maxAltitude;
    private int currentAltitude;
    private boolean landingGear;

    public Plane(int currentAltitude, boolean landingGear) {
        make = "Boeing";
        model = "747";
        number = 17842365;
        maxAltitude = 12000;
        this.currentAltitude = currentAltitude;
        this.landingGear = landingGear;
    }
//get methods start here

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public int getCurrentAltitude() {
        return currentAltitude;
    }

    public boolean isLandingGear() {
        return landingGear;
    }
//get methods end here
//set methods start here

    public boolean setCurrentAltitude(int changeInAltitude) {
        if ((isLandingGear() == true && currentAltitude > 100)||(isLandingGear() == false && currentAltitude < 100)) {
            currentAltitude=100;
            return false;
        }
        if (isLandingGear() == true) {
            if ((currentAltitude + changeInAltitude) > 100) {
                currentAltitude = 100;
                return false;
            }
            if ((currentAltitude + changeInAltitude) < 0) {
                currentAltitude = 0;
                return false;
            }
        }
        if (isLandingGear() == false) {
            if ((currentAltitude + changeInAltitude) < 100) {
                currentAltitude = 100;
                return false;
            }
            if ((currentAltitude + changeInAltitude) > maxAltitude) {
                currentAltitude = maxAltitude;
                return false;
            }
        }
        currentAltitude += changeInAltitude;
        return true;
    }

    public boolean setLandingGear() {
        if (currentAltitude == 100) {
            if ((this.landingGear) == true) {
                this.landingGear = false;
                return true;
            } else if ((this.landingGear) == false) {
                this.landingGear = true;
                return true;
            }
        }
        return false;
    }
//set methods end here
}
