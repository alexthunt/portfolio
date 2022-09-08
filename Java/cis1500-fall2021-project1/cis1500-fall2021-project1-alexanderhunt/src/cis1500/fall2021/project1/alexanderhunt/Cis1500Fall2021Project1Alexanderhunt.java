
package cis1500.fall2021.project1.alexanderhunt;

import java.util.Scanner;


public class Cis1500Fall2021Project1Alexanderhunt {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        //This line tells the program that keyboard is the variable used to save user input when using .nextLine()
        
        System.out.println("When prompted to answer questions, please answer with a single numeric input, or a single world spelled correctly.\n");
        
        System.out.println("What class do you want to be? Mage, Archer, or Warrior?");
        //This prints text.
              
        String userClass = keyboard.nextLine();
        //This takes what the user types and saves it as a variable called userClass.
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        //Print line used to show that the user has responded to a prompt
        
        
        if (userClass.equalsIgnoreCase("Mage")){
            System.out.println("Your cape flaps in the wind as you float in mid air. Your eyes glow like fire. \"Hello world.\" You tell yourself. \n");
        } else if (userClass.equalsIgnoreCase("Archer")){
            System.out.println("You reach back to your quiver and nock an arrow, the broadhead glints in the sunlight. \"Hello world.\" You tell yourself. \n"); 
        } else if (userClass.equalsIgnoreCase("Warrior")){
            System.out.println("Your palm rests on the hilt of your sword, the shield on your back rocks in the wind.\"Hello world.\" You tell yourself. \n");
        } else
            System.out.println("That's not one of the options but let's go for it!! \n");
//this block of code prints different lines depending on what the user chooses as their class.
        
        
        System.out.println(""
                + "Now that you have chosen your class, you decide to purchase some health potions before you set out on your adventure.\n" 
                + "Luckely, there is a merchant stall nearby. \"I'd like to buy some health potions.\" You tell the merchant.\n" 
                + "\"Sure stranger, and who might you be?\" the merchant asks for your name.");
        //this block of code asks the user for their name.
       
        String userName = keyboard.nextLine();
        //This takes what the user types and saves it as a variable called userName
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        
        System.out.print("\"Nice to meet you, " + userName);
        System.out.println(".\" he greets you. \n \n\"Let's make sure you are prepared for adventure. How many members are in your party?\" He asks.");
        //The merchant greets the user by name and asks the user how many people are in their party.
        
        double numberOfMembersInParty = Double.parseDouble(keyboard.nextLine());
        //this line saves the user input for how many party members are in their group
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");    
        
        System.out.print ("\"Alright, " + userName);
        System.out.println(". Let's make sure your party has enough potions.\" \n");
        //merchant addresses the user by name, and repeats back the number of party members.
        
        System.out.println("\"I have three different types of potions, I have small, medium, and large.\" he says.");
        System.out.println("\"The small potion has 6 gulps in it. The medium potion has 8 gulps. The large potion has 10 gulps of healing.\" he says.");
        System.out.print("\"What is your prefered potion size?\" he asks. \n");
                       
        String potionSize = keyboard.nextLine();
        //this line saves the user input for what size potion they want.
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        
        System.out.println ("\"Alright, " + userName + ".\" he really likes to call you by name. \n");
        System.out.println("\"How many gulps of a health potion does an average party member use on one of your adventures?\" he asks.");
 
        double numberOfGulpsPerPartyMember = Double.parseDouble(keyboard.nextLine());
        //this line saves the user input for how many gulps an adventurerer uses on an adventure.
                   
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                   
        System.out.println("The merchant's eyebrows raise. \"Yes... of course " + userName + ".\" he scratches his chin and his face has a look of intense consentration.");
        System.out.println("Suddendly his eyes spring to life and he exclaims \"I know exactly how many potions you are going to need! Do you want to know?\" he asks.");
        
        String userAnswersYesOrNo = keyboard.nextLine();
        //line saves if user says yes or no.
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
              
        
        if (potionSize.equalsIgnoreCase("Small")) {
            double numberOfPotionsRequired = numberOfGulpsPerPartyMember * numberOfMembersInParty / 6;

        System.out.println("\"You will need at least " + Math.ceil(numberOfPotionsRequired) + " potions, " + userName + "! You might have some left over, but at least you won't run out.\"" );
    
        }
        else if (potionSize.equalsIgnoreCase("Medium")) {
            double numberOfPotionsRequired = numberOfGulpsPerPartyMember * numberOfMembersInParty / 8;
        
        System.out.println("\"You will need at least " + Math.ceil(numberOfPotionsRequired) + " potions, " + userName + "! You might have some left over, but at least you won't run out.\"" );
        
        }
        else if (potionSize.equalsIgnoreCase("Large")) {
            double numberOfPotionsRequired = numberOfGulpsPerPartyMember * numberOfMembersInParty / 10;
            
        System.out.println("\"You will need at least " + Math.ceil(numberOfPotionsRequired) + " potions, " + userName + "! You might have some left over, but at least you won't run out.\"" );
       
        
}
         System.out.println("\nyou except the merchants offer, and set off on your adventure with plenty of potions. Good luck!");
}
}