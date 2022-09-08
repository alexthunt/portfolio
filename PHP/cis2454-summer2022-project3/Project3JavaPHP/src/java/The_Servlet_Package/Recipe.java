package The_Servlet_Package;

import java.util.ArrayList;

public class Recipe {
    private ArrayList<Ingredient> ingredients;
    private String directions;

    public Recipe() {
    }

    public Recipe(ArrayList<Ingredient> ingredients, String directions) {
        this.ingredients = ingredients;
        this.directions = directions;
    }
    
    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }
    
    
}
