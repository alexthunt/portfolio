package animalcraft;

import java.util.ArrayList;
import java.util.Random;

public class Island {

    Random rand = new Random();
    ArrayList<ArrayList<Space>> islandOfSpaces = new ArrayList<>();

    public Island() {
        for (int index = 0; index < 5; index++) {
            islandOfSpaces.add(new ArrayList<>());
        }

        for (ArrayList<Space> row : islandOfSpaces) {
            for (int index = 0; index < 5; index++) {
                int spaceIdentifier = rand.nextInt(4);
                if (spaceIdentifier == 0) {
                    row.add(new Space("This space is not diggable, buildable, or choppable."));
                }
                if (spaceIdentifier == 1) {
                    row.add(new DiggableSpace());
                }
                if (spaceIdentifier == 2) {
                    row.add(new BuildableSpace());
                }
                if (spaceIdentifier == 3) {
                    row.add(new ChoppableSpace());
                }
            }
        }
    }
    
    public boolean getSpaceHasShovel (int yCoordinateS, int xCoordinateS) {
        return ((islandOfSpaces.get(yCoordinateS).get(xCoordinateS)).HasShovel());
    }
    
    public boolean getSpaceHasHammer (int yCoordinateH, int xCoordinateH) {
        return ((islandOfSpaces.get(yCoordinateH).get(xCoordinateH)).HasHammer());
    }
    
    public boolean getSpaceHasAxe (int yCoordinateA, int xCoordinateA) {
        return ((islandOfSpaces.get(yCoordinateA).get(xCoordinateA)).HasAxe());
    }
    
    public String getSpaceDescription (int yCoordinateDes, int xCoordinateDes) {
        return ((islandOfSpaces.get(yCoordinateDes).get(xCoordinateDes)).getDescription());
    }
    
    public boolean getSpaceIsDiggable (int yCoordinateD, int xCoordinateD) {
        return ((islandOfSpaces.get(yCoordinateD).get(xCoordinateD)).IsDiggable());
    }
    
    public boolean getSpaceIsBuildable (int yCoordinateB, int XcoordinateB) {
        return ((islandOfSpaces.get(yCoordinateB).get(XcoordinateB)).IsBuildable());
    }
    
    public boolean getSpaceIsChoppable (int yCoordinateC, int XcoordinateC) {
        return ((islandOfSpaces.get(yCoordinateC).get(XcoordinateC)).IsChoppable());
    }
    
    public void setSpaceHasShovel (int yCoordinateSS, int xCoordinateSS, boolean hasTool) {
        (islandOfSpaces.get(yCoordinateSS).get(xCoordinateSS)).setHasShovel(hasTool);
    }
    
    public void setSpaceHasHammer (int yCoordinateHH, int xCoordinateHH, boolean hasTool) {
        (islandOfSpaces.get(yCoordinateHH).get(xCoordinateHH)).setHasHammer(hasTool);
    }
    
    public void setSpaceHasAxe (int yCoordinateAA, int xCoordinateAA, boolean hasTool) {
        (islandOfSpaces.get(yCoordinateAA).get(xCoordinateAA)).setHasAxe(hasTool);
    }
}
