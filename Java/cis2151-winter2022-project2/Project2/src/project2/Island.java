package project2;

import java.io.Serializable;
import java.util.ArrayList;

public class Island implements Serializable {

    private ArrayList<ArrayList<Space>> spaces;

    public Island() {
        spaces = new ArrayList<>();
        spaces.add(new ArrayList<>());
        spaces.add(new ArrayList<>());
        spaces.add(new ArrayList<>());
        spaces.add(new ArrayList<>());
        for (ArrayList<Space> row : spaces) {
            row.add(new Space());
            row.add(new Space());
            row.add(new Space());
            row.add(new Space());
        }
    }

    public ArrayList<ArrayList<Space>> getSpaces() {
        return spaces;
    }

    public void setSpaces(ArrayList<ArrayList<Space>> spaces) {
        this.spaces = spaces;
    }

}
