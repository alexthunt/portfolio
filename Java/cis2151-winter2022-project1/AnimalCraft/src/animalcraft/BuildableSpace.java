package animalcraft;

public class BuildableSpace extends Space implements IsBuildable {

    public BuildableSpace() {
        super("This space is buildable.");
    }

    @Override
    public boolean IsBuildable() {
        return true;
    }
}
