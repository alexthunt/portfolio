package lab10;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab10 {

    public static String fileName = "netbeans.db";

    // https://www.sqlitetutorial.net/sqlite-java/create-database/
    public static ArrayList<Item> getItemsFromDatabase() {
        ArrayList<Item> itemsList = new ArrayList<>();

        String url = "jdbc:sqlite:D:/1_Programming/Java/Github Repositories/cis2151-winter2022-lab9-Bellerophonn/sqlite/db/" + fileName;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();

                Statement statement = conn.createStatement();

                //select list of fields from tablename
                String query = "select name, price, quantity from item";
                ResultSet items = statement.executeQuery(query);
                while (items.next()) {
                    Item item = new Item(items.getString("name"), items.getDouble("price"), items.getInt("quantity"));
                    itemsList.add(item);
                }
                statement.close();
            }

        } catch (SQLException e) {
            System.out.println("An exception has occured... -->" + e.getMessage());
        }
        return itemsList;
    }

    public static void addItemToDatabase(Item item) {

        String url = "jdbc:sqlite:D:/1_Programming/Java/Github Repositories/cis2151-winter2022-lab9-Bellerophonn/sqlite/db/" + fileName;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                String preparedSql = "insert into item (name, price, quantity) values ( " + " ?, ?, ? )";
                PreparedStatement statement = conn.prepareStatement(preparedSql);
                statement.setString(1, item.getName());
                statement.setDouble(2, item.getPrice());
                statement.setInt(3, item.getQuantity());
                statement.executeUpdate();
                statement.close();
            }
        } catch (SQLException e) {
            System.out.println("An exception has occured... --> " + e.getMessage());
        }
    }

    public static void updateItemInDatabase(Item item) {

        String url = "jdbc:sqlite:D:/1_Programming/Java/Github Repositories/cis2151-winter2022-lab9-Bellerophonn/sqlite/db/" + fileName;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                String preparedSql = "update item set price = ?, quantity = ? where name = ?";
                PreparedStatement statement = conn.prepareStatement(preparedSql);
                statement.setDouble(1, item.getPrice());
                statement.setInt(2, item.getQuantity());
                statement.setString(3, item.getName());
                statement.executeUpdate();
                statement.close();
            }
        } catch (SQLException e) {
            System.out.println("An exception has occured... --> " + e.getMessage());
        }
    }

    public static void deleteItemInDatabase(Item item) {

        String url = "jdbc:sqlite:D:/1_Programming/Java/Github Repositories/cis2151-winter2022-lab9-Bellerophonn/sqlite/db/" + fileName;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                String preparedSql = "delete from item where name = ?";
                PreparedStatement statement = conn.prepareStatement(preparedSql);
                statement.setString(1, item.getName());
                statement.executeUpdate();
                statement.close();
            }
        } catch (SQLException e) {
            System.out.println("An exception has occured... --> " + e.getMessage());
        }
    }

    public static Item getItemDetailsFromUser() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of an item to sell");
        String name = keyboard.nextLine();
        System.out.println("Enter the price of the item to sell");
        Double price = Double.parseDouble(keyboard.nextLine());
        System.out.println("Enter the quantity");
        int quantity = Integer.parseInt(keyboard.nextLine());

        Item newItem = new Item(name, price, quantity);
        return newItem;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        boolean playerInPoolOfCoffe = false;
        while (!playerInPoolOfCoffe) {
            System.out.println("Do you want to add an item(1), update and item(2), delete and item(3), see what is for sale(4), or jump into a pool of coffe?(5)");
            int userSays = Integer.parseInt(keyboard.nextLine());
            if (userSays == 1) {
                Item newItem = getItemDetailsFromUser();
                addItemToDatabase(newItem);
            }
            if (userSays == 2) {
                System.out.println("Let's update an item, enter the name of an existing item");
                Item itemToUpdate = getItemDetailsFromUser();
                updateItemInDatabase(itemToUpdate);
            }
            if (userSays == 3) {
                System.out.println("Let's delete an item, enter the name of an existing item");
                Item itemToDelete = new Item(keyboard.nextLine(), 0, 0);
                deleteItemInDatabase(itemToDelete);
            }
            if (userSays == 4) {
                ArrayList<Item> itemsList = getItemsFromDatabase();
                for (Item item : itemsList) {
                    System.out.println("Name: " + item.getName() + " - Price: " + item.getPrice() + " - Quantity: " + item.getQuantity());
                }
            }
            if (userSays == 5) {
                playerInPoolOfCoffe=true;
            }
        }
    }

}
