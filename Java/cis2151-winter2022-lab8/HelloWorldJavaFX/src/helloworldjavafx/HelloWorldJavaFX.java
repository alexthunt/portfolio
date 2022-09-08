package helloworldjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloWorldJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Hello.fxml"));
        Scene scene = new Scene (root);
        stage.setTitle("GUI GUI GUI");
        stage.setScene(scene);
        stage.show();
    }

}
