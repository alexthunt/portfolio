package datastructuresproject4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//Alexander Hunt
//CIS 2353
//Summer 2022
//Prof. John P. Baugh

public class DataStructuresProject4 {

    public static void main(String[] args) {
        TriageSimulator triage = new TriageSimulator();
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(new File("patients.txt")));
            String line = fileReader.readLine();
            while (line != null) {
                triage.add(line);
                line = fileReader.readLine();
            }
            fileReader.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        while (!triage.isEmpty()) {
            System.out.println(triage.remove());
        }
    }
}
