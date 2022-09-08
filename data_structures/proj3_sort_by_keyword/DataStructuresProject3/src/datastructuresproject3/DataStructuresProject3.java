package datastructuresproject3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
//Project 3
//CIS-2352
//Summer 2022
//Alexander Hunt
public class DataStructuresProject3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try {
            //open file
            PrintWriter outputFile = new PrintWriter(new BufferedWriter(new FileWriter("image_info.txt")));

            //write file
            outputFile.println("me_and_sparky.png animals people");
            outputFile.println("house.jpg buildings");
            outputFile.println("camping.png landscapes people flowers");
            outputFile.println("farm.png landscapes buildings animals");
            outputFile.println("classroom.jpg people");

            //close file
            outputFile.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }

        ArrayList<Image> images = new ArrayList<>();
        try {
            //open file
            BufferedReader fileReader = new BufferedReader(new FileReader(new File("image_info.txt")));

            //read file, store information
            String line = fileReader.readLine();
            while (line != null) {
                String words[] = line.split(" ");
                boolean animals = false;
                boolean flowers = false;
                boolean people = false;
                boolean buildings = false;
                boolean landscapes = false;
                for (String word : words) {
                    if (word.equalsIgnoreCase("animals")) {
                        animals = true;
                        break;
                    }
                }
                for (String word : words) {
                    if (word.equalsIgnoreCase("flowers")) {
                        flowers = true;
                        break;
                    }
                }
                for (String word : words) {
                    if (word.equalsIgnoreCase("people")) {
                        people = true;
                        break;
                    }
                }
                for (String word : words) {
                    if (word.equalsIgnoreCase("buildings")) {
                        buildings = true;
                        break;
                    }
                }
                for (String word : words) {
                    if (word.equalsIgnoreCase("landscapes")) {
                        landscapes = true;
                        break;
                    }
                }
                Image image = new Image(words[0], animals, flowers, people, buildings, landscapes);
                images.add(image);
                line = fileReader.readLine();
            }

            //close file
            fileReader.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }

        //program start
        while (true) {
            System.out.println("What would you like to search for?");
            String input = keyboard.nextLine();
            input = input.toLowerCase();
            System.out.println("");
            String words[] = input.split(" ");
            boolean animals = false;
            boolean flowers = false;
            boolean people = false;
            boolean buildings = false;
            boolean landscapes = false;
            boolean and = false;
            boolean or = false;
            for (String word : words) {
                if (word.equalsIgnoreCase("animals")) {
                    animals = true;
                    break;
                }
            }
            for (String word : words) {
                if (word.equalsIgnoreCase("flowers")) {
                    flowers = true;
                    break;
                }
            }
            for (String word : words) {
                if (word.equalsIgnoreCase("people")) {
                    people = true;
                    break;
                }
            }
            for (String word : words) {
                if (word.equalsIgnoreCase("buildings")) {
                    buildings = true;
                    break;
                }
            }
            for (String word : words) {
                if (word.equalsIgnoreCase("landscapes")) {
                    landscapes = true;
                    break;
                }
            }
            for (String word : words) {
                if (word.equalsIgnoreCase("and")) {
                    and = true;
                    break;
                }
            }
            for (String word : words) {
                if (word.equalsIgnoreCase("or")) {
                    or = true;
                    break;
                }
            }
            boolean aResultWasFound = false;
            for (Image image : images) {
                if (image.isWithinSearch(animals, flowers, people, buildings, landscapes, and, or)) {
                    System.out.println(image.getName());
                    aResultWasFound = true;
                }
            }
            if (!aResultWasFound) {
                System.out.println("Your search returned no results.");
            }
            System.out.println("");
        }
    }

}
