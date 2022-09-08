package project2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Project2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Project2FXML.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Project 2");
        stage.setScene(scene);
        stage.show();
    }

}
