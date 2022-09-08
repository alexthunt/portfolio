package animalcraft;

import java.util.Scanner;

public class AnimalCraft {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner keyboard = new Scanner(System.in);
        String playerName = keyboard.nextLine();
        Player player = new Player(playerName, 2, 2);
        Island island = new Island();

        while (true) {
            System.out.println(island.getSpaceDescription(player.getyCoordinate(), player.getxCoordinate()));
            System.out.print("List of tools in backpack:");
            if (player.isShovelEquipped()) {
                System.out.print("Shovel ");
            }
            if (player.isHammerEquipped()) {
                System.out.print("Hammer ");
            }
            if (player.isAxeEquipped()) {
                System.out.print("Axe");
            }
            System.out.println("");
            System.out.println(player.getName() + ", what do you want to do? (N=Go North, S=Go South, E=Go East, W=Go West, D=Dig, B=Build, C=Chop, P= Pick up any tools on the ground.");
            String whatPlayerDoes = keyboard.nextLine();
            if (whatPlayerDoes.equalsIgnoreCase("N")) {
                if (player.getyCoordinate() != 0) {
                    int yCord = player.getyCoordinate();
                    yCord = yCord - 1;
                    player.setyCoordinate(yCord);
                } else {
                    System.out.println("You hit the northern edge of the island.");
                }
            }
            if (whatPlayerDoes.equalsIgnoreCase("S")) {
                if (player.getyCoordinate() != 4) {
                    int yCord = player.getyCoordinate();
                    yCord = yCord + 1;
                    player.setyCoordinate(yCord);
                } else {
                    System.out.println("You hit the southern edge of the island.");
                }
            }
            if (whatPlayerDoes.equalsIgnoreCase("E")) {
                if (player.getxCoordinate() != 4) {
                    int xCord = player.getxCoordinate();
                    xCord = xCord + 1;
                    player.setxCoordinate(xCord);
                } else {
                    System.out.println("You hit the eastern edge of the island.");
                }
            }
            if (whatPlayerDoes.equalsIgnoreCase("W")) {
                if (player.getxCoordinate() != 0) {
                    int xCord = player.getxCoordinate();
                    xCord = xCord - 1;
                    player.setxCoordinate(xCord);
                } else {
                    System.out.println("You hit the western edge of the island.");
                }
            }
            if (whatPlayerDoes.equalsIgnoreCase("D")) {
                Tool tool = new Tool("Shovel");
                if (island.getSpaceIsDiggable(player.getyCoordinate(), player.getxCoordinate())) {
                    System.out.println(tool.useTool(player.isShovelEquipped()));
                } else {
                    System.out.println("You can't do that.");
                }
            }
            if (whatPlayerDoes.equalsIgnoreCase("B")) {
                Tool tool = new Tool("Hammer");
                if (island.getSpaceIsBuildable(player.getyCoordinate(), player.getxCoordinate())) {
                    System.out.println(tool.useTool(player.isHammerEquipped()));
                } else {
                    System.out.println("You can't do that.");
                }
            }
            if (whatPlayerDoes.equalsIgnoreCase("C")) {
                Tool tool = new Tool("Axe");
                if (island.getSpaceIsChoppable(player.getyCoordinate(), player.getxCoordinate())) {
                    System.out.println(tool.useTool(player.isAxeEquipped()));
                } else {
                    System.out.println("You can't do that.");
                }
            }
            if (whatPlayerDoes.equalsIgnoreCase("P")) {
                if (island.getSpaceHasShovel(player.getyCoordinate(), player.getxCoordinate())) {
                    player.setShovelEquipped(true);
                    island.setSpaceHasShovel(player.getyCoordinate(), player.getxCoordinate(), false);
                }
                if (island.getSpaceHasHammer(player.getyCoordinate(), player.getxCoordinate())) {
                    player.setHammerEquipped(true);
                    island.setSpaceHasHammer(player.getyCoordinate(), player.getxCoordinate(), false);
                }
                if (island.getSpaceHasAxe(player.getyCoordinate(), player.getxCoordinate())) {
                    player.setAxeEquipped(true);
                    island.setSpaceHasAxe(player.getyCoordinate(), player.getxCoordinate(), false);
                }
            }
        }
    }
}
