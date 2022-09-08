
package project2;

import java.util.Scanner;

public class Project2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int exhaustion = 3;
        String playerInput;
        int toggleGame = 1;
        int numberOfTurns = 0;
        while (toggleGame == 1){
            if (exhaustion == 3){
                System.out.println("\n^^^You feel full of energy!^^^");
            }
            else if (exhaustion == 2){
                System.out.println("\n---You feel weary.---");
            }
            else if (exhaustion == 1){
                System.out.println("\n...You feel exhausted...");
            }
            else if (exhaustion == 0){
                System.out.println("\n____You can barely stay awake you're so tired____");
            }
            System.out.println("\n"
                + "The forest burns down around you! Flaming treebranches crash down everywhere!! \n\n"
                + "A crazed Orc charges at you with a huge battleaxe. What do you do?\n\n"
                + "[You are playing a game. Type \"Help\" at any time to see what you can do.]\n"
                + "-----------------------------------------------------------------------------------------------------------------------------------------------------");   
            playerInput = keyboard.nextLine();
            if (playerInput.equalsIgnoreCase("Help")){
            System.out.println("Valid inputs are... \n"
                    + "North\n"
                    + "South\n"
                    + "East\n"
                    + "West\n"
                    + "Evade\n"
                    + "Fight\n"
                    + "Reason\n"
                    + "Climb\n"
                    + "Sleep");
            }
            else if (playerInput.equalsIgnoreCase("North") && exhaustion >= 1){
                exhaustion--;
                numberOfTurns++;
                System.out.println("*************************************************************************************************************************************");
                System.out.println("You decide to travel North, but realize that is the direction the Orc is in. That's not a good idea. You decide to reconsider.");
                System.out.println("*************************************************************************************************************************************");
            }
            else if (playerInput.equalsIgnoreCase("South") && exhaustion >= 1){
                exhaustion--;
                numberOfTurns++;
                System.out.println("*************************************************************************************************************************************");
                System.out.println("You decide to travel South, the Orc runs after you for miles. Eventually you give up. This isn't getting you anywhere. "
                        + "You're still in a burning forest and the Orc is still chasing after you. There must be a better way.");
                System.out.println("*************************************************************************************************************************************");
            }
            else if (playerInput.equalsIgnoreCase("East") && exhaustion >= 1){
                exhaustion--;
                numberOfTurns++;
                System.out.println("*************************************************************************************************************************************");
                System.out.println("You decide to travel East, The Orc gains on you. This doesn't look good.");
                System.out.println("*************************************************************************************************************************************");
            }
            else if (playerInput.equalsIgnoreCase("West") && exhaustion >= 1){
                exhaustion--;
                numberOfTurns++;
                System.out.println("*************************************************************************************************************************************");
                System.out.println("You decide to travel West, The Orc stumbles on a flaming treebranch. You've made some space!");
                System.out.println("*************************************************************************************************************************************");
            }
            else if (playerInput.equalsIgnoreCase("Evade")){
                System.out.println("*************************************************************************************************************************************");
                System.out.println("You sidestep the Orc's attack just in time. Nice! The Orc turns back towards you. Oh no, he's about to swing again.");
                System.out.println("*************************************************************************************************************************************");
            }
            else if (playerInput.equalsIgnoreCase("Fight")){
                System.out.println("*************************************************************************************************************************************");
                System.out.println("You raise your sword and shield for combat. The Orc bashes you with his axe and you stumble and fall to the ground like a wet noodle."
                        + "You barely have enough time to get back on your feet before his next blow comes.");
                System.out.println("*************************************************************************************************************************************");
            }
            else if (playerInput.equalsIgnoreCase("Reason")){
                System.out.println("*************************************************************************************************************************************");
                System.out.println("\"Wait!\" You yell at the Orc. He stops. \"Let's talk about this, no need to get violent, right?\" He stands there crosseyes and drooling. "
                        + "Then begins to advance again with his battleaxe held high. You've got to think of something else.");
                System.out.println("*************************************************************************************************************************************");
            }
            else if (playerInput.equalsIgnoreCase("Climb")){
                System.out.println("*************************************************************************************************************************************");
                System.out.println("You decide to climb one of the burning trees to escape to safety from the Orc. You reach up and grab a flaming treebranch. \"OOWW!!\" "
                        + "You keel over in pain as your hand is burning. That was a dumb idea.");
                System.out.println("*************************************************************************************************************************************");
            }
            else if (playerInput.equalsIgnoreCase("Secret Escape Word")){
                System.out.println("*************************************************************************************************************************************");
                System.out.println("Congratulations. You successfully escape the burning forest and the raging Orc after " + numberOfTurns + " turns.");
                System.out.println("*************************************************************************************************************************************");
                toggleGame = 0;
            }
            else if (playerInput.equalsIgnoreCase("Sleep")){
                System.out.println("*************************************************************************************************************************************");
                System.out.println("You sleep in the middle of a burning forest while an orc is about to split you in half. Surprisingly it works.");
                System.out.println("*************************************************************************************************************************************");
                exhaustion = 3;
            }
            else if (toggleGame == 1){
                System.out.println("*************************************************************************************************************************************");
                System.out.println("You can't do that.");
                System.out.println("*************************************************************************************************************************************");
        }
        }
    }
}