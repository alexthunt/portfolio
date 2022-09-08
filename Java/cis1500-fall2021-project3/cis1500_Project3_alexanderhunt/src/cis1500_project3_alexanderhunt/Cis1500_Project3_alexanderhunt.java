package cis1500_project3_alexanderhunt;

import java.util.Scanner;

public class Cis1500_Project3_alexanderhunt {

    //Variables
    public static String whatToDo;
    public static int changeInAltitude;
    public static boolean userIsAlive = true;
    //Class Instances
    public static Scanner keyboard = new Scanner(System.in);
    public static Plane usersPlane = new Plane(0, true);

    public static void main(String[] args) {
        System.out.println("You sit in the cockpit of a plane. Type \"help\" at any time to see the help menu.");
        while (userIsAlive) {
            askTheUserWhatToDo();
            if (whatToDo.equalsIgnoreCase("Fly")) {
                userFlies();
            } else if (whatToDo.equalsIgnoreCase("Landing Gear")) {
                userTogglesLandingGear();
            } else if (whatToDo.equalsIgnoreCase("Details")) {
                userAsksForDetails();
            } else if (whatToDo.equalsIgnoreCase("Help")) {
                userAsksForHelp();
            } else if (whatToDo.equalsIgnoreCase("Jump")) {
                userJumps();
            } else {
                System.out.println("That's not a valid Input.");
            }
        }
    }

    public static void userJumps() {
        if (usersPlane.getCurrentAltitude() > 1) {
            System.out.println("You jump out of a flying plane! Your Crazy! You fall to your death.\n\n"
                    + "You're dead.\n"
                    + "GAME OVER");
            userIsAlive = false;
        } else {
            System.out.println("You jump out of your plane and have a picnic. Yum. You jump back in your plane.");
        }
    }

    public static void userAsksForHelp() {
        System.out.println("You can say, \"Landing Gear,\" to deploy or stow your landing gear. This can only be done at 100 meters altitude.\n"
                + "You can say, \"Details,\" to see the status of the plane you are flyig.\n"
                + "You can say, \"Fly,\" to change your altitude.\n"
                + "You can say, \"Jump,\" to get out of your plane and havea picnic.");
    }

    public static void askTheUserWhatToDo() {
        System.out.println("You are at " + usersPlane.getCurrentAltitude() + " meters altitude.");
        System.out.println("What do you want to do?");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        whatToDo = keyboard.nextLine();
    }

    public static void userFlies() {
        System.out.println("Enter the change in altitude you desire. Use positive numbers for accending and negative numbers for decsending.");
        boolean errorCatchBoolean = true;
        while (errorCatchBoolean) {
            try {
                changeInAltitude = Integer.parseInt(keyboard.nextLine());
                errorCatchBoolean = false;
            } catch (NumberFormatException errorNumberFormatException) {
                System.out.println("Invalid Input.");
            }
        }
        if ((usersPlane.setCurrentAltitude(changeInAltitude)) == false) {
            System.out.println("You can't do that.(The landing gear is not in the correct position, or you are attempting an altitude beyond the limits of the plane.)");
        }
    }

    public static void userTogglesLandingGear() {
        if ((usersPlane.setLandingGear()) == true) {
            System.out.print("Your landing gear is now ");
            if (usersPlane.isLandingGear() == true) {
                System.out.println("deployed.");
            } else if (usersPlane.isLandingGear() == false) {
                System.out.println("stowed.");
            }
        } else if ((usersPlane.setLandingGear()) == false) {
            System.out.println("You can only toggle the landing gear while at 100 meters altitude.");
        }
    }

    public static void userAsksForDetails() {
        System.out.print("You are flying a " + usersPlane.getMake() + " " + usersPlane.getModel() + " with serial number " + usersPlane.getNumber() + ". \n"
                + "It has a max altitude of " + usersPlane.getMaxAltitude() + " meters. It is currently at " + usersPlane.getCurrentAltitude() + " meters. The landing gear is ");
        if (usersPlane.isLandingGear() == true) {
            System.out.println("deployed.");
        } else if (usersPlane.isLandingGear() == false) {
            System.out.println("stowed.");
        }
    }

}
