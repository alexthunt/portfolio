package lab2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {

        try {
            PrintWriter outputFile = new PrintWriter(
                    new BufferedWriter(
                            //overwrite the existing file if it exists
                            //if it doesn't exist it creates a new file
                            new FileWriter("numbers.txt")));

            outputFile.println(420.69);
            outputFile.println(137);
            outputFile.println(5);
            outputFile.println(111);
            outputFile.println(666);

            outputFile.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }

        File inputFile = new File("numbers.txt");

        if (inputFile.exists()) {

            try {
                BufferedReader fileReader = new BufferedReader(
                        new FileReader(
                                inputFile));

                double sum = 0;

                String line = fileReader.readLine();
                while (line != null) {
                    sum += Double.parseDouble(line);
                    line = fileReader.readLine();
                }

                fileReader.close();

                System.out.println("The sum of the values in your file is: " + sum);

            } catch (IOException ex) {
                System.out.println(ex);
            }
        } else {
            System.out.println("Can't find that file");
        }

        try {
            //binary type files
            DataOutputStream binaryOutputFile = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("numbers.bin")));

            binaryOutputFile.writeDouble(420.69);
            binaryOutputFile.writeDouble(137);
            binaryOutputFile.writeDouble(5);
            binaryOutputFile.writeDouble(111);
            binaryOutputFile.writeDouble(666);

            binaryOutputFile.close();

        } catch (IOException ex) {
            System.out.println(ex);
        }

        File binaryInputFlie = new File("numbers.bin");
        if (binaryInputFlie.exists()) {
            try {

                DataInputStream binaryInput = new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream(binaryInputFlie)));

                double sum = 0;

                //available tells you how many bytes are left to read
                while (binaryInput.available() > 0) {
                    sum += binaryInput.readDouble();
                }

                binaryInput.close();

                System.out.println("The sum of the values in the binary file are: " + sum);

            } catch (IOException ex) {
                System.out.println(ex);

            }
        }

        Random random = new Random();

        int numberOfNumbers = random.nextInt(100) + 1;

        try {
            DataOutputStream binaryOutputFile = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("random.bin")));

            binaryOutputFile.writeInt(numberOfNumbers);

            for (int value = 0; value < numberOfNumbers; value++) {
                binaryOutputFile.writeInt(random.nextInt(1000) + 1);
            }

            binaryOutputFile.writeUTF("That's all folks!");

            binaryOutputFile.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }

        binaryInputFlie = new File("random.bin");

        if (binaryInputFlie.exists()) {
            try {

                DataInputStream binaryInput = new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream(binaryInputFlie)));

                //no loop, the file tells me how many values I should read
                int numberOfNumbersToRead = binaryInput.readInt();

                System.out.println("There are " + numberOfNumbersToRead + " values to read in this file.");

                for (int value = 0; value < numberOfNumbersToRead; value++) {
                    int valueInFile = binaryInput.readInt();
                    System.out.println(valueInFile);
                }

                String endingMessage = binaryInput.readUTF();
                System.out.println(endingMessage);

                binaryInput.close();

            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        //LAB2---------------------------------------------------------------------------------------------------------------------------------
        System.out.println("Let's create a shopping list. Write the name of an item and the quantity of that time you want to purchase.");

        Scanner keyboard = new Scanner(System.in);
        Boolean userWantsToKeepGoing = true;
        while (userWantsToKeepGoing) {
            System.out.println("What is the name of the item you want to purchase?");
            String nameOfItem = keyboard.nextLine();
            System.out.println("What is the number of that item you want to purchase?");
            int numberOfItem = Integer.parseInt(keyboard.nextLine());

            //save the name and number into a binary file without overwriting the file
            try {
                DataOutputStream binaryOutputFile = new DataOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream("ShoppingList.bin")));
                binaryOutputFile.writeUTF(nameOfItem);
                binaryOutputFile.writeInt(numberOfItem);
                binaryOutputFile.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
            System.out.println("Do you have more items to write down? (y/n)");
            String userSaysYorNToKeepGoing = keyboard.nextLine();
            if (userSaysYorNToKeepGoing.equalsIgnoreCase("n")) {
                userWantsToKeepGoing = false;
            }

        }
        File binaryInputFile = new File("ShoppingList.bin");

        if (binaryInputFile.exists()) {
            try {
                    DataInputStream binaryInput = new DataInputStream(
                            new BufferedInputStream(
                                    new FileInputStream(binaryInputFlie)));
                               
                    while ( binaryInput.available() > 0) {
                        String readItem = binaryInput.readUTF();
                        int readItemQuantity = binaryInput.readInt();
                        System.out.print("Item: " + readItem);
                        System.out.println("Quantity: " + readItemQuantity);
                    }
                    
                binaryInput.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
}
