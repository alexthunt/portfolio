package lab4;

import java.util.logging.Logger;

public class Item {

    private String name;
    private double price;
    private int quantity;
    //Constructor Below
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //Constructor Above
    //Getters Below
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    //Getters Above
    //Setters Below
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //Setters Above
    //Misc Methods Below
    public double getTotalPrice() {
        double totalPrice;
        totalPrice = price*quantity;
        return totalPrice;
    }
    //Misc Methods Above
}
