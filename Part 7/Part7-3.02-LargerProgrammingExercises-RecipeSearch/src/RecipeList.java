import java.util.ArrayList;

public class RecipeList {
    private ArrayList<Recipe> recipeList;

    public RecipeList() {
        this.recipeList = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipeList.add(recipe);
    }

    public void printByName(String name) {
        for (Recipe recipe: recipeList) {
            if (recipe.getRecipeName().contains(name)) {
                System.out.println(recipe);
            }
        }
        System.out.println();
    }

    public void printByTime(int time) {
        for (Recipe recipe: recipeList) {
            if (recipe.getCookingTime() <= time) {
                System.out.println(recipe);
            }
        }
        System.out.println();
    }

    public void printByIngredient(String ingredient) {
        for (Recipe recipe: recipeList) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
        System.out.println();
    }

    public void printRecipeList() {
        System.out.println("Recipes: ");
        for (Recipe recipe: recipeList) {
            System.out.println(recipe);
        }
        System.out.println();
    }
}
