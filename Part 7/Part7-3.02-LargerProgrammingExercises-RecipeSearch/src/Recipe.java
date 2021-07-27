import java.util.ArrayList;

public class Recipe {
    private String recipeName;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String recipeName, int cookingTime, ArrayList<String> ingredients) {
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return this.recipeName + ", cooking time: " + this.cookingTime;
    }
}
