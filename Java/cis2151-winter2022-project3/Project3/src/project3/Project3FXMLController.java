package project3;

import java.net.URL;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Project3FXMLController implements Initializable {

    public static String fileName = "theater.db";
    Random rand = new Random();
    ArrayList<Integer> takenSeats = new ArrayList<>();
    //MMWAAHAHAHA I HAVE MASTERED ARRAYLISTS<>() AND FOR(x;x;x){} LOOPS!!!

    @FXML
    private Label outputLabel;
    @FXML
    private TextField seatNumberField;
    @FXML
    private TextField nameField;
    @FXML
    private Label returnLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        outputLabel.setText("");
        returnLabel.setText("");
    }

    @FXML
    private void buttonPressBuyTicket(ActionEvent event) {
        int number = Integer.parseInt(seatNumberField.getText());
        boolean seatTaken = false;
        for (int index = 0; index < takenSeats.size(); index++) {
            if (number == takenSeats.get(index)) {
                seatTaken = true;
            }
        }
        if (seatTaken == false) {
            takenSeats.add(number);
            String name = nameField.getText();
            int confirmationCode = (rand.nextInt(900000)) + 100001;
            Ticket thisTicket = new Ticket(name, number, confirmationCode);
            addItemToDatabase(thisTicket);
        }
    }

    @FXML
    private void buttonPressReturnATicket(ActionEvent event) {
        int number = Integer.parseInt(seatNumberField.getText());
        for (int index = 0; index < takenSeats.size(); index++) {
            if (number == takenSeats.get(index)) {
                takenSeats.remove(index);
                Ticket thisTicket = new Ticket("", number, 1);
                deleteItemInDatabase(thisTicket);
            }
        }
    }

    @FXML
    private void buttonPressReport(ActionEvent event) {
        ArrayList<Ticket> list = new ArrayList<>();
        list = getTicketsFromDatabase();
        String listOfTickets = "";

        for (int index = 0; index < list.size(); index++) {
            String seatNumber = String.valueOf(list.get(index).getSeatNumber());
            String personName = list.get(index).getGuestName();
            String confirmationCode = String.valueOf(list.get(index).getConfirmationCode());
            listOfTickets = listOfTickets.concat(seatNumber + " " + personName + " " + confirmationCode + "\n");
        }

        returnLabel.setText(listOfTickets);
    }

    public static void addItemToDatabase(Ticket ticket) {

        String url = "jdbc:sqlite:D:/1_Programming/Java/Github Repositories/cis2151-winter2022-project3-Bellerophonn/sqlite/db/" + fileName;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                String preparedSql = "insert into ticket (seat_number, guest_name, confirmation_code) values ( " + " ?, ?, ? )";
                PreparedStatement statement = conn.prepareStatement(preparedSql);
                statement.setInt(1, ticket.getSeatNumber());
                statement.setString(2, ticket.getGuestName());
                statement.setInt(3, ticket.getConfirmationCode());
                statement.executeUpdate();
                statement.close();
            }
        } catch (SQLException e) {
            System.out.println("An exception has occured... --> " + e.getMessage());
        }
    }

    public static void deleteItemInDatabase(Ticket ticket) {

        String url = "jdbc:sqlite:D:/1_Programming/Java/Github Repositories/cis2151-winter2022-project3-Bellerophonn/sqlite/db/" + fileName;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                String preparedSql = "delete from ticket where seat_number = ?";
                PreparedStatement statement = conn.prepareStatement(preparedSql);
                statement.setString(1, String.valueOf(ticket.getSeatNumber()));
                statement.executeUpdate();
                statement.close();
            }
        } catch (SQLException e) {
            System.out.println("An exception has occured... --> " + e.getMessage());
        }
    }

    public static ArrayList<Ticket> getTicketsFromDatabase() {
        ArrayList<Ticket> ticketsList = new ArrayList<>();

        String url = "jdbc:sqlite:D:/1_Programming/Java/Github Repositories/cis2151-winter2022-project3-Bellerophonn/sqlite/db/" + fileName;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();

                Statement statement = conn.createStatement();

                //select list of fields from tablename
                String query = "select seat_number, guest_name, confirmation_code from ticket";
                ResultSet tickets = statement.executeQuery(query);
                while (tickets.next()) {
                    Ticket ticket = new Ticket(tickets.getString("guest_name"), tickets.getInt("seat_number"), tickets.getInt("confirmation_code"));
                    ticketsList.add(ticket);
                }
                statement.close();
            }

        } catch (SQLException e) {
            System.out.println("An exception has occured... -->" + e.getMessage());
        }
        return ticketsList;
    }

}
