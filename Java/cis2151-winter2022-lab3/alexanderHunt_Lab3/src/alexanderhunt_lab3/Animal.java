package alexanderhunt_lab3;

public class Animal {

    private String name;
    private String color;
    private double weightInKilograms;
    private String noise;
    private double foodWasteFactor;

    //Constructor->
    public Animal(String name, String color, int weightInKilograms, String noise, double foodWasteFactor) {
        this.name = name;
        this.color = color;
        this.weightInKilograms = weightInKilograms;
        this.noise = noise;
        this.foodWasteFactor = foodWasteFactor;
    }
    //Constructor^^

    //Getters->
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeightInKilograms() {
        return weightInKilograms;
    }

    public String getNoise() {
        return noise;
    }

    public double getFoodWasteFactor() {
        return foodWasteFactor;
    }
    //Getters^^

    //Setters->
    public void setFoodWasteFactor(double foodWasteFactor) {
        if (foodWasteFactor >= 0 && foodWasteFactor <= 1) {
            this.foodWasteFactor = foodWasteFactor;
        }
    }
    //^^Setters^^

    //Misc Methods->
    public void eat(double weightOfFoodInKilograms) {
        weightInKilograms = (weightInKilograms + ((1 - foodWasteFactor) * weightOfFoodInKilograms));
    }
}
