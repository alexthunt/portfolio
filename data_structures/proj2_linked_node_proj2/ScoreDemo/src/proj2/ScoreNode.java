package proj2;

public class ScoreNode {

    private String name;
    private int score;
    private ScoreNode next;

    public ScoreNode(String name, int score) {
        this.name = name;
        this.score = score;
        next = null;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScoreNode getNext() {
        return next;
    }

    public void setNext(ScoreNode next) {
        this.next = next;
    }

}
