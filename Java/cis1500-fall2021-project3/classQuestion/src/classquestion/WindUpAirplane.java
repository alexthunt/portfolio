package classquestion;

import java.util.Random;

public class WindUpAirplane {
    
    private int weightInGrams;
    private int lengthInCM;
    private int wingSpanInCM;
    private boolean isWound;

    public WindUpAirplane(int weightInGrams, int lengthInCM, int wingSpanInCM) {
        this.weightInGrams = weightInGrams;
        this.lengthInCM = lengthInCM;
        this.wingSpanInCM = wingSpanInCM;
        isWound = false;
    }

    public void wind() {
        isWound = true;
    }
    
    public int fly(){
        int random_int = (int)Math.floor(Math.random()*(100-10+1)+10);
        isWound = false;
        return random_int;
    }
}