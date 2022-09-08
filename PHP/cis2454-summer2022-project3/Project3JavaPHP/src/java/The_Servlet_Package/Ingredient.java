package The_Servlet_Package;

public class Ingredient {
    private String name;
    private String measure;
    private double Quantity;

    public Ingredient() {
    }

    public Ingredient(String name, String measure, double Quantity) {
        this.name = name;
        this.measure = measure;
        this.Quantity = Quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public double getQuantity() {
        return Quantity;
    }

    public void setQuantity(double Quantity) {
        this.Quantity = Quantity;
    }
    
    
}
