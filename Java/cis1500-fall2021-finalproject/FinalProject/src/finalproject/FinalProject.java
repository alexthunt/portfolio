package finalproject;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FinalProject extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Final_Project.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("SwordRise");
        stage.setScene(scene);
        stage.show();
    }
    
}
