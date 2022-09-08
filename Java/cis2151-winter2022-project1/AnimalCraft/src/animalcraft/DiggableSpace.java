package animalcraft;

public class DiggableSpace extends Space implements IsDiggable {

    public DiggableSpace() {
        super("This space is diggable.");
    }

    @Override
    public boolean IsDiggable() {
        return true;
    }
}
