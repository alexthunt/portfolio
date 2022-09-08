package com.example.lab11;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class HelloApplication extends Application {

    private Label label;
    Random rand = new Random();
    int randomNumber = rand.nextInt(3);

    @Override
    public void start(Stage stage) throws IOException {
        AnchorPane pane = new AnchorPane();

        label = new Label();
        label.setText("Hello World!");

        VBox vbox = new VBox();
        vbox.getChildren().add(label);
        pane.getChildren().add(vbox);

        Button button = new Button();
        button.setText("click me! - private inner class");
        button.setOnAction(new ButtonHandler());
        vbox.getChildren().add(button);

        Button anotherButton = new Button();
        anotherButton.setText("Click me! - anonymous inner class");
        anotherButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                label.setText("anonymous inner class handler here!");
            }
        });
        vbox.getChildren().add(anotherButton);

        Button buttonWithLambda = new Button();
        buttonWithLambda.setText("Click me! I run a lambda!");
        buttonWithLambda.setOnAction(event -> {label.setText("lambda lambda lambda");});
        vbox.getChildren().add(buttonWithLambda);

        Button lambdaButtonRock = new Button();
        lambdaButtonRock.setText("Rock");
        if (randomNumber == 0) {
            lambdaButtonRock.setOnAction(actionEvent -> {label.setText("It's a tie.");});
        }
        if (randomNumber == 1) {
            lambdaButtonRock.setOnAction(actionEvent -> {label.setText("You lose.");});
        }
        if (randomNumber == 2) {
            lambdaButtonRock.setOnAction(actionEvent -> {label.setText("You win.");});
        }
        vbox.getChildren().add(lambdaButtonRock);

        Button lambdaButtonPaper = new Button();
        lambdaButtonPaper.setText("Paper");
        if (randomNumber == 0) {
            lambdaButtonPaper.setOnAction(actionEvent -> {label.setText("You win.");});
        }
        if (randomNumber == 1) {
            lambdaButtonPaper.setOnAction(actionEvent -> {label.setText("It's a tie.");});
        }
        if (randomNumber == 2) {
            lambdaButtonPaper.setOnAction(actionEvent -> {label.setText("You lose.");});
        }
        vbox.getChildren().add(lambdaButtonPaper);

        Button lambdaButtonScissors = new Button();
        lambdaButtonScissors.setText("Scissors");
        if (randomNumber == 0) {
            lambdaButtonScissors.setOnAction(actionEvent -> {label.setText("You lose.");});
        }
        if (randomNumber == 1) {
            lambdaButtonScissors.setOnAction(actionEvent -> {label.setText("You win.");});
        }
        if (randomNumber == 2) {
            lambdaButtonScissors.setOnAction(actionEvent -> {label.setText("It's a tie.");});
        }
        vbox.getChildren().add(lambdaButtonScissors);


        label.setText("Hello World!");

        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    private class ButtonHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            label.setText("You clicked the button!");
        }
    }

    public static void main(String[] args) {
        launch();
    }
}