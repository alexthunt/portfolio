/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package project2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Alexa
 */
public class Project2FXMLController implements Initializable {

    GameState gameState = new GameState(2, 2);
    @FXML
    private Button westButton;
    @FXML
    private Button eastButton;
    @FXML
    private Button northButton;
    @FXML
    private Button southButton;
    @FXML
    private Label shovelLabel;
    @FXML
    private Label hammerLabel;
    @FXML
    private Label axeLabel;
    @FXML
    private Button digButton;
    @FXML
    private Button buildButton;
    @FXML
    private Button chopButton;
    @FXML
    private Label isDiggableSpaceDescription;
    @FXML
    private Label isBuildableSpaceDescription;
    @FXML
    private Label isChoppableSpaceDescription;
    @FXML
    private Button loadButton;
    @FXML
    private Button saveButton;
    @FXML
    private Label actionLabel;
    @FXML
    private Label labelHasHammer;
    @FXML
    private Label labelHasAxe;
    @FXML
    private Label labelHasShovel;
    @FXML
    private Button lootButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        updateUI();
    }

    @FXML
    private void westButtonPressed(ActionEvent event) {
        gameState.getPlayer().setxCo(gameState.getPlayer().getxCo() - 1);
        updateUI();
    }

    @FXML
    private void eastButtonPressed(ActionEvent event) {
        gameState.getPlayer().setxCo(gameState.getPlayer().getxCo() + 1);
        updateUI();
    }

    @FXML
    private void northButtonPressed(ActionEvent event) {
        gameState.getPlayer().setyCo(gameState.getPlayer().getyCo() - 1);
        updateUI();
    }

    @FXML
    private void southButtonPressed(ActionEvent event) {
        gameState.getPlayer().setyCo(gameState.getPlayer().getyCo() + 1);
        updateUI();
    }

    @FXML
    private void digButtonPressed(ActionEvent event) {
        actionLabel.setText("You dig a hole!");
    }

    @FXML
    private void buildButtonPressed(ActionEvent event) {
        actionLabel.setText("You build a shack!");
    }

    @FXML
    private void chopButtonPressed(ActionEvent event) {
        actionLabel.setText("You chop a tree!");
    }

    @FXML
    private void loadButtonPressed(ActionEvent event) {
        try {
            ObjectInputStream binaryInputFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("SaveFile.bin")));
            gameState = (GameState) binaryInputFile.readObject();
            binaryInputFile.close();
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        updateUI();
    }

    @FXML
    private void saveButtonPressed(ActionEvent event) {
        try {
            ObjectOutputStream binaryOutputFile = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("SaveFile.bin")));
            binaryOutputFile.writeObject(gameState);
            binaryOutputFile.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    @FXML
    private void lootButtonPressed(ActionEvent event) {
        if (gameState.getIsland().getSpaces().get(gameState.getPlayer().getyCo()).get(gameState.getPlayer().getxCo()).getHasAxe()) {
            gameState.getPlayer().setHasAxe(true);
            gameState.getIsland().getSpaces().get(gameState.getPlayer().getyCo()).get(gameState.getPlayer().getxCo()).setHasAxe(false);
        }
        if (gameState.getIsland().getSpaces().get(gameState.getPlayer().getyCo()).get(gameState.getPlayer().getxCo()).getHasHammer()) {
            gameState.getPlayer().setHasHammer(true);
            gameState.getIsland().getSpaces().get(gameState.getPlayer().getyCo()).get(gameState.getPlayer().getxCo()).setHasHammer(false);
        }
        if (gameState.getIsland().getSpaces().get(gameState.getPlayer().getyCo()).get(gameState.getPlayer().getxCo()).getHasShovel()) {
            gameState.getPlayer().setHasShovel(true);
            gameState.getIsland().getSpaces().get(gameState.getPlayer().getyCo()).get(gameState.getPlayer().getxCo()).setHasShovel(false);
        }
        updateUI();
    }

    private void updateUI() {

        if (gameState.getPlayer().getyCo() == 0) {
            northButton.setDisable(true);
        } else {
            northButton.setDisable(false);
        }
        if (gameState.getPlayer().getyCo() == 3) {
            southButton.setDisable(true);
        } else {
            southButton.setDisable(false);
        }
        if (gameState.getPlayer().getxCo() == 0) {
            westButton.setDisable(true);
        } else {
            westButton.setDisable(false);
        }
        if (gameState.getPlayer().getxCo() == 3) {
            eastButton.setDisable(true);
        } else {
            eastButton.setDisable(false);
        }
        if ((gameState.getIsland().getSpaces().get(gameState.getPlayer().getyCo()).get(gameState.getPlayer().getxCo()).getIsDiggable()) && (gameState.getPlayer().getHasShovel())) {
            digButton.setDisable(false);
            isDiggableSpaceDescription.setText("Diggable");
        } else {
            digButton.setDisable(true);
            isDiggableSpaceDescription.setText("Not Diggable");
        }
        if ((gameState.getIsland().getSpaces().get(gameState.getPlayer().getyCo()).get(gameState.getPlayer().getxCo()).getIsBuildable()) && (gameState.getPlayer().getHasHammer())) {
            buildButton.setDisable(false);
            isBuildableSpaceDescription.setText("Buildable");
        } else {
            buildButton.setDisable(true);
            isBuildableSpaceDescription.setText("Not Buildable");
        }
        if ((gameState.getIsland().getSpaces().get(gameState.getPlayer().getyCo()).get(gameState.getPlayer().getxCo()).getIsChoppable()) && (gameState.getPlayer().getHasAxe())) {
            chopButton.setDisable(false);
            isChoppableSpaceDescription.setText("Choppable");
        } else {
            chopButton.setDisable(true);
            isChoppableSpaceDescription.setText("Not Choppable");
        }
        if (gameState.getIsland().getSpaces().get(gameState.getPlayer().getyCo()).get(gameState.getPlayer().getxCo()).getHasAxe()) {

            labelHasAxe.setText("Has Axe");
        } else {
            labelHasAxe.setText("");
        }
        if (gameState.getIsland().getSpaces().get(gameState.getPlayer().getyCo()).get(gameState.getPlayer().getxCo()).getHasHammer()) {

            labelHasHammer.setText("Has Hammer");
        } else {
            labelHasHammer.setText("");
        }
        if (gameState.getIsland().getSpaces().get(gameState.getPlayer().getyCo()).get(gameState.getPlayer().getxCo()).getHasShovel()) {

            labelHasShovel.setText("Has Shovel");
        } else {
            labelHasShovel.setText("");
        }
        actionLabel.setText("");
        if (gameState.getPlayer().getHasAxe()) {
            axeLabel.setText("Axe");
        } else {
            axeLabel.setText("");
        }
        if (gameState.getPlayer().getHasHammer()) {
            hammerLabel.setText("Hammer");
        } else {
            hammerLabel.setText("");
        }
        if (gameState.getPlayer().getHasShovel()) {
            shovelLabel.setText("Shovel");
        } else {
            shovelLabel.setText("");
        }

    }
}
