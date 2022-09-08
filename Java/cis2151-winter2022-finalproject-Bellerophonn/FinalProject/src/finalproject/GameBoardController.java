package finalproject;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class GameBoardController implements Initializable {

    String soundEpicSax = "sound/epicSax.wav";
    String soundDiceRoll = "sound/diceRoll.wav";
    public Yahtzee game = new Yahtzee();

    @FXML
    private ImageView playDice1;
    @FXML
    private ImageView playDice2;
    @FXML
    private ImageView playDice3;
    @FXML
    private ImageView playDice4;
    @FXML
    private ImageView playDice5;
    @FXML
    private ImageView keepDice1;
    @FXML
    private ImageView keepDice5;
    @FXML
    private ImageView keepDice4;
    @FXML
    private ImageView keepDice3;
    @FXML
    private ImageView keepDice2;
    @FXML
    private ImageView spriteDiceAce;
    @FXML
    private ImageView spriteDiceTwo;
    @FXML
    private ImageView spriteDiceThree;
    @FXML
    private ImageView spriteDiceFour;
    @FXML
    private ImageView spriteDiceFive;
    @FXML
    private ImageView spriteDiceSix;
    @FXML
    private Label phaseLabel;
    @FXML
    private Label playerLabel;
    @FXML
    private ImageView spriteWhite;
    @FXML
    private Button buttonRollDice;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            ObjectInputStream binaryInputFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("SaveFile.bin")));
            game = (Yahtzee) binaryInputFile.readObject();
            binaryInputFile.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        updateUIandAllClassVariables();
    }

    @FXML
    private void playDice1Clicked(MouseEvent event) {
        game.getDice1().setInPlay(false);
        updateUIandAllClassVariables();
    }

    @FXML
    private void playDice2Clicked(MouseEvent event) {
        game.getDice2().setInPlay(false);
        updateUIandAllClassVariables();
    }

    @FXML
    private void playDice3Clicked(MouseEvent event) {
        game.getDice3().setInPlay(false);
        updateUIandAllClassVariables();
    }

    @FXML
    private void playDice4Clicked(MouseEvent event) {
        game.getDice4().setInPlay(false);
        updateUIandAllClassVariables();
    }

    @FXML
    private void playDice5Clicked(MouseEvent event) {
        game.getDice5().setInPlay(false);
        updateUIandAllClassVariables();
    }

    @FXML
    private void keepDice1Clicked(MouseEvent event) {
        game.getDice1().setInPlay(true);
        updateUIandAllClassVariables();
    }

    @FXML
    private void keepDice5Clicked(MouseEvent event) {
        game.getDice5().setInPlay(true);
        updateUIandAllClassVariables();
    }

    @FXML
    private void keepDice4Clicked(MouseEvent event) {
        game.getDice4().setInPlay(true);
        updateUIandAllClassVariables();
    }

    @FXML
    private void keepDice3Clicked(MouseEvent event) {
        game.getDice3().setInPlay(true);
        updateUIandAllClassVariables();
    }

    @FXML
    private void keepdice2Clicked(MouseEvent event) {
        game.getDice2().setInPlay(true);
        updateUIandAllClassVariables();
    }

    private void updateUIandAllClassVariables() {
        if (game.isPlayerOnesTurnActive()) {
            playerLabel.setText("Player One");
        }
        if (!(game.isPlayerOnesTurnActive())) {
            playerLabel.setText("Player Two");
        }

        //update all scores
        if (game.isPlayerOnesTurnActive()) {
            if (!(game.getPlayer1ScoreCard().isAcesLockedIn())) {
                game.getPlayer1ScoreCard().setAcesScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer1ScoreCard().isTwosLockedIn())) {
                game.getPlayer1ScoreCard().setTwosScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer1ScoreCard().isThreesLockedIn())) {
                game.getPlayer1ScoreCard().setThreesScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer1ScoreCard().isFoursLockedIn())) {
                game.getPlayer1ScoreCard().setFoursScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer1ScoreCard().isFivesLockedIn())) {
                game.getPlayer1ScoreCard().setFivesScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer1ScoreCard().isSixesLockedIn())) {
                game.getPlayer1ScoreCard().setSixesScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            game.getPlayer1ScoreCard().setBonus();
            if (!(game.getPlayer1ScoreCard().isThreeOfAKindLockedIn())) {
                game.getPlayer1ScoreCard().setThreeOfAKindScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer1ScoreCard().isFourOfAKindLockedIn())) {
                game.getPlayer1ScoreCard().setFourOfAKindScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer1ScoreCard().isFullHouseLockedIn())) {
                game.getPlayer1ScoreCard().setFullHouseScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer1ScoreCard().isSmallStraightLockedIn())) {
                game.getPlayer1ScoreCard().setSmallStraightScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer1ScoreCard().isLargeStraightLockedIn())) {
                game.getPlayer1ScoreCard().setLargeStraightScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer1ScoreCard().isYahtzeeLockedIn())) {
                game.getPlayer1ScoreCard().setYahtzeeScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer1ScoreCard().isChanceLockedIn())) {
                game.getPlayer1ScoreCard().setChanceScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            game.getPlayer1ScoreCard().setTotalScore();
        }
        if (!(game.isPlayerOnesTurnActive())) {
            if (!(game.getPlayer2ScoreCard().isAcesLockedIn())) {
                game.getPlayer2ScoreCard().setAcesScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer2ScoreCard().isTwosLockedIn())) {
                game.getPlayer2ScoreCard().setTwosScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer2ScoreCard().isThreesLockedIn())) {
                game.getPlayer2ScoreCard().setThreesScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer2ScoreCard().isFoursLockedIn())) {
                game.getPlayer2ScoreCard().setFoursScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer2ScoreCard().isFivesLockedIn())) {
                game.getPlayer2ScoreCard().setFivesScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer2ScoreCard().isSixesLockedIn())) {
                game.getPlayer2ScoreCard().setSixesScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            game.getPlayer2ScoreCard().setBonus();
            if (!(game.getPlayer2ScoreCard().isThreeOfAKindLockedIn())) {
                game.getPlayer2ScoreCard().setThreeOfAKindScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer2ScoreCard().isFourOfAKindLockedIn())) {
                game.getPlayer2ScoreCard().setFourOfAKindScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer2ScoreCard().isFullHouseLockedIn())) {
                game.getPlayer2ScoreCard().setFullHouseScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer2ScoreCard().isSmallStraightLockedIn())) {
                game.getPlayer2ScoreCard().setSmallStraightScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer2ScoreCard().isLargeStraightLockedIn())) {
                game.getPlayer2ScoreCard().setLargeStraightScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer2ScoreCard().isYahtzeeLockedIn())) {
                game.getPlayer2ScoreCard().setYahtzeeScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            if (!(game.getPlayer2ScoreCard().isChanceLockedIn())) {
                game.getPlayer2ScoreCard().setChanceScore(game.getDice1().getFace(), game.getDice2().getFace(), game.getDice3().getFace(), game.getDice4().getFace(), game.getDice5().getFace());
            }
            game.getPlayer2ScoreCard().setTotalScore();
        }

        //update all scores
        phaseLabel.setText(Integer.toString(game.getGamePhase()));

        if (game.getDice1().isInPlay()) {
            if (game.getDice1().getFace() == 1) {
                playDice1.setImage(spriteDiceAce.getImage());
            }
            if (game.getDice1().getFace() == 2) {
                playDice1.setImage(spriteDiceTwo.getImage());
            }
            if (game.getDice1().getFace() == 3) {
                playDice1.setImage(spriteDiceThree.getImage());
            }
            if (game.getDice1().getFace() == 4) {
                playDice1.setImage(spriteDiceFour.getImage());
            }
            if (game.getDice1().getFace() == 5) {
                playDice1.setImage(spriteDiceFive.getImage());
            }
            if (game.getDice1().getFace() == 6) {
                playDice1.setImage(spriteDiceSix.getImage());
            }
            keepDice1.setImage(spriteWhite.getImage());
        }
        if (game.getDice2().isInPlay()) {
            if (game.getDice2().getFace() == 1) {
                playDice2.setImage(spriteDiceAce.getImage());
            }
            if (game.getDice2().getFace() == 2) {
                playDice2.setImage(spriteDiceTwo.getImage());
            }
            if (game.getDice2().getFace() == 3) {
                playDice2.setImage(spriteDiceThree.getImage());
            }
            if (game.getDice2().getFace() == 4) {
                playDice2.setImage(spriteDiceFour.getImage());
            }
            if (game.getDice2().getFace() == 5) {
                playDice2.setImage(spriteDiceFive.getImage());
            }
            if (game.getDice2().getFace() == 6) {
                playDice2.setImage(spriteDiceSix.getImage());
            }
            keepDice2.setImage(spriteWhite.getImage());
        }
        if (game.getDice3().isInPlay()) {
            if (game.getDice3().getFace() == 1) {
                playDice3.setImage(spriteDiceAce.getImage());
            }
            if (game.getDice3().getFace() == 2) {
                playDice3.setImage(spriteDiceTwo.getImage());
            }
            if (game.getDice3().getFace() == 3) {
                playDice3.setImage(spriteDiceThree.getImage());
            }
            if (game.getDice3().getFace() == 4) {
                playDice3.setImage(spriteDiceFour.getImage());
            }
            if (game.getDice3().getFace() == 5) {
                playDice3.setImage(spriteDiceFive.getImage());
            }
            if (game.getDice3().getFace() == 6) {
                playDice3.setImage(spriteDiceSix.getImage());
            }
            keepDice3.setImage(spriteWhite.getImage());
        }
        if (game.getDice4().isInPlay()) {
            if (game.getDice4().getFace() == 1) {
                playDice4.setImage(spriteDiceAce.getImage());
            }
            if (game.getDice4().getFace() == 2) {
                playDice4.setImage(spriteDiceTwo.getImage());
            }
            if (game.getDice4().getFace() == 3) {
                playDice4.setImage(spriteDiceThree.getImage());
            }
            if (game.getDice4().getFace() == 4) {
                playDice4.setImage(spriteDiceFour.getImage());
            }
            if (game.getDice4().getFace() == 5) {
                playDice4.setImage(spriteDiceFive.getImage());
            }
            if (game.getDice4().getFace() == 6) {
                playDice4.setImage(spriteDiceSix.getImage());
            }
            keepDice4.setImage(spriteWhite.getImage());
        }
        if (game.getDice5().isInPlay()) {
            if (game.getDice5().getFace() == 1) {
                playDice5.setImage(spriteDiceAce.getImage());
            }
            if (game.getDice5().getFace() == 2) {
                playDice5.setImage(spriteDiceTwo.getImage());
            }
            if (game.getDice5().getFace() == 3) {
                playDice5.setImage(spriteDiceThree.getImage());
            }
            if (game.getDice5().getFace() == 4) {
                playDice5.setImage(spriteDiceFour.getImage());
            }
            if (game.getDice5().getFace() == 5) {
                playDice5.setImage(spriteDiceFive.getImage());
            }
            if (game.getDice5().getFace() == 6) {
                playDice5.setImage(spriteDiceSix.getImage());
            }
            keepDice5.setImage(spriteWhite.getImage());
        }
        if (!(game.getDice1().isInPlay())) {
            if (game.getDice1().getFace() == 1) {
                keepDice1.setImage(spriteDiceAce.getImage());
            }
            if (game.getDice1().getFace() == 2) {
                keepDice1.setImage(spriteDiceTwo.getImage());
            }
            if (game.getDice1().getFace() == 3) {
                keepDice1.setImage(spriteDiceThree.getImage());
            }
            if (game.getDice1().getFace() == 4) {
                keepDice1.setImage(spriteDiceFour.getImage());
            }
            if (game.getDice1().getFace() == 5) {
                keepDice1.setImage(spriteDiceFive.getImage());
            }
            if (game.getDice1().getFace() == 6) {
                keepDice1.setImage(spriteDiceSix.getImage());
            }
            playDice1.setImage(spriteWhite.getImage());
        }
        if (!(game.getDice2().isInPlay())) {
            if (game.getDice2().getFace() == 1) {
                keepDice2.setImage(spriteDiceAce.getImage());
            }
            if (game.getDice2().getFace() == 2) {
                keepDice2.setImage(spriteDiceTwo.getImage());
            }
            if (game.getDice2().getFace() == 3) {
                keepDice2.setImage(spriteDiceThree.getImage());
            }
            if (game.getDice2().getFace() == 4) {
                keepDice2.setImage(spriteDiceFour.getImage());
            }
            if (game.getDice2().getFace() == 5) {
                keepDice2.setImage(spriteDiceFive.getImage());
            }
            if (game.getDice2().getFace() == 6) {
                keepDice2.setImage(spriteDiceSix.getImage());
            }
            playDice2.setImage(spriteWhite.getImage());
        }
        if (!(game.getDice3().isInPlay())) {
            if (game.getDice3().getFace() == 1) {
                keepDice3.setImage(spriteDiceAce.getImage());
            }
            if (game.getDice3().getFace() == 2) {
                keepDice3.setImage(spriteDiceTwo.getImage());
            }
            if (game.getDice3().getFace() == 3) {
                keepDice3.setImage(spriteDiceThree.getImage());
            }
            if (game.getDice3().getFace() == 4) {
                keepDice3.setImage(spriteDiceFour.getImage());
            }
            if (game.getDice3().getFace() == 5) {
                keepDice3.setImage(spriteDiceFive.getImage());
            }
            if (game.getDice3().getFace() == 6) {
                keepDice3.setImage(spriteDiceSix.getImage());
            }
            playDice3.setImage(spriteWhite.getImage());
        }
        if (!(game.getDice4().isInPlay())) {
            if (game.getDice4().getFace() == 1) {
                keepDice4.setImage(spriteDiceAce.getImage());
            }
            if (game.getDice4().getFace() == 2) {
                keepDice4.setImage(spriteDiceTwo.getImage());
            }
            if (game.getDice4().getFace() == 3) {
                keepDice4.setImage(spriteDiceThree.getImage());
            }
            if (game.getDice4().getFace() == 4) {
                keepDice4.setImage(spriteDiceFour.getImage());
            }
            if (game.getDice4().getFace() == 5) {
                keepDice4.setImage(spriteDiceFive.getImage());
            }
            if (game.getDice4().getFace() == 6) {
                keepDice4.setImage(spriteDiceSix.getImage());
            }
            playDice4.setImage(spriteWhite.getImage());
        }
        if (!(game.getDice5().isInPlay())) {
            if (game.getDice5().getFace() == 1) {
                keepDice5.setImage(spriteDiceAce.getImage());
            }
            if (game.getDice5().getFace() == 2) {
                keepDice5.setImage(spriteDiceTwo.getImage());
            }
            if (game.getDice5().getFace() == 3) {
                keepDice5.setImage(spriteDiceThree.getImage());
            }
            if (game.getDice5().getFace() == 4) {
                keepDice5.setImage(spriteDiceFour.getImage());
            }
            if (game.getDice5().getFace() == 5) {
                keepDice5.setImage(spriteDiceFive.getImage());
            }
            if (game.getDice5().getFace() == 6) {
                keepDice5.setImage(spriteDiceSix.getImage());
            }
            playDice5.setImage(spriteWhite.getImage());
        }
        if ((!(game.getDice1().isInPlay())) && (!(game.getDice2().isInPlay())) && (!(game.getDice3().isInPlay())) && (!(game.getDice4().isInPlay())) && (!(game.getDice5().isInPlay()))) {
            buttonRollDice.setDisable(true);
        } else {
            buttonRollDice.setDisable(false);
        }
        if (game.getGamePhase() == 3) {
            buttonRollDice.setDisable(true);
        }
    }

    @FXML
    private void switchToScoreCard(ActionEvent event) throws IOException {
        updateUIandAllClassVariables();
        try {
            ObjectOutputStream binaryOutputFile = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("SaveFile.bin")));
            binaryOutputFile.writeObject(game);
            binaryOutputFile.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        Parent scoreCardParent = FXMLLoader.load(getClass().getResource("ScoreCard.fxml"));
        Scene scoreCardScene = new Scene(scoreCardParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scoreCardScene);
        window.show();
    }

    @FXML
    private void diceRoll(ActionEvent event) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        game.incrementGamePhase();
        boolean diceRolled = false;
        if (game.getDice1().isInPlay()) {
            game.getDice1().rollDice();
            diceRolled = true;
        }
        if (game.getDice2().isInPlay()) {
            game.getDice2().rollDice();
            diceRolled = true;
        }
        if (game.getDice3().isInPlay()) {
            game.getDice3().rollDice();
            diceRolled = true;
        }
        if (game.getDice4().isInPlay()) {
            game.getDice4().rollDice();
            diceRolled = true;
        }
        if (game.getDice5().isInPlay()) {
            game.getDice5().rollDice();
            diceRolled = true;
        }
        if (diceRolled) {
            playSound(soundDiceRoll);
        }

        updateUIandAllClassVariables();

    }

    private void playSound(String path) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        File file = new File(path);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }

    @FXML
    private void newGame(ActionEvent event) {
        game = new Yahtzee();

    }

}
