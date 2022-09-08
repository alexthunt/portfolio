package finalproject;

import java.io.Serializable;
import java.util.ArrayList;

public class ScoreCard implements Serializable {

    private int acesScore;
    private int twosScore;
    private int threesScore;
    private int foursScore;
    private int fivesScore;
    private int sixesScore;
    private int bonus;
    private int threeOfAKindScore;
    private int fourOfAKindScore;
    private int fullHouseScore;
    private int smallStraightScore;
    private int largeStraightScore;
    private int yahtzeeScore;
    private int chanceScore;
    private int totalScore;
    private boolean acesLockedIn;
    private boolean twosLockedIn;
    private boolean threesLockedIn;
    private boolean foursLockedIn;
    private boolean fivesLockedIn;
    private boolean sixesLockedIn;
    private boolean threeOfAKindLockedIn;
    private boolean fourOfAKindLockedIn;
    private boolean fullHouseLockedIn;
    private boolean smallStraightLockedIn;
    private boolean largeStraightLockedIn;
    private boolean yahtzeeLockedIn;
    private boolean chanceLockedIn;
    private boolean totalScoreLockedIn;

    public ScoreCard() {
        acesScore = 0;
        twosScore = 0;
        threesScore = 0;
        foursScore = 0;
        fivesScore = 0;
        sixesScore = 0;
        threeOfAKindScore = 0;
        fourOfAKindScore = 0;
        fullHouseScore = 0;
        smallStraightScore = 0;
        largeStraightScore = 0;
        yahtzeeScore = 0;
        chanceScore = 0;
        totalScore = 0;
        acesLockedIn = false;
        twosLockedIn = false;
        threesLockedIn = false;
        foursLockedIn = false;
        fivesLockedIn = false;
        sixesLockedIn = false;
        threeOfAKindLockedIn = false;
        fourOfAKindLockedIn = false;
        fullHouseLockedIn = false;
        smallStraightLockedIn = false;
        largeStraightLockedIn = false;
        yahtzeeLockedIn = false;
        chanceLockedIn = false;
        totalScoreLockedIn = false;
    }

    public boolean isAcesLockedIn() {
        return acesLockedIn;
    }

    public void setAcesLockedIn(boolean acesLockedIn) {
        this.acesLockedIn = acesLockedIn;
    }

    public boolean isTwosLockedIn() {
        return twosLockedIn;
    }

    public void setTwosLockedIn(boolean twosLockedIn) {
        this.twosLockedIn = twosLockedIn;
    }

    public boolean isThreesLockedIn() {
        return threesLockedIn;
    }

    public void setThreesLockedIn(boolean threesLockedIn) {
        this.threesLockedIn = threesLockedIn;
    }

    public boolean isFoursLockedIn() {
        return foursLockedIn;
    }

    public void setFoursLockedIn(boolean foursLockedIn) {
        this.foursLockedIn = foursLockedIn;
    }

    public boolean isFivesLockedIn() {
        return fivesLockedIn;
    }

    public void setFivesLockedIn(boolean fivesLockedIn) {
        this.fivesLockedIn = fivesLockedIn;
    }

    public boolean isSixesLockedIn() {
        return sixesLockedIn;
    }

    public void setSixesLockedIn(boolean sixesLockedIn) {
        this.sixesLockedIn = sixesLockedIn;
    }

    public boolean isThreeOfAKindLockedIn() {
        return threeOfAKindLockedIn;
    }

    public void setThreeOfAKindLockedIn(boolean threeOfAKindLockedIn) {
        this.threeOfAKindLockedIn = threeOfAKindLockedIn;
    }

    public boolean isFourOfAKindLockedIn() {
        return fourOfAKindLockedIn;
    }

    public void setFourOfAKindLockedIn(boolean fourOfAKindLockedIn) {
        this.fourOfAKindLockedIn = fourOfAKindLockedIn;
    }

    public boolean isFullHouseLockedIn() {
        return fullHouseLockedIn;
    }

    public void setFullHouseLockedIn(boolean fullHouselockedIn) {
        this.fullHouseLockedIn = fullHouselockedIn;
    }

    public boolean isSmallStraightLockedIn() {
        return smallStraightLockedIn;
    }

    public void setSmallStraightLockedIn(boolean smallStraightLockedIn) {
        this.smallStraightLockedIn = smallStraightLockedIn;
    }

    public boolean isLargeStraightLockedIn() {
        return largeStraightLockedIn;
    }

    public void setLargeStraightLockedIn(boolean largeStraightLockedIn) {
        this.largeStraightLockedIn = largeStraightLockedIn;
    }

    public boolean isYahtzeeLockedIn() {
        return yahtzeeLockedIn;
    }

    public void setYahtzeeLockedIn(boolean yahtzeeScoreLockedIn) {
        this.yahtzeeLockedIn = yahtzeeScoreLockedIn;
    }

