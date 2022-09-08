package project3;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Project3 extends Application {

    public static void main(String[] args) {
        createNewDatabase("theater.db");
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Project3FXML.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Project 3");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void createNewDatabase(String fileName) {

        String url = "jdbc:sqlite:D:/1_Programming/Java/Github Repositories/cis2151-winter2022-project3-Bellerophonn/sqlite/db/" + fileName;

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
}
