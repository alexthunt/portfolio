package lab6unittests;

public class Item {

    private String name;
    private int quantity;
    private double price;
    /*This is the only way I know how to do this*/private String toStringNameAndPrice = "Uninitialized";

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String priceToString = String.valueOf(price);
        toStringNameAndPrice = name + " " + priceToString;
        return toStringNameAndPrice;
    }

    public boolean purchase(int purchaseQuantity) {
        if (purchaseQuantity <= quantity) {
            quantity = quantity - purchaseQuantity;
            return true;
        }
        return false;
    }
}
