package finalproject;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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
import javafx.stage.Stage;

public class ScoreCardController implements Initializable {

    Yahtzee game;

    @FXML
    private Label acesScore;
    @FXML
    private Label twosScore;
    @FXML
    private Label threesScore;
    @FXML
    private Label foursScore;
    @FXML
    private Label fivesScore;
    @FXML
    private Label sixesScore;
    @FXML
    private Label threeOfAKindScore;
    @FXML
    private Label fourOfAKindScore;
    @FXML
    private Label fullHouseScore;
    @FXML
    private Label smallStraightScore;
    @FXML
    private Label largeStraightScore;
    @FXML
    private Label yahtzeeScore;
    @FXML
    private Label chanceScore;
    @FXML
    private Label totalScore;
    @FXML
    private Button buttonLockAces;
    @FXML
    private Button buttonLockTwos;
    @FXML
    private Button buttonLockThrees;
    @FXML
    private Button buttonLockFours;
    @FXML
    private Button buttonLockFives;
    @FXML
    private Button buttonLockSixes;
    @FXML
    private Button buttonLockThreeOfAKind;
    @FXML
    private Button buttonLockFourOfAKind;
    @FXML
    private Button butttonLockFullHouse;
    @FXML
    private Button buttonLockSMStraight;
    @FXML
    private Button buttonLockLGStraight;
    @FXML
    private Button buttonLockYahtzee;
    @FXML
    private Button buttonLockChance;
    @FXML
    private Label bonusScore;
    @FXML
    private Label acesScore2;
    @FXML
    private Label twosScore2;
    @FXML
    private Label threesScore2;
    @FXML
    private Label foursScore2;
    @FXML
    private Label fivesScore2;
    @FXML
    private Label sixesScore2;
    @FXML
    private Label threeOfAKindScore2;
    @FXML
    private Label fourOfAKindScore2;
    @FXML
    private Label fullHouseScore2;
    @FXML
    private Label smallStraightScore2;
    @FXML
    private Label largeStraightScore2;
    @FXML
    private Label yahtzeeScore2;
    @FXML
    private Label chanceScore2;
    @FXML
    private Label totalScore2;
    @FXML
    private Label bonusScore2;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            ObjectInputStream binaryInputFile = new ObjectInputStream(new BufferedInputStream(new FileInputStream("SaveFile.bin")));
            game = (Yahtzee) binaryInputFile.readObject();
            binaryInputFile.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        updateScoreCardUI();
        updateAllLabels();
    }

    public void updateAllLabels() {
        acesScore.setText(Integer.toString(game.getPlayer1ScoreCard().getAcesScore()));
        twosScore.setText(Integer.toString(game.getPlayer1ScoreCard().getTwosScore()));
        threesScore.setText(Integer.toString(game.getPlayer1ScoreCard().getThreesScore()));
        foursScore.setText(Integer.toString(game.getPlayer1ScoreCard().getFoursScore()));
        fivesScore.setText(Integer.toString(game.getPlayer1ScoreCard().getFivesScore()));
        sixesScore.setText(Integer.toString(game.getPlayer1ScoreCard().getSixesScore()));
        bonusScore.setText(Integer.toString(game.getPlayer1ScoreCard().getBonus()));
        threeOfAKindScore.setText(Integer.toString(game.getPlayer1ScoreCard().getThreeOfAKindScore()));
        fourOfAKindScore.setText(Integer.toString(game.getPlayer1ScoreCard().getFourOfAKindScore()));
        fullHouseScore.setText(Integer.toString(game.getPlayer1ScoreCard().getFullHouseScore()));
        smallStraightScore.setText(Integer.toString(game.getPlayer1ScoreCard().getSmallStraightScore()));
        largeStraightScore.setText(Integer.toString(game.getPlayer1ScoreCard().getLargeStraightScore()));
        yahtzeeScore.setText(Integer.toString(game.getPlayer1ScoreCard().getYahtzeeScore()));
        chanceScore.setText(Integer.toString(game.getPlayer1ScoreCard().getChanceScore()));
        totalScore.setText(Integer.toString(game.getPlayer1ScoreCard().getTotalScore()));
        acesScore2.setText(Integer.toString(game.getPlayer2ScoreCard().getAcesScore()));
        twosScore2.setText(Integer.toString(game.getPlayer2ScoreCard().getTwosScore()));
        threesScore2.setText(Integer.toString(game.getPlayer2ScoreCard().getThreesScore()));
        foursScore2.setText(Integer.toString(game.getPlayer2ScoreCard().getFoursScore()));
        fivesScore2.setText(Integer.toString(game.getPlayer2ScoreCard().getFivesScore()));
        sixesScore2.setText(Integer.toString(game.getPlayer2ScoreCard().getSixesScore()));
        bonusScore2.setText(Integer.toString(game.getPlayer2ScoreCard().getBonus()));
        threeOfAKindScore2.setText(Integer.toString(game.getPlayer2ScoreCard().getThreeOfAKindScore()));
        fourOfAKindScore2.setText(Integer.toString(game.getPlayer2ScoreCard().getFourOfAKindScore()));
        fullHouseScore2.setText(Integer.toString(game.getPlayer2ScoreCard().getFullHouseScore()));
        smallStraightScore2.setText(Integer.toString(game.getPlayer2ScoreCard().getSmallStraightScore()));
        largeStraightScore2.setText(Integer.toString(game.getPlayer2ScoreCard().getLargeStraightScore()));
        yahtzeeScore2.setText(Integer.toString(game.getPlayer2ScoreCard().getYahtzeeScore()));
        chanceScore2.setText(Integer.toString(game.getPlayer2ScoreCard().getChanceScore()));
        totalScore2.setText(Integer.toString(game.getPlayer2ScoreCard().getTotalScore()));
    }

    @FXML
    private void switchToGameBoard(ActionEvent event) throws IOException {
        try {
            ObjectOutputStream binaryOutputFile = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("SaveFile.bin")));
            binaryOutputFile.writeObject(game);
            binaryOutputFile.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        Parent gameBoardParent = FXMLLoader.load(getClass().getResource("GameBoard.fxml"));
        Scene gameBoardScene = new Scene(gameBoardParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(gameBoardScene);
        window.show();
    }

    private void updateScoreCardUI() {
        if (game.isPlayerOnesTurnActive()) {
            if (game.getPlayer1ScoreCard().isAcesLockedIn()) {
                buttonLockAces.setDisable(true);
            } else {
                buttonLockAces.setDisable(false);
            }
            if (game.getPlayer1ScoreCard().isTwosLockedIn()) {
                buttonLockTwos.setDisable(true);
            } else {
                buttonLockTwos.setDisable(false);
            }
            if (game.getPlayer1ScoreCard().isThreesLockedIn()) {
                buttonLockThrees.setDisable(true);
            } else {
                buttonLockThrees.setDisable(false);
            }
            if (game.getPlayer1ScoreCard().isFoursLockedIn()) {
                buttonLockFours.setDisable(true);
            } else {
                buttonLockFours.setDisable(false);
            }
            if (game.getPlayer1ScoreCard().isFivesLockedIn()) {
                buttonLockFives.setDisable(true);
            } else {
                buttonLockFives.setDisable(false);
            }
            if (game.getPlayer1ScoreCard().isSixesLockedIn()) {
                buttonLockSixes.setDisable(true);
            } else {
                buttonLockSixes.setDisable(false);
            }
            if (game.getPlayer1ScoreCard().isThreeOfAKindLockedIn()) {
                buttonLockThreeOfAKind.setDisable(true);
            } else {
                buttonLockThreeOfAKind.setDisable(false);
            }
            if (game.getPlayer1ScoreCard().isFourOfAKindLockedIn()) {
                buttonLockFourOfAKind.setDisable(true);
            } else {
                buttonLockFourOfAKind.setDisable(false);
            }
            if (game.getPlayer1ScoreCard().isFullHouseLockedIn()) {
                butttonLockFullHouse.setDisable(true);
            } else {
                butttonLockFullHouse.setDisable(false);
            }
            if (game.getPlayer1ScoreCard().isSmallStraightLockedIn()) {
                buttonLockSMStraight.setDisable(true);
            } else {
                buttonLockSMStraight.setDisable(false);
            }
            if (game.getPlayer1ScoreCard().isLargeStraightLockedIn()) {
                buttonLockLGStraight.setDisable(true);
            } else {
                buttonLockLGStraight.setDisable(false);
            }
            if (game.getPlayer1ScoreCard().isYahtzeeLockedIn()) {
                buttonLockYahtzee.setDisable(true);
            } else {
                buttonLockYahtzee.setDisable(false);
            }
            if (game.getPlayer1ScoreCard().isChanceLockedIn()) {
                buttonLockChance.setDisable(true);
            } else {
                buttonLockChance.setDisable(false);
            }
        }
        if (!(game.isPlayerOnesTurnActive())) {
            if (game.getPlayer2ScoreCard().isAcesLockedIn()) {
                buttonLockAces.setDisable(true);
            } else {
                buttonLockAces.setDisable(false);
            }
            if (game.getPlayer2ScoreCard().isTwosLockedIn()) {
                buttonLockTwos.setDisable(true);
            } else {
                buttonLockTwos.setDisable(false);
            }
            if (game.getPlayer2ScoreCard().isThreesLockedIn()) {
                buttonLockThrees.setDisable(true);
            } else {
                buttonLockThrees.setDisable(false);
            }
            if (game.getPlayer2ScoreCard().isFoursLockedIn()) {
                buttonLockFours.setDisable(true);
            } else {
                buttonLockFours.setDisable(false);
            }
            if (game.getPlayer2ScoreCard().isFivesLockedIn()) {
                buttonLockFives.setDisable(true);
            } else {
                buttonLockFives.setDisable(false);
            }
            if (game.getPlayer2ScoreCard().isSixesLockedIn()) {
                buttonLockSixes.setDisable(true);
            } else {
                buttonLockSixes.setDisable(false);
            }
            if (game.getPlayer2ScoreCard().isThreeOfAKindLockedIn()) {
                buttonLockThreeOfAKind.setDisable(true);
            } else {
                buttonLockThreeOfAKind.setDisable(false);
            }
            if (game.getPlayer2ScoreCard().isFourOfAKindLockedIn()) {
                buttonLockFourOfAKind.setDisable(true);
            } else {
                buttonLockFourOfAKind.setDisable(false);
            }
            if (game.getPlayer2ScoreCard().isFullHouseLockedIn()) {
                butttonLockFullHouse.setDisable(true);
            } else {
                butttonLockFullHouse.setDisable(false);
            }
            if (game.getPlayer2ScoreCard().isSmallStraightLockedIn()) {
                buttonLockSMStraight.setDisable(true);
            } else {
                buttonLockSMStraight.setDisable(false);
            }
            if (game.getPlayer2ScoreCard().isLargeStraightLockedIn()) {
                buttonLockLGStraight.setDisable(true);
            } else {
                buttonLockLGStraight.setDisable(false);
            }
            if (game.getPlayer2ScoreCard().isYahtzeeLockedIn()) {
                buttonLockYahtzee.setDisable(true);
            } else {
                buttonLockYahtzee.setDisable(false);
            }
            if (game.getPlayer2ScoreCard().isChanceLockedIn()) {
                buttonLockChance.setDisable(true);
            } else {
                buttonLockChance.setDisable(false);
            }
        }
        if (game.getGamePhase() == 0) {
            buttonLockAces.setDisable(true);
            buttonLockTwos.setDisable(true);
            buttonLockThrees.setDisable(true);
            buttonLockFours.setDisable(true);
            buttonLockFives.setDisable(true);
            buttonLockSixes.setDisable(true);
            buttonLockThreeOfAKind.setDisable(true);
            buttonLockFourOfAKind.setDisable(true);
            butttonLockFullHouse.setDisable(true);
            buttonLockSMStraight.setDisable(true);
            buttonLockLGStraight.setDisable(true);
            buttonLockYahtzee.setDisable(true);
            buttonLockChance.setDisable(true);
        }
    }

    private void putDiceBackIntoPlay() {

        if (!(game.getPlayer1ScoreCard().isAcesLockedIn())) {
            game.getPlayer1ScoreCard().setAcesScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer1ScoreCard().isTwosLockedIn())) {
            game.getPlayer1ScoreCard().setTwosScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer1ScoreCard().isThreesLockedIn())) {
            game.getPlayer1ScoreCard().setThreesScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer1ScoreCard().isFoursLockedIn())) {
            game.getPlayer1ScoreCard().setFoursScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer1ScoreCard().isSixesLockedIn())) {
            game.getPlayer1ScoreCard().setSixesScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer1ScoreCard().isThreeOfAKindLockedIn())) {
            game.getPlayer1ScoreCard().setThreeOfAKindScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer1ScoreCard().isFourOfAKindLockedIn())) {
            game.getPlayer1ScoreCard().setFourOfAKindScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer1ScoreCard().isFullHouseLockedIn())) {
            game.getPlayer1ScoreCard().setFullHouseScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer1ScoreCard().isSmallStraightLockedIn())) {
            game.getPlayer1ScoreCard().setSmallStraightScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer1ScoreCard().isLargeStraightLockedIn())) {
            game.getPlayer1ScoreCard().setLargeStraightScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer1ScoreCard().isYahtzeeLockedIn())) {
            game.getPlayer1ScoreCard().setYahtzeeScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer1ScoreCard().isChanceLockedIn())) {
            game.getPlayer1ScoreCard().setChanceScore(0, 0, 0, 0, 0);
        }
        game.getPlayer1ScoreCard().setTotalScore();
        //-------------------
        if (!(game.getPlayer2ScoreCard().isAcesLockedIn())) {
            game.getPlayer2ScoreCard().setAcesScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer2ScoreCard().isTwosLockedIn())) {
            game.getPlayer2ScoreCard().setTwosScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer2ScoreCard().isThreesLockedIn())) {
            game.getPlayer2ScoreCard().setThreesScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer2ScoreCard().isFoursLockedIn())) {
            game.getPlayer2ScoreCard().setFoursScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer2ScoreCard().isSixesLockedIn())) {
            game.getPlayer2ScoreCard().setSixesScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer2ScoreCard().isThreeOfAKindLockedIn())) {
            game.getPlayer2ScoreCard().setThreeOfAKindScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer2ScoreCard().isFourOfAKindLockedIn())) {
            game.getPlayer2ScoreCard().setFourOfAKindScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer2ScoreCard().isFullHouseLockedIn())) {
            game.getPlayer2ScoreCard().setFullHouseScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer2ScoreCard().isSmallStraightLockedIn())) {
            game.getPlayer2ScoreCard().setSmallStraightScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer2ScoreCard().isLargeStraightLockedIn())) {
            game.getPlayer2ScoreCard().setLargeStraightScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer2ScoreCard().isYahtzeeLockedIn())) {
            game.getPlayer2ScoreCard().setYahtzeeScore(0, 0, 0, 0, 0);
        }
        if (!(game.getPlayer2ScoreCard().isChanceLockedIn())) {
            game.getPlayer2ScoreCard().setChanceScore(0, 0, 0, 0, 0);
        }
        game.getPlayer2ScoreCard().setTotalScore();
        //-----------
        updateAllLabels();
        game.resetGamePhase();
        boolean turnSwitchSuccess = false;
        if (game.isPlayerOnesTurnActive()) {
            game.setPlayerOnesTurnActive(false);
            turnSwitchSuccess = true;
        }
        if (!(game.isPlayerOnesTurnActive()) && turnSwitchSuccess == false) {
            game.setPlayerOnesTurnActive(true);
        }
        game.getDice1().setInPlay(true);
        game.getDice2().setInPlay(true);
        game.getDice3().setInPlay(true);
        game.getDice4().setInPlay(true);
        game.getDice5().setInPlay(true);
    }

    @FXML
    private void lockAces(ActionEvent event) {
        if (game.isPlayerOnesTurnActive()) {
            game.getPlayer1ScoreCard().setAcesLockedIn(true);
        }
        if (!(game.isPlayerOnesTurnActive())) {
            game.getPlayer2ScoreCard().setAcesLockedIn(true);
        }
        putDiceBackIntoPlay();
        updateScoreCardUI();
    }

    @FXML
    private void lockTwos(ActionEvent event) {
        if (game.isPlayerOnesTurnActive()) {
            game.getPlayer1ScoreCard().setTwosLockedIn(true);
        }
        if (!(game.isPlayerOnesTurnActive())) {
            game.getPlayer2ScoreCard().setTwosLockedIn(true);
        }
        putDiceBackIntoPlay();
        updateScoreCardUI();
    }

    @FXML
    private void LockThrees(ActionEvent event) {
        if (game.isPlayerOnesTurnActive()) {
            game.getPlayer1ScoreCard().setThreesLockedIn(true);
        }
        if (!(game.isPlayerOnesTurnActive())) {
            game.getPlayer2ScoreCard().setThreesLockedIn(true);
        }
        putDiceBackIntoPlay();
        updateScoreCardUI();
    }

    @FXML
    private void lockFours(ActionEvent event) {
        if (game.isPlayerOnesTurnActive()) {
            game.getPlayer1ScoreCard().setFoursLockedIn(true);
        }
        if (!(game.isPlayerOnesTurnActive())) {
            game.getPlayer2ScoreCard().setFoursLockedIn(true);
        }
        putDiceBackIntoPlay();
        updateScoreCardUI();
    }

    @FXML
    private void lockFives(ActionEvent event) {
        if (game.isPlayerOnesTurnActive()) {
            game.getPlayer1ScoreCard().setFivesLockedIn(true);
        }
        if (!(game.isPlayerOnesTurnActive())) {
            game.getPlayer2ScoreCard().setFivesLockedIn(true);
        }
        putDiceBackIntoPlay();
        updateScoreCardUI();
    }

    @FXML
    private void lockSixes(ActionEvent event) {
        if (game.isPlayerOnesTurnActive()) {
            game.getPlayer1ScoreCard().setSixesLockedIn(true);
        }
        if (!(game.isPlayerOnesTurnActive())) {
            game.getPlayer2ScoreCard().setSixesLockedIn(true);
        }
        putDiceBackIntoPlay();
        updateScoreCardUI();
    }

    @FXML
    private void lockThreeOfAKind(ActionEvent event) {
        if (game.isPlayerOnesTurnActive()) {
            game.getPlayer1ScoreCard().setThreeOfAKindLockedIn(true);
        }
        if (!(game.isPlayerOnesTurnActive())) {
            game.getPlayer2ScoreCard().setThreeOfAKindLockedIn(true);
        }
        putDiceBackIntoPlay();
        updateScoreCardUI();
    }

    @FXML
    private void lockFourOfAKind(ActionEvent event) {
        if (game.isPlayerOnesTurnActive()) {
            game.getPlayer1ScoreCard().setFourOfAKindLockedIn(true);
        }
        if (!(game.isPlayerOnesTurnActive())) {
            game.getPlayer2ScoreCard().setFourOfAKindLockedIn(true);
        }
        putDiceBackIntoPlay();
        updateScoreCardUI();
    }

    @FXML
    private void lockFullHouse(ActionEvent event) {
        if (game.isPlayerOnesTurnActive()) {
            game.getPlayer1ScoreCard().setFullHouseLockedIn(true);
        }
        if (!(game.isPlayerOnesTurnActive())) {
            game.getPlayer2ScoreCard().setFullHouseLockedIn(true);
        }
        putDiceBackIntoPlay();
        updateScoreCardUI();
    }

    @FXML
    private void lockSMStraight(ActionEvent event) {
        if (game.isPlayerOnesTurnActive()) {
            game.getPlayer1ScoreCard().setSmallStraightLockedIn(true);
        }
        if (!(game.isPlayerOnesTurnActive())) {
            game.getPlayer2ScoreCard().setSmallStraightLockedIn(true);
        }
        putDiceBackIntoPlay();
        updateScoreCardUI();
    }

    @FXML
    private void lockLGStraight(ActionEvent event) {
        if (game.isPlayerOnesTurnActive()) {
            game.getPlayer1ScoreCard().setLargeStraightLockedIn(true);
        }
        if (!(game.isPlayerOnesTurnActive())) {
            game.getPlayer2ScoreCard().setLargeStraightLockedIn(true);
        }
        putDiceBackIntoPlay();
        updateScoreCardUI();
    }

    @FXML
    private void lockYahtzee(ActionEvent event) {
        if (game.isPlayerOnesTurnActive()) {
            game.getPlayer1ScoreCard().setYahtzeeLockedIn(true);
        }
        if (!(game.isPlayerOnesTurnActive())) {
            game.getPlayer2ScoreCard().setYahtzeeLockedIn(true);
        }
        putDiceBackIntoPlay();
        updateScoreCardUI();
    }

    @FXML
    private void lockChance(ActionEvent event) {
        if (game.isPlayerOnesTurnActive()) {
            game.getPlayer1ScoreCard().setChanceLockedIn(true);
        }
        if (!(game.isPlayerOnesTurnActive())) {
            game.getPlayer2ScoreCard().setChanceLockedIn(true);
        }
        putDiceBackIntoPlay();
        updateScoreCardUI();
    }

}
