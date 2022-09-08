package loopquestion;

import java.util.Scanner;

public class Loopquestion {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean keepGoing = true;
        String yesOrNo = "No";
        String game;
        while (keepGoing){
            System.out.println("Enter the name of a game your like.");
            game = keyboard.nextLine();
            System.out.println("Are you done entering games you like? Type Yes or No.");
            yesOrNo = keyboard.nextLine();
            if (yesOrNo.equalsIgnoreCase("Yes")) {
                keepGoing = false;
            }
        }
    }
    
}