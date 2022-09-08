package project4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Project4 {

    public static Scanner keyboard = new Scanner(System.in);
    public static String whatToManage;
    public static int addItemQuantity;
    public static String addItemName;
    public static double addItemPrice;
    public static String checkItemName;
    public static String updateItemName;
    public static int updateItemQuantity;
    public static double updateItemPrice;
    public static String deleteItemName;
    public static String shopItemName;
    public static String goBackToMainMenu = "no";
    public static int shopItemQuantityToBuy;
    public static int shopItemQuantityInStock;
    public static double shopItemPrice;

    public static void main(String[] args) {
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("Do you want to 'manage', 'shop', or 'end'?");
            String userSays = keyboard.nextLine();
            if (userSays.equalsIgnoreCase("manage")) {
                manageStore();
            } else if (userSays.equalsIgnoreCase("shop")) {
                shopInStore();
            } else if (userSays.equalsIgnoreCase("end")) {
                keepGoing = false;
            } else {
                System.out.println("Invalid Input.");
            }
        }
    }

    public static void shopInStore() {
        boolean keepShopping = true;
        while (keepShopping) {
            boolean userWantsLookUpAnItem = true;
            while (userWantsLookUpAnItem) {
                goBackToMainMenu = "no";
                System.out.println("Enter the name of the item you want to buy and add \".txt\" at the end. Or if you are bored just type 'I'm bored'");
                shopItemName = keyboard.nextLine();
                File fileToRead = new File(shopItemName);
                try {
                    //open
                    Scanner fileReader = new Scanner(fileToRead);
                    //read
                    System.out.print("Quantity ");
                    System.out.println(fileReader.nextLine());
                    System.out.print("Price ");
                    System.out.println(fileReader.nextLine());

                    //close
                    fileReader.close();
                    userWantsLookUpAnItem = false;
                } catch (FileNotFoundException ex) {
                    if (shopItemName.equalsIgnoreCase("I'm Bored")) {
                        break;
                    }
                    System.out.println("We don't sell that.");
                }
            }
            if (shopItemName.equalsIgnoreCase("I'm Bored")) {
                break;
            }
            boolean userIsDecidingToBuyOrNot = true;
            while (userIsDecidingToBuyOrNot) {
                System.out.println("Do you want to buy this item? (Yes/No)");
                String userSaysYesOrNoToAPurchase = keyboard.nextLine();
                if (userSaysYesOrNoToAPurchase.equalsIgnoreCase("Yes")) {
                    File fileToRead = new File(shopItemName);
                    try {
                        //open
                        Scanner fileReader = new Scanner(fileToRead);
                        //read
                        shopItemQuantityInStock = Integer.parseInt(fileReader.nextLine());
                        shopItemPrice = Double.parseDouble(fileReader.nextLine());
                        //close
                        fileReader.close();
                    } catch (FileNotFoundException ex) {
                        System.out.println(ex);
                    }
                    System.out.println("How many do you want to buy?");
                    boolean stringToIntegerConversionIsSuccessful = false;
                    while (!(stringToIntegerConversionIsSuccessful)) {
                        try {
                            shopItemQuantityToBuy = Integer.parseInt(keyboard.nextLine());
                            stringToIntegerConversionIsSuccessful = true;
                        } catch (NumberFormatException nFE) {
                            System.out.println(nFE);
                        }
                    }
                    if (shopItemQuantityToBuy > shopItemQuantityInStock) {
                        System.out.println("There is not enough items in stock to make this purchase.");
                    } else {
                        System.out.println("Please enter your payment information.");
                        String paymentInfo = keyboard.nextLine();
                        try {
                            //open
                            PrintWriter printWriter = new PrintWriter(shopItemName);
                            //write
                            printWriter.println(shopItemQuantityInStock - shopItemQuantityToBuy);
                            printWriter.println(shopItemPrice);
                            //close
                            printWriter.close();
                            userIsDecidingToBuyOrNot = false;

                        } catch (FileNotFoundException ex) {
                            System.out.println(ex);
                        }
                    }
                } else if (userSaysYesOrNoToAPurchase.equalsIgnoreCase("no")) {
                    userIsDecidingToBuyOrNot = false;
                } else {
                    System.out.println("Invalid Input. Try again.");
                }
            }
        }
    }

    public static void manageStore() {
        boolean userWantsToManage = true;
        while (userWantsToManage) {
            System.out.println("Type 'add' to add a new item.");
            System.out.println("Type 'Check' to check the details of an item.");
            System.out.println("Type 'update' to update the stock or price of an item.");
            System.out.println("Type 'delete' to specify an item to be removed from the sale list.");
            System.out.println("Type 'Main menu' to return to the main menu.");
            whatToManage = keyboard.nextLine();
            if (whatToManage.equalsIgnoreCase("add")) {
                manageStoreAdd();
            } else if (whatToManage.equalsIgnoreCase("check")) {
                manageStoreCheck();
            } else if (whatToManage.equalsIgnoreCase("update")) {
                manageStoreUpdate();
            } else if (whatToManage.equalsIgnoreCase("delete")) {
                manageStoreDelete();
            } else if (whatToManage.equalsIgnoreCase("main menu")) {
                userWantsToManage = false;
            } else {
                System.out.println("Invalid Input");
            }
        }
    }

    public static void manageStoreAdd() {
        System.out.println("Enter the name of the item you want to add, and include it's file extension.");
        addItemName = keyboard.nextLine();

        System.out.println("How many of this item are in stock?");

        boolean validInputAddItemQuantity = false;
        while (!validInputAddItemQuantity) {
            try {
                addItemQuantity = Integer.parseInt(keyboard.nextLine());
                validInputAddItemQuantity = true;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Invalid Input");
            }
        }

        System.out.println("What is the price of this item?");

        boolean validInputAddItemPrice = false;
        while (!validInputAddItemPrice) {
            try {
                addItemPrice = Double.parseDouble(keyboard.nextLine());
                validInputAddItemPrice = true;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Invalid Input");
            }
        }

        try {
            //open
            PrintWriter printWriter = new PrintWriter(addItemName);
            //write
            printWriter.println(addItemQuantity);
            printWriter.println(addItemPrice);
            //close
            printWriter.close();

        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }

    public static void manageStoreCheck() {
        System.out.println("Enter the name of the item you want to check on, include it's file extension.");
        checkItemName = keyboard.nextLine();
        File fileToRead = new File(checkItemName);
        try {
            //open
            Scanner fileReader = new Scanner(fileToRead);
            //read
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextLine());
            }
            //close
            fileReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }

    public static void manageStoreUpdate() {
        String callFileAgain = "yes";
        boolean updateSucessful = false;
        while (!(updateSucessful)) {
            boolean successfulFileCall = false;
            while (!successfulFileCall) {
                System.out.println("Enter the name of the item you want to update, include it's file extension. If the system finds the item, it will allow you to change it.");
                updateItemName = keyboard.nextLine();
                File fileToRead = new File(updateItemName);
                try {
                    //open
                    Scanner fileReader = new Scanner(fileToRead);
                    //read
                    while (fileReader.hasNext()) {
                        System.out.println(fileReader.nextLine());
                    }
                    //close
                    fileReader.close();
                    successfulFileCall = true;
                } catch (FileNotFoundException ex) {
                    System.out.println(ex);
                    boolean callFileAgainIsInvalid = true;
                    while (callFileAgainIsInvalid) {
                        System.out.println("Try again?");
                        callFileAgain = keyboard.nextLine();
                        if (callFileAgain.equalsIgnoreCase("yes")) {
                            callFileAgainIsInvalid = true;
                            break;
                        } else if (callFileAgain.equalsIgnoreCase("no")) {
                            break;
                        } else {
                            System.out.println("invalid Input");
                            callFileAgainIsInvalid = true;
                        }
                    }
                }
                if (callFileAgain.equalsIgnoreCase("no")) {
                    break;
                }
            }
            if (callFileAgain.equalsIgnoreCase("no")) {
                break;
            }
            System.out.println("enter the new quantity.");
            //-----------------------------------------------------------------------
            boolean validInputAddItemQuantity = false;
            while (!validInputAddItemQuantity) {
                try {
                    updateItemQuantity = Integer.parseInt(keyboard.nextLine());
                    validInputAddItemQuantity = true;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Invalid Input");
                }
            }

            System.out.println("What is the new price of this item?");

            boolean validInputAddItemPrice = false;
            while (!validInputAddItemPrice) {
                try {
                    updateItemPrice = Double.parseDouble(keyboard.nextLine());
                    validInputAddItemPrice = true;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Invalid Input");
                }
            }

            try {
                //open
                PrintWriter printWriter = new PrintWriter(updateItemName);
                //write
                printWriter.println(updateItemQuantity);
                printWriter.println(updateItemPrice);
                //close
                printWriter.close();
                updateSucessful = true;

            } catch (FileNotFoundException ex) {
                System.out.println(ex);
            }
        }
    }

    public static void manageStoreDelete() {

        System.out.println("Enter the name of the item you want to delete, include it's file extension.");
        deleteItemName = keyboard.nextLine();
        File fileToDelete = new File(deleteItemName);
        if (fileToDelete.exists()) {
            fileToDelete.delete();
        } else {
            System.out.println("That file does not exist.");
        }
    }
}
