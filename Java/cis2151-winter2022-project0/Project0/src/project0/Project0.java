package project0;

import java.io.*;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.Scanner;

public class Project0 {

    public static Scanner keyboard = new Scanner(System.in);
    public static String[][] theaterBySeatInfoStorageArray = new String[3][20];
    public static int showGuestWantsToSee = -1;
    public static int seatGuestWantsToSitIn = 0;
    public static Random random = new Random();
    public static String confirmationCode = "";
    public static String guestName = "";
    public static String nameOfTheater = "";
    public static int numberOfPossibleSeatsForCurrentTheaterInt = 0;
    public static int numberOfTheaterManagerWantsToSee = -1;

    public static void main(String[] args) {
        int theater = 0;
        int seat = 0;
        boolean keepGoing = true;
        while (keepGoing) {
            theaterBySeatInfoStorageArray[theater][seat] = "Empty";
            seat += 1;
            if (seat == 20) {
                theater += 1;
                seat = 0;
            }
            if (theater == 3) {
                keepGoing = false;
            }
        }
        while (true) {
            System.out.println("Type 1 to make a reservation and type 2 to get a manager report");
            int userIsGuestOrManager = -1;
            try {
                userIsGuestOrManager = Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println(ex);
            }

            if (userIsGuestOrManager == 1) {
                guest();
            }
            if (userIsGuestOrManager == 2) {
                manager();
            }if (userIsGuestOrManager != 1 && userIsGuestOrManager != 2) {
                System.out.println("Invalid response, try again.");
            }
        }
    }

    public static void guest() {
        System.out.println("What is your name?");
        guestName = keyboard.nextLine();
        System.out.println("What show would you like to see? (0-Harry Potter, 1-Encanto, or 2-Matrix)");
        try {
            showGuestWantsToSee = Integer.parseInt(keyboard.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
        if (showGuestWantsToSee >= 0 && showGuestWantsToSee <= 2) {
            guestSelectsSeat();
        } else {
            System.out.println("Invalid response, try again.");
        }
    }

    public static void guestSelectsSeat() {
        String numberOfSeats = "";
        String toolTipNumber = "";
        if (showGuestWantsToSee == 0) {
            nameOfTheater = "Harry Potter";
            numberOfSeats = "10";
            toolTipNumber = "9";
            numberOfPossibleSeatsForCurrentTheaterInt = 9;
        }
        if (showGuestWantsToSee == 1) {
            nameOfTheater = "Encanto";
            numberOfSeats = "20";
            toolTipNumber = "19";
            numberOfPossibleSeatsForCurrentTheaterInt = 19;
        }
        if (showGuestWantsToSee == 2) {
            nameOfTheater = "Matrix";
            numberOfSeats = "15";
            toolTipNumber = "14";
            numberOfPossibleSeatsForCurrentTheaterInt = 14;
        }
        System.out.println(nameOfTheater + " has " + numberOfSeats + " seats. What seat would you like to have? (0-" + toolTipNumber + ")");
        try {
            seatGuestWantsToSitIn = Integer.parseInt(keyboard.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
        if (seatGuestWantsToSitIn >= 0 && seatGuestWantsToSitIn <= numberOfPossibleSeatsForCurrentTheaterInt) {
            if (theaterBySeatInfoStorageArray[showGuestWantsToSee][seatGuestWantsToSitIn].equalsIgnoreCase("Empty")) {
                generateRandomNumberBetween10000and100000();
                System.out.println("Thank you for your reservation. Your confirmation code is " + confirmationCode + ", see you at the show.");
                theaterBySeatInfoStorageArray[showGuestWantsToSee][seatGuestWantsToSitIn] = (guestName + " " + confirmationCode);
                writeDataToBinaryFile();
            } else {
                System.out.println("That seat is not avaliable.");
            }
        } else {
            System.out.println("Invalid response, try again.");
        }
    }

    public static void manager() {
        System.out.println("What theater would you like to see the reservation list for? (0-Harry Potter, 1-Encanto, or 2-Matrix)");
        try {
            numberOfTheaterManagerWantsToSee = Integer.parseInt(keyboard.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
        if (numberOfTheaterManagerWantsToSee >= 0 && numberOfTheaterManagerWantsToSee <= 2) {
            readDataFromFile();
        }
    }

    public static void generateRandomNumberBetween10000and100000() {
        int randomNumber = random.nextInt(89999) + 10001;
        confirmationCode = String.valueOf(randomNumber);
    }

    public static void writeDataToBinaryFile() {
        try {
            DataOutputStream binaryWriteFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(nameOfTheater + ".bin")));

            boolean WriteNotComplete = true;
            int seatNumber = 0;
            while (WriteNotComplete) {
                String stringSeatNumber = String.valueOf(seatNumber);
                binaryWriteFile.writeUTF(stringSeatNumber + " " + (theaterBySeatInfoStorageArray[showGuestWantsToSee][seatNumber]));
                seatNumber += 1;
                if (seatNumber > numberOfPossibleSeatsForCurrentTheaterInt) {
                    WriteNotComplete = false;
                }
            }
            binaryWriteFile.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void readDataFromFile() {
        String nameOfTheaterManagerWantsToSee = "";
        if (numberOfTheaterManagerWantsToSee == 0) {
            nameOfTheaterManagerWantsToSee = "Harry Potter";
        }
        if (numberOfTheaterManagerWantsToSee == 1) {
            nameOfTheaterManagerWantsToSee = "Encanto";
        }
        if (numberOfTheaterManagerWantsToSee == 2) {
            nameOfTheaterManagerWantsToSee = "Matrix";
        }
        File binaryReadFile = new File(nameOfTheaterManagerWantsToSee + ".bin");
        if (binaryReadFile.exists()) {
            try {
                DataInputStream binaryRead = new DataInputStream(new BufferedInputStream(new FileInputStream(binaryReadFile)));
                while (binaryRead.available() > 0) {
                    System.out.println(binaryRead.readUTF());
                }
                binaryRead.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
}
