package proj2;

public class ScoreList {

    private ScoreNode firstNode;

    public ScoreList() {
        firstNode = null;
    }

    public ScoreList(ScoreList otherList) {
        firstNode = null;
        int index = 0;
        ScoreNode thisNode = firstNode;
        while (true) {
            String name = otherList.getName(index);
            int score = otherList.getScore(index);
            if (name == null || score == -1) {
                break;
            }
            ScoreNode newNode = new ScoreNode(name, score);
            if (firstNode == null) {
                firstNode = newNode;
                thisNode = firstNode;
            } else if (thisNode != null) {
                thisNode.setNext(newNode);
                thisNode = thisNode.getNext();
            }
            index++;
        }
    }

    private String getName(int index) {
        ScoreNode returnNode = firstNode;
        for (int i = 0; i < index; i++) {
            returnNode = returnNode.getNext();
        }
        if (returnNode == null) {
            return null;
        }
        String name = returnNode.getName();
        return name;
    }

    private int getScore(int index) {
        ScoreNode returnNode = firstNode;
        for (int i = 0; i < index; i++) {
            returnNode = returnNode.getNext();
        }
        if (returnNode == null) {
            return -1;
        }
        int score = returnNode.getScore();
        return score;
    }

    public void add(String name, int score) {
        remove(name);
        ScoreNode newNode = new ScoreNode(name, score);
        if (firstNode == null) {
            firstNode = newNode;
        }
        if (firstNode.getScore() < newNode.getScore()) {
            ScoreNode moveNode = firstNode;
            firstNode = newNode;
            newNode.setNext(moveNode);
        }
        ScoreNode beforeNode = firstNode;
        ScoreNode afterNode = firstNode.getNext();
        while (afterNode != null && newNode.getScore() < afterNode.getScore()) {
            beforeNode = afterNode;
            afterNode = afterNode.getNext();
        }
        beforeNode.setNext(newNode);
        newNode.setNext(afterNode);
    }

    public void print() {
        ScoreNode walker = firstNode;
        while (walker != null) {
            System.out.println(walker.getName() + " " + walker.getScore());
            walker = walker.getNext();
        }
    }

    public void remove(String name) {
        boolean executed = false;
        ScoreNode beforeNode = firstNode;
        if (beforeNode != null) {
            ScoreNode existingNode = firstNode.getNext();
            if (beforeNode.getName().equals(name)) {
                firstNode = existingNode;
            }
            while (existingNode != null && !executed) {
                if (existingNode.getName().equals(name)) {
                    beforeNode.setNext(existingNode.getNext());
                    executed = true;
                }
                if (!executed) {
                    beforeNode = existingNode;
                    existingNode = existingNode.getNext();
                }
            }
        }
    }

}