    public boolean isChanceLockedIn() {
        return chanceLockedIn;
    }

    public void setChanceLockedIn(boolean chanceScoreLockedIn) {
        this.chanceLockedIn = chanceScoreLockedIn;
    }

    public boolean isTotalScoreLockedIn() {
        return totalScoreLockedIn;
    }

    public void setTotalScoreLockedIn(boolean totalScoreLockedIn) {
        this.totalScoreLockedIn = totalScoreLockedIn;
    }

    public void setAcesScore(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        if (!(acesLockedIn)) {
            int scoreTally = 0;
            if (firstDie == 1) {
                scoreTally++;
            }
            if (secondDie == 1) {
                scoreTally++;
            }
            if (thirdDie == 1) {
                scoreTally++;
            }
            if (fourthDie == 1) {
                scoreTally++;
            }
            if (fifthDie == 1) {
                scoreTally++;
            }
            acesScore = scoreTally;
        }
    }

    public void setTwosScore(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        if (!(twosLockedIn)) {
            int scoreTally = 0;
            if (firstDie == 2) {
                scoreTally += 2;
            }
            if (secondDie == 2) {
                scoreTally += 2;
            }
            if (thirdDie == 2) {
                scoreTally += 2;
            }
            if (fourthDie == 2) {
                scoreTally += 2;
            }
            if (fifthDie == 2) {
                scoreTally += 2;
            }
            twosScore = scoreTally;
        }
    }

    public void setThreesScore(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        if (!(threesLockedIn)) {
            int scoreTally = 0;
            if (firstDie == 3) {
                scoreTally += 3;
            }
            if (secondDie == 3) {
                scoreTally += 3;
            }
            if (thirdDie == 3) {
                scoreTally += 3;
            }
            if (fourthDie == 3) {
                scoreTally += 3;
            }
            if (fifthDie == 3) {
                scoreTally += 3;
            }
            threesScore = scoreTally;
        }
    }

    public void setFoursScore(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        if (!(foursLockedIn)) {
            int scoreTally = 0;
            if (firstDie == 4) {
                scoreTally += 4;
            }
            if (secondDie == 4) {
                scoreTally += 4;
            }
            if (thirdDie == 4) {
                scoreTally += 4;
            }
            if (fourthDie == 4) {
                scoreTally += 4;
            }
            if (fifthDie == 4) {
                scoreTally += 4;
            }
            foursScore = scoreTally;
        }
    }

    public void setFivesScore(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        if (!(fivesLockedIn)) {
            int scoreTally = 0;
            if (firstDie == 5) {
                scoreTally += 5;
            }
            if (secondDie == 5) {
                scoreTally += 5;
            }
            if (thirdDie == 5) {
                scoreTally += 5;
            }
            if (fourthDie == 5) {
                scoreTally += 5;
            }
            if (fifthDie == 5) {
                scoreTally += 5;
            }
            fivesScore = scoreTally;
        }
    }

    public void setSixesScore(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        if (!(sixesLockedIn)) {
            int scoreTally = 0;
            if (firstDie == 6) {
                scoreTally += 6;
            }
            if (secondDie == 6) {
                scoreTally += 6;
            }
            if (thirdDie == 6) {
                scoreTally += 6;
            }
            if (fourthDie == 6) {
                scoreTally += 6;
            }
            if (fifthDie == 6) {
                scoreTally += 6;
            }
            sixesScore = scoreTally;
        }
    }

    public void setBonus() {
        bonus =0;
        if (acesScore + twosScore + threesScore + foursScore + fivesScore + sixesScore >= 63) {
            bonus = 35;
        }

    }

