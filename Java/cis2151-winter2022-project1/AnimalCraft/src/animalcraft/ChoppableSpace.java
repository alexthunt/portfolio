package animalcraft;

public class ChoppableSpace extends Space implements IsChoppable {

    public ChoppableSpace() {
        super("This space is choppable.");
    }

    @Override
    public boolean IsChoppable() {
        return true;
    }
}
