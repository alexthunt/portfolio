package project3;

public class Ticket {
    private String guestName;
    private int seatNumber;
    private int confirmationCode;

    public Ticket(String guestName, int seatNumber, int confirmationCode) {
        this.guestName = guestName;
        this.seatNumber = seatNumber;
        this.confirmationCode = confirmationCode;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getConfirmationCode() {
        return confirmationCode;
    }

    public void setConfirmationCode(int confirmationCode) {
        this.confirmationCode = confirmationCode;
    }
    
    
}