    public void setThreeOfAKindScore(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        if (!(threeOfAKindLockedIn)) {
            threeOfAKindScore = 0;
            ArrayList<Integer> diceValues = new ArrayList<>();
            diceValues.add(firstDie);
            diceValues.add(secondDie);
            diceValues.add(thirdDie);
            diceValues.add(fourthDie);
            diceValues.add(fifthDie);
            int numberOfOnes = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 1) {
                    numberOfOnes++;
                }
                if (numberOfOnes >= 3) {
                    threeOfAKindScore = 3;
                }
            }
            int numberOfTwos = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 2) {
                    numberOfTwos++;
                }
                if (numberOfTwos >= 3) {
                    threeOfAKindScore = 6;
                }
            }
            int numberOfThrees = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 3) {
                    numberOfThrees++;
                }
                if (numberOfThrees >= 3) {
                    threeOfAKindScore = 9;
                }
            }
            int numberOfFours = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 4) {
                    numberOfFours++;
                }
                if (numberOfFours >= 3) {
                    threeOfAKindScore = 12;
                }
            }
            int numberOfFives = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 5) {
                    numberOfFives++;
                }
                if (numberOfFives >= 3) {
                    threeOfAKindScore = 15;
                }
            }
            int numberOfSixes = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 6) {
                    numberOfSixes++;
                }
                if (numberOfSixes >= 3) {
                    threeOfAKindScore = 18;
                }
            }
        }
    }

    public void setFourOfAKindScore(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        if (!(fourOfAKindLockedIn)) {
            fourOfAKindScore = 0;
            ArrayList<Integer> diceValues = new ArrayList<>();
            diceValues.add(firstDie);
            diceValues.add(secondDie);
            diceValues.add(thirdDie);
            diceValues.add(fourthDie);
            diceValues.add(fifthDie);
            int numberOfOnes = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 1) {
                    numberOfOnes++;
                }
                if (numberOfOnes >= 4) {
                    fourOfAKindScore = 4;
                }
            }
            int numberOfTwos = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 2) {
                    numberOfTwos++;
                }
                if (numberOfTwos >= 4) {
                    fourOfAKindScore = 8;
                }
            }
            int numberOfThrees = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 3) {
                    numberOfThrees++;
                }
                if (numberOfThrees >= 4) {
                    fourOfAKindScore = 12;
                }
            }
            int numberOfFours = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 4) {
                    numberOfFours++;
                }
                if (numberOfFours >= 4) {
                    fourOfAKindScore = 16;
                }
            }
            int numberOfFives = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 5) {
                    numberOfFives++;
                }
                if (numberOfFives >= 4) {
                    fourOfAKindScore = 20;
                }
            }
            int numberOfSixes = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 6) {
                    numberOfSixes++;
                }
                if (numberOfSixes >= 4) {
                    fourOfAKindScore = 24;
                }
            }
        }
    }

    public void setFullHouseScore(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        if (!(fullHouseLockedIn)) {
            fullHouseScore = 0;
            ArrayList<Integer> diceValues = new ArrayList<>();
            diceValues.add(firstDie);
            diceValues.add(secondDie);
            diceValues.add(thirdDie);
            diceValues.add(fourthDie);
            diceValues.add(fifthDie);
            boolean triplePresent = false;
            int numberOfOnes = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 1) {
                    numberOfOnes++;
                }
            }
            if (numberOfOnes == 3) {
                triplePresent = true;
            }
            int numberOfTwos = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 2) {
                    numberOfTwos++;
                }
            }
            if (numberOfTwos == 3) {
                triplePresent = true;
            }
            int numberOfThrees = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 3) {
                    numberOfThrees++;
                }
            }
            if (numberOfThrees == 3) {
                triplePresent = true;
            }
            int numberOfFours = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 4) {
                    numberOfFours++;
                }
            }
            if (numberOfFours == 3) {
                triplePresent = true;
            }
            int numberOfFives = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 5) {
                    numberOfFives++;
                }
            }
            if (numberOfFives == 3) {
                triplePresent = true;
            }
            int numberOfSixes = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 6) {
                    numberOfSixes++;
                }
            }
            if (numberOfSixes == 3) {
                triplePresent = true;
            }
            boolean doublePresent = false;
            int numberOfOnesAgain = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 1) {
                    numberOfOnesAgain++;
                }
            }
            if (numberOfOnesAgain == 2) {
                doublePresent = true;
            }
            int numberOfTwosAgain = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 2) {
                    numberOfTwosAgain++;
                }
            }
            if (numberOfTwosAgain == 2) {
                doublePresent = true;
            }
            int numberOfThreesAgain = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 3) {
                    numberOfThreesAgain++;
                }
            }
            if (numberOfThreesAgain == 2) {
                doublePresent = true;
            }
            int numberOfFoursAgain = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 4) {
                    numberOfFoursAgain++;
                }
            }
            if (numberOfFoursAgain == 2) {
                doublePresent = true;
            }
            int numberOfFivesAgain = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 5) {
                    numberOfFivesAgain++;
                }
            }
            if (numberOfFivesAgain == 2) {
                doublePresent = true;
            }
            int numberOfSixesAgain = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 6) {
                    numberOfSixesAgain++;
                }
            }
            if (numberOfSixesAgain == 2) {
                doublePresent = true;
            }

            if (triplePresent && doublePresent) {
                fullHouseScore = 25;
            }
        }
    }

    public void setSmallStraightScore(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        if (!(smallStraightLockedIn)) {
            smallStraightScore = 0;
            ArrayList<Integer> diceValues = new ArrayList<>();
            diceValues.add(firstDie);
            diceValues.add(secondDie);
            diceValues.add(thirdDie);
            diceValues.add(fourthDie);
            diceValues.add(fifthDie);
            boolean onePresent = false;
            boolean twoPresent = false;
            boolean threePresent = false;
            boolean fourPresent = false;
            boolean fivePresent = false;
            boolean sixPresent = false;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 1) {
                    onePresent = true;
                }
            }
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 2) {
                    twoPresent = true;
                }
            }
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 3) {
                    threePresent = true;
                }
            }
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 4) {
                    fourPresent = true;
                }
            }
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 5) {
                    fivePresent = true;
                }
            }
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 6) {
                    sixPresent = true;
                }
            }
            if (onePresent && twoPresent && threePresent && fourPresent) {
                smallStraightScore = 30;
            }
            if (fivePresent && twoPresent && threePresent && fourPresent) {
                smallStraightScore = 30;
            }
            if (fivePresent && sixPresent && threePresent && fourPresent) {
                smallStraightScore = 30;
            }
        }
    }

    public void setLargeStraightScore(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        if (!(largeStraightLockedIn)) {
            largeStraightScore = 0;
            ArrayList<Integer> diceValues = new ArrayList<>();
            diceValues.add(firstDie);
            diceValues.add(secondDie);
            diceValues.add(thirdDie);
            diceValues.add(fourthDie);
            diceValues.add(fifthDie);
            boolean onePresent = false;
            boolean twoPresent = false;
            boolean threePresent = false;
            boolean fourPresent = false;
            boolean fivePresent = false;
            boolean sixPresent = false;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 1) {
                    onePresent = true;
                }
            }
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 2) {
                    twoPresent = true;
                }
            }
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 3) {
                    threePresent = true;
                }
            }
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 4) {
                    fourPresent = true;
                }
            }
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 5) {
                    fivePresent = true;
                }
            }
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 6) {
                    sixPresent = true;
                }
            }
            if (onePresent && twoPresent && threePresent && fourPresent && fivePresent) {
                largeStraightScore = 40;
            }
            if (sixPresent && twoPresent && threePresent && fourPresent && fivePresent) {
                largeStraightScore = 40;
            }
        }
    }

    public void setYahtzeeScore(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        if (!(yahtzeeLockedIn)) {
            yahtzeeScore = 0;
            ArrayList<Integer> diceValues = new ArrayList<>();
            diceValues.add(firstDie);
            diceValues.add(secondDie);
            diceValues.add(thirdDie);
            diceValues.add(fourthDie);
            diceValues.add(fifthDie);
            int numberOfOnes = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 1) {
                    numberOfOnes++;
                }
                if (numberOfOnes == 5) {
                    yahtzeeScore = 50;
                }
            }
            int numberOfTwos = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 2) {
                    numberOfTwos++;
                }
                if (numberOfTwos == 5) {
                    yahtzeeScore = 50;
                }
            }
            int numberOfThrees = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 3) {
                    numberOfThrees++;
                }
                if (numberOfThrees == 5) {
                    yahtzeeScore = 50;
                }
            }
            int numberOfFours = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 4) {
                    numberOfFours++;
                }
                if (numberOfFours == 5) {
                    yahtzeeScore = 50;
                }
            }
            int numberOfFives = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 5) {
                    numberOfFives++;
                }
                if (numberOfFives == 5) {
                    yahtzeeScore = 50;
                }
            }
            int numberOfSixes = 0;
            for (int i = 0; i < 5; i++) {
                if (diceValues.get(i) == 6) {
                    numberOfSixes++;
                }
                if (numberOfSixes == 5) {
                    yahtzeeScore = 50;
                }
            }
        }
    }

    public void setChanceScore(int firstDie, int secondDie, int thirdDie, int fourthDie, int fifthDie) {
        if (!(chanceLockedIn)) {
            chanceScore = firstDie + secondDie + thirdDie + fourthDie + fifthDie;
        }
    }

    public void setTotalScore() {
        totalScore = acesScore + twosScore + threesScore + foursScore + fivesScore + sixesScore + bonus + threeOfAKindScore + fourOfAKindScore + fullHouseScore + smallStraightScore + largeStraightScore + yahtzeeScore + chanceScore;
    }
    
    public int getBonus() {
        return bonus;
    }

    public int getAcesScore() {
        return acesScore;
    }

    public int getTwosScore() {
        return twosScore;
    }

    public int getThreesScore() {
        return threesScore;
    }

    public int getFoursScore() {
        return foursScore;
    }

    public int getFivesScore() {
        return fivesScore;
    }

    public int getSixesScore() {
        return sixesScore;
    }

    public int getThreeOfAKindScore() {
        return threeOfAKindScore;
    }

    public int getFourOfAKindScore() {
        return fourOfAKindScore;
    }

    public int getFullHouseScore() {
        return fullHouseScore;
    }

    public int getSmallStraightScore() {
        return smallStraightScore;
    }

    public int getLargeStraightScore() {
        return largeStraightScore;
    }

    public int getYahtzeeScore() {
        return yahtzeeScore;
    }

    public int getChanceScore() {
        return chanceScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

}
