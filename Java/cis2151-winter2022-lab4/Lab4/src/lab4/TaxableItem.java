
package lab4;

public class TaxableItem extends Item {
    //superclass constructor must be called
    private double taxRate;

    public TaxableItem(double taxRate, String name, double price, int quantity) {
        super(name, price, quantity);
        this.taxRate = taxRate;
    }
    
    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
    
    @Override
    public double getTotalPrice () {
        double price = super.getPrice();
        int quantity = super.getQuantity();
        double taxOwed = (taxRate*(price*quantity));
        double totalPrice = taxOwed + (price*quantity);
        return totalPrice;
    }
}
