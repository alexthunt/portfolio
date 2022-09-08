package finalproject;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Final_ProjectController implements Initializable {

    int playerLocationRoomNumber = 1;
    int playerLocationXCoordinate = 1;
    int playerLocationYCoordinate = 1;
    class_room[][] roomCoordinate = new class_room[10][10];
    String playerMoveDirection = "";
    Random randomClass = new Random();
    String mainCharacterStrength;
    String mainCharacterDexterity;
    String mainCharacterIntelligence;
    class_enemy enemy = new class_enemy(0, 0, 0, 0);
    class_playerCharacter mainCharacter = new class_playerCharacter(0, 0, 0);

    @FXML
    private Button northButton;
    @FXML
    private Button southButton;
    @FXML
    private Button westButton;
    @FXML
    private Button eastButton;
    @FXML
    private Label labelX;
    @FXML
    private Label labelY;
    @FXML
    private Label labelRoomNumber;
    @FXML
    private Label roomBlockedLabel;
    @FXML
    private Label playerStrengthLabel;
    @FXML
    private Label playerDexterityLabel;
    @FXML
    private Label playerIntelligenceLabel;
    @FXML
    private Label playerGoldLabel;
    @FXML
    private Label enemyStrengthLabel;
    @FXML
    private Label enemyDexterityLabel;
    @FXML
    private Label enemyIntelligenceLabel;
    @FXML
    private Label enemyHealthLabel;
    @FXML
    private Label playerHealthLabel;
    @FXML
    private Button attackButton;
    @FXML
    private Button runButton;
    @FXML
    private Label battleOutcomeLabel;
    @FXML
    private Button sleepButton;
    @FXML
    private Button lootButton;
    @FXML
    private Label r1;
    @FXML
    private Label r2;
    @FXML
    private Label r3;
    @FXML
    private Label r4;
    @FXML
    private Label r5;
    @FXML
    private Label r6;
    @FXML
    private Label r7;
    @FXML
    private Label r8;
    @FXML
    private Label r9;
    @FXML
    private Label r10;
    @FXML
    private Label r11;
    @FXML
    private Label r12;
    @FXML
    private Label r13;
    @FXML
    private Label r14;
    @FXML
    private Label r15;
    @FXML
    private Label r16;
    @FXML
    private Label r17;
    @FXML
    private Label r18;
    @FXML
    private Label r19;
    @FXML
    private Label r20;
    @FXML
    private Label r93;
    @FXML
    private Label r21;
    @FXML
    private Label r22;
    @FXML
    private Label r23;
    @FXML
    private Label r24;
    @FXML
    private Label r25;
    @FXML
    private Label r26;
    @FXML
    private Label r27;
    @FXML
    private Label r28;
    @FXML
    private Label r29;
    @FXML
    private Label r30;
    @FXML
    private Label r31;
    @FXML
    private Label r32;
    @FXML
    private Label r33;
    @FXML
    private Label r34;
    @FXML
    private Label r35;
    @FXML
    private Label r36;
    @FXML
    private Label r37;
    @FXML
    private Label r38;
    @FXML
    private Label r39;
    @FXML
    private Label r40;
    @FXML
    private Label r41;
    @FXML
    private Label r42;
    @FXML
    private Label r43;
    @FXML
    private Label r44;
    @FXML
    private Label r45;
    @FXML
    private Label r46;
    @FXML
    private Label r47;
    @FXML
    private Label r48;
    @FXML
    private Label r49;
    @FXML
    private Label r50;
    @FXML
    private Label r51;
    @FXML
    private Label r52;
    @FXML
    private Label r53;
    @FXML
    private Label r54;
    @FXML
    private Label r55;
    @FXML
    private Label r56;
    @FXML
    private Label r57;
    @FXML
    private Label r58;
    @FXML
    private Label r59;
    @FXML
    private Label r60;
    @FXML
    private Label r61;
    @FXML
    private Label r62;
    @FXML
    private Label r63;
    @FXML
    private Label r64;
    @FXML
    private Label r65;
    @FXML
    private Label r66;
    @FXML
    private Label r67;
    @FXML
    private Label r68;
    @FXML
    private Label r69;
    @FXML
    private Label r70;
    @FXML
    private Label r71;
    @FXML
    private Label r72;
    @FXML
    private Label r73;
    @FXML
    private Label r74;
    @FXML
    private Label r75;
    @FXML
    private Label r76;
    @FXML
    private Label r77;
    @FXML
    private Label r78;
    @FXML
    private Label r79;
    @FXML
    private Label r80;
    @FXML
    private Label r81;
    @FXML
    private Label r82;
    @FXML
    private Label r83;
    @FXML
    private Label r84;
    @FXML
    private Label r85;
    @FXML
    private Label r86;
    @FXML
    private Label r87;
    @FXML
    private Label r88;
    @FXML
    private Label r89;
    @FXML
    private Label r90;
    @FXML
    private Label r91;
    @FXML
    private Label r92;
    @FXML
    private Label r94;
    @FXML
    private Label r95;
    @FXML
    private Label r96;
    @FXML
    private Label r97;
    @FXML
    private Label r98;
    @FXML
    private Label r99;
    @FXML
    private Label r100;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initializeRoomObjects();
        initializePlayerStats();
        initializeBattleOptions();
    }

    private void initializeBattleOptions() {
        attackButton.setDisable(true);
        runButton.setDisable(true);
    }

    private void playerBeginsNewTurn() {
        checkIfRoomIsBlockedAndMoveIfNot();
        updatePlayersCoordinatesHUD();
        updatePlayerOccupiedRoomSerialNumberHud();
        disableButtonsIfOnEdgeOfMap();
        battleStart();
    }

    private void initializePlayerStats() {
        int strength = (randomClass.nextInt(5) + 1) + (randomClass.nextInt(5) + 1) + (randomClass.nextInt(5) + 1);
        int dexterity = (randomClass.nextInt(5) + 1) + (randomClass.nextInt(5) + 1) + (randomClass.nextInt(5) + 1);
        int intelligence = (randomClass.nextInt(5) + 1) + (randomClass.nextInt(5) + 1) + (randomClass.nextInt(5) + 1);
        mainCharacter.setStrength(strength);
        mainCharacter.setDexterity(dexterity);
        mainCharacter.setIntelligence(intelligence);
        mainCharacterStrength = String.valueOf(mainCharacter.getStrength());
        mainCharacterDexterity = String.valueOf(mainCharacter.getDexterity());
        mainCharacterIntelligence = String.valueOf(mainCharacter.getIntelligence());
        playerStrengthLabel.setText(mainCharacterStrength);
        playerDexterityLabel.setText(mainCharacterDexterity);
        playerIntelligenceLabel.setText(mainCharacterIntelligence);
    }

    private void updatePlayerOccupiedRoomSerialNumberHud() {
        int roomNumber = roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation();
        String stringRoomNumber = String.valueOf(roomNumber);
        labelRoomNumber.setText(stringRoomNumber);
    }

    private void battleStart() {
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].isNPCPresent()) {
            sleepButton.setDisable(true);
            lootButton.setDisable(true);
            northButton.setDisable(true);
            southButton.setDisable(true);
            eastButton.setDisable(true);
            westButton.setDisable(true);
            int enemyHPNumber = (randomClass.nextInt(5) + 1);
            int enemyStats = enemyHPNumber * 2;
            enemy.setStrength(enemyStats);
            enemy.setDexterity(enemyStats);
            enemy.setIntelligence(enemyStats);
            enemy.initializeHitPoint(enemyHPNumber);
            String enemyStrength = String.valueOf(enemy.getStrength());
            String enemyDexterity = String.valueOf(enemy.getDexterity());
            String enemyIntelligance = String.valueOf(enemy.getIntelligence());
            String enemyHealth = String.valueOf(enemy.getHitPoints());
            enemyStrengthLabel.setText(enemyStrength);
            enemyDexterityLabel.setText(enemyDexterity);
            enemyIntelligenceLabel.setText(enemyIntelligance);
            enemyHealthLabel.setText(enemyHealth);
            attackButton.setDisable(false);
            runButton.setDisable(false);
        }
    }

    private void checkIfRoomIsBlockedAndMoveIfNot() {
        int playerPotentialYCoordinate = playerLocationYCoordinate;
        int playerPotentialXCoorditate = playerLocationXCoordinate;
        if (playerMoveDirection.equalsIgnoreCase("North")) {
            playerPotentialYCoordinate = playerPotentialYCoordinate - 1;
        } else if (playerMoveDirection.equalsIgnoreCase("South")) {
            playerPotentialYCoordinate = playerPotentialYCoordinate + 1;
        } else if (playerMoveDirection.equalsIgnoreCase("East")) {
            playerPotentialXCoorditate = playerPotentialXCoorditate + 1;
        } else if (playerMoveDirection.equalsIgnoreCase("West")) {
            playerPotentialXCoorditate = playerPotentialXCoorditate - 1;
        }
        if (!(roomCoordinate[playerPotentialYCoordinate][playerPotentialXCoorditate].isBlocked())) {
            playerLocationXCoordinate = playerPotentialXCoorditate;
            playerLocationYCoordinate = playerPotentialYCoordinate;
            roomBlockedLabel.setText("");
        } else {
            roomBlockedLabel.setText("Blocked Room");
        }

    }

    private void updatePlayersCoordinatesHUD() {
        int updateCoordinatesForUserX = playerLocationXCoordinate + 1;
        String intToStringX = String.valueOf(updateCoordinatesForUserX);
        labelX.setText(intToStringX);

        int updateCoordinatesForUserY = playerLocationYCoordinate + 1;
        String intToStringY = String.valueOf(updateCoordinatesForUserY);
        labelY.setText(intToStringY);
    }

    /*
    private void initializeRoomNumbers() {
        int numberToInsert = 1;
        int verticalCoordinate = 0;
        int horizontalCoordinate = 0;
        boolean alldone = false;
        while (!alldone) {
            if (horizontalCoordinate < 10) {
                roomArray[verticalCoordinate][horizontalCoordinate] = numberToInsert;
                horizontalCoordinate = horizontalCoordinate + 1;
                numberToInsert = numberToInsert + 1;
            } else if (horizontalCoordinate == 10) {
                horizontalCoordinate = 0;
                verticalCoordinate = verticalCoordinate + 1;
                if (verticalCoordinate == 10) {
                    alldone = true;
                }
            }
        }
    }
     */
    private void initializeRoomObjects() {

        int rowIndex = 0;
        int columnIndex = 0;
        int roomNumber = 1;
        boolean roomIsBlocked = false;
        boolean enemyIsPresent = false;
        int randomNumber = 0;
        while (columnIndex <= 9) {
            while (rowIndex <= 9) {
                randomNumber = randomClass.nextInt(10);
                if (randomNumber == 0) {
                    roomIsBlocked = true;
                }
                randomNumber = randomClass.nextInt(2);
                if (randomNumber == 1) {
                    enemyIsPresent = true;
                }
                randomNumber = randomClass.nextInt(100);
                roomCoordinate[columnIndex][rowIndex] = new class_room(roomIsBlocked, roomNumber, enemyIsPresent, randomNumber);
                rowIndex++;
                roomNumber++;
                roomIsBlocked = false;
                enemyIsPresent = false;
            }
            columnIndex++;
            rowIndex = 0;
        }

        /*
        for (int rowIndex = 0; rowIndex < roomCoordinate.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < roomCoordinate[rowIndex].length; columnIndex++) {
                roomCoordinate [rowIndex][columnIndex] = new class_room(true, 1, false, 1);
                
            }
        }
         */
    }

    private void disableButtonsIfOnEdgeOfMap() {
        if (playerLocationYCoordinate == 0) {
            northButton.setDisable(true);
        }
        if (playerLocationYCoordinate < 9) {
            southButton.setDisable(false);
        }
        if (playerLocationYCoordinate == 9) {
            southButton.setDisable(true);
        }
        if (playerLocationYCoordinate > 0) {
            northButton.setDisable(false);
        }
        if (playerLocationXCoordinate == 0) {
            westButton.setDisable(true);
        }
        if (playerLocationXCoordinate < 9) {
            eastButton.setDisable(false);
        }
        if (playerLocationXCoordinate == 9) {
            eastButton.setDisable(true);
        }
        if (playerLocationXCoordinate > 0) {
            westButton.setDisable(false);
        }
    }

    @FXML
    private void moveNorth(ActionEvent event) {
        attackButton.setDisable(true);
        runButton.setDisable(true);
        battleOutcomeLabel.setText("");
        playerMoveDirection = "North";
        playerBeginsNewTurn();
    }

    @FXML
    private void moveSouth(ActionEvent event) {
        attackButton.setDisable(true);
        runButton.setDisable(true);
        battleOutcomeLabel.setText("");
        playerMoveDirection = "South";
        playerBeginsNewTurn();
    }

    @FXML
    private void moveWest(ActionEvent event) {
        attackButton.setDisable(true);
        runButton.setDisable(true);
        battleOutcomeLabel.setText("");
        playerMoveDirection = "West";
        playerBeginsNewTurn();
    }

    @FXML
    private void moveEast(ActionEvent event) {
        attackButton.setDisable(true);
        runButton.setDisable(true);
        battleOutcomeLabel.setText("");
        playerMoveDirection = "East";
        playerBeginsNewTurn();
    }

    @FXML
    private void attackAction(ActionEvent event) {
        //player attacks
        int hitRoll = randomClass.nextInt(20) + 1;
        if (hitRoll >= enemy.getDexterity()) {
            enemy.setHitPoints(mainCharacter.getStrength() / 3);
            String enemyHealth = String.valueOf(enemy.getHitPoints());
            enemyHealthLabel.setText(enemyHealth);
        }
        //enemy attacks
        hitRoll = randomClass.nextInt(20) + 1;
        if (hitRoll >= mainCharacter.getDexterity() && enemy.getHitPoints() >= 1) {
            mainCharacter.setHitPoints(enemy.getStrength() / 3);
            String playerHealth = String.valueOf(mainCharacter.getHitPoints());
            playerHealthLabel.setText(playerHealth);
        }
        //defeat
        if (mainCharacter.getHitPoints() <= 0) {
            battleOutcomeLabel.setText("You are Dead.");
            attackButton.setDisable(true);
            runButton.setDisable(true);
        }
        //victory
        if (enemy.getHitPoints() <= 0) {
            battleOutcomeLabel.setText("You have Won.");
            sleepButton.setDisable(false);
            enemyHealthLabel.setText("");
            enemyDexterityLabel.setText("");
            enemyIntelligenceLabel.setText("");
            enemyStrengthLabel.setText("");
            lootButton.setDisable(false);
            attackButton.setDisable(true);
            runButton.setDisable(true);
            if (playerLocationYCoordinate >= 1) {
                northButton.setDisable(false);
            }
            if (playerLocationYCoordinate <= 8) {
                southButton.setDisable(false);
            }
            if (playerLocationXCoordinate <= 8) {
                eastButton.setDisable(false);
            }
            if (playerLocationXCoordinate >= 1) {
                westButton.setDisable(false);
            }
            roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].isNPCPresent(false);
        }
    }

    @FXML
    private void runAction(ActionEvent event) {
        int monsterInsightRoll = randomClass.nextInt(20) + 1;
        if (monsterInsightRoll < enemy.getIntelligence()) {
            int hitRoll = randomClass.nextInt(20) + 1;
            if (hitRoll >= mainCharacter.getDexterity() && enemy.getHitPoints() >= 1) {
                mainCharacter.setHitPoints(enemy.getStrength() / 3);
                String playerHealth = String.valueOf(mainCharacter.getHitPoints());
                playerHealthLabel.setText(playerHealth);
            }
        }
        enemyHealthLabel.setText("");
        enemyDexterityLabel.setText("");
        enemyIntelligenceLabel.setText("");
        enemyStrengthLabel.setText("");
        northButton.setDisable(false);
        southButton.setDisable(false);
        eastButton.setDisable(false);
        westButton.setDisable(false);
    }

    @FXML
    private void sleepAction(ActionEvent event) {
        int enemyAmbushRoll = randomClass.nextInt(6) + 1;
        battleOutcomeLabel.setText("");
        if (enemyAmbushRoll == 3) {
            battleOutcomeLabel.setText("Enemy Ambush!");
            roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].isNPCPresent(true);
            battleStart();
        }
        if (enemyAmbushRoll != 3) {
            mainCharacter.healToFull();
            playerHealthLabel.setText("20");
        }
    }

    @FXML
    private void lootAction(ActionEvent event) {
        int insightcheck = randomClass.nextInt(20) + 1;
        if (insightcheck < mainCharacter.getIntelligence()) {
            int goldInRoom = roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getGold();
            mainCharacter.setPlayerGold(goldInRoom);
            String playersTotalGold = String.valueOf(mainCharacter.getPlayerGold());
            playerGoldLabel.setText(playersTotalGold);
        }
        roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].setGold(0);
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 1) {
            r1.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 2) {
            r2.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 3) {
            r3.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 4) {
            r4.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 5) {
            r5.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 6) {
            r6.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 7) {
            r7.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 8) {
            r8.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 9) {
            r9.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 10) {
            r10.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 11) {
            r11.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 12) {
            r12.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 13) {
            r13.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 14) {
            r14.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 15) {
            r15.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 16) {
            r16.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 17) {
            r17.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 18) {
            r18.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 19) {
            r19.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 20) {
            r20.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 21) {
            r21.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 22) {
            r22.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 23) {
            r23.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 24) {
            r24.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 25) {
            r25.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 26) {
            r26.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 27) {
            r27.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 28) {
            r28.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 29) {
            r29.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 30) {
            r30.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 31) {
            r31.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 32) {
            r32.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 33) {
            r33.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 34) {
            r34.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 35) {
            r35.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 36) {
            r36.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 37) {
            r37.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 38) {
            r38.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 39) {
            r39.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 40) {
            r40.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 41) {
            r41.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 42) {
            r42.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 43) {
            r43.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 43) {
            r43.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 44) {
            r44.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 45) {
            r45.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 46) {
            r46.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 47) {
            r47.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 48) {
            r48.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 49) {
            r49.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 50) {
            r50.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 51) {
            r51.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 52) {
            r52.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 53) {
            r53.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 54) {
            r54.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 55) {
            r55.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 56) {
            r56.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 57) {
            r57.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 58) {
            r58.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 59) {
            r59.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 60) {
            r60.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 61) {
            r61.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 62) {
            r62.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 63) {
            r63.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 64) {
            r64.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 65) {
            r65.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 66) {
            r66.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 67) {
            r67.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 68) {
            r68.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 69) {
            r69.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 70) {
            r70.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 71) {
            r71.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 72) {
            r72.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 73) {
            r73.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 74) {
            r74.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 75) {
            r75.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 76) {
            r76.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 77) {
            r77.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 78) {
            r78.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 79) {
            r79.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 80) {
            r80.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 81) {
            r81.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 82) {
            r82.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 83) {
            r83.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 84) {
            r84.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 85) {
            r85.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 86) {
            r86.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 87) {
            r87.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 88) {
            r88.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 89) {
            r89.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 90) {
            r90.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 91) {
            r91.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 92) {
            r92.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 93) {
            r93.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 94) {
            r94.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 95) {
            r95.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 96) {
            r96.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 97) {
            r97.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 98) {
            r98.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 99) {
            r99.setText("O");
        }
        if (roomCoordinate[playerLocationYCoordinate][playerLocationXCoordinate].getLocation() == 100) {
            r100.setText("O");
        }
    }
}
