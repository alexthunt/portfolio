package finalproject;

import javafx.application.Application;
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
        Parent root = FXMLLoader.load(getClass().getResource("GameBoard.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("DaggerScroll");
        stage.setMaximized(true);
        stage.setWidth(0);
        stage.setHeight(0);
        stage.setScene(scene);
        stage.show();
    }


}
