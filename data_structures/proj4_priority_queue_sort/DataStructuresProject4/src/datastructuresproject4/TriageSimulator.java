package datastructuresproject4;

import java.util.LinkedList;
import java.util.Queue;
//Alexander Hunt
//CIS 2353
//Summer 2022
//Prof. John P. Baugh

public class TriageSimulator {

    Queue<String> critial = new LinkedList<>();
    Queue<String> important = new LinkedList<>();
    Queue<String> normal = new LinkedList<>();

    public void add(String lineFromFile) {
        String words[] = lineFromFile.split(" ");
        String firstName = words[0];
        String lastName = words[1];
        String name = firstName + " " + lastName;
        String code = words[2];
        if (code.equalsIgnoreCase("AL") || code.equalsIgnoreCase("HA") || code.equalsIgnoreCase("ST")) {
            critial.add(name);
        } else if (code.equalsIgnoreCase("BL") || code.equalsIgnoreCase("SF") || code.equalsIgnoreCase("IW") || code.equalsIgnoreCase("KS") || code.equalsIgnoreCase("OT")) {
            important.add(name);
        } else if (code.equalsIgnoreCase("HN")) {
            normal.add(name);
        }
    }

    public String remove() {
        if (!critial.isEmpty()) {
            return critial.poll();
        } else if (!important.isEmpty()) {
            return important.poll();
        } else if (!normal.isEmpty()) {
            return normal.poll();
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return critial.isEmpty() && important.isEmpty() && normal.isEmpty();
    }
}
