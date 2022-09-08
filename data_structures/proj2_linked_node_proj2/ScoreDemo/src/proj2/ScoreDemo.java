package proj2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScoreDemo {

    public static void main(String[] args) {
        ScoreList oldList = new ScoreList();
        oldList.add("Bill", 10);
        oldList.add("Jason", 11);
        oldList.add("Blake", 50);
        oldList.add("Jasmine", 2);
        oldList.add("Josh", 28);
        oldList.add("Eric", 90);
        
        ScoreList newList = new ScoreList(oldList);
        newList.add("Alex", 20);
        System.out.println("New List--------------------");
        newList.print();
        System.out.println("Old List--------------------");
        oldList.print();

        ScoreList list = new ScoreList();
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(new File("scores.txt")));
            while (true) {
                String string = fileReader.readLine();
                if (string == null) {
                    break;
                }
                String[] words = string.split(" ");
                list.add(words[0], Integer.parseInt(words[1]));
            }
            fileReader.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        System.out.println("\n");
        list.print();
        Scanner keyboard = new Scanner(System.in);
        boolean programActive = true;
        while (programActive) {
            boolean scanSucessful = false;
            int input = 0;
            while (!scanSucessful) {
                input = 0;
                System.out.println("Would you like to add (1), remove(2), or quit the program (3).");
                try {
                    input = Integer.parseInt(keyboard.nextLine());
                    if (input == 1 || input == 2 || input == 3) {
                        scanSucessful = true;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println(ex);
                }
            }
            if (input == 1) {
                System.out.println("Write the name followed by the score.");
                String string = keyboard.nextLine();
                String[] words = string.split(" ");
                list.add(words[0], Integer.parseInt(words[1]));
            } else if (input == 2) {
                System.out.println("What is the name of the person you want to remove?");
                String name = keyboard.nextLine();
                list.remove(name);
            } else if (input == 3) {
                System.out.println("Thanks for using the program! Goodbye!");
                break;
            }
            System.out.println("The scores are...");
            list.print();
        }
    }

}
