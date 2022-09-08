package lab9;

import java.sql.*;

public class Lab9 {
// https://www.sqlitetutorial.net/sqlite-java/create-database/
    public static void createNewDatabase(String fileName) {

        String url = "jdbc:sqlite:D:/1_Programming/Java/Github Repositories/cis2151-winter2022-lab9-Bellerophonn/sqlite/db/" + fileName;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        createNewDatabase("netbeans.db");
    }
    
}

