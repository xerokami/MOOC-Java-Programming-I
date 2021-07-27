import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeList recipeList = new RecipeList();

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        String filePath = "Part7-3.02-LargerProgrammingExercises-RecipeSearch/" + fileName;

        try (Scanner fileScan = new Scanner(Paths.get(filePath))) {
            ArrayList<String> lines = new ArrayList<>();

            while(fileScan.hasNextLine()) {
                String line = fileScan.nextLine();

                if (line.trim().isEmpty() || !fileScan.hasNextLine()) {
                    String recipeName = lines.get(0);
                    int cookingTime = Integer.valueOf(lines.get(1));

                    ArrayList<String> ingredientList = new ArrayList<>();

                    for (int i = 2; i < lines.size(); i++) {
                        ingredientList.add(lines.get(i));
                    }

                    recipeList.addRecipe(new Recipe(recipeName, cookingTime, ingredientList));
                    lines.removeAll(lines);
                } else {
                    lines.add(line);
                }
            }

        } catch (Exception error) {
            System.out.println("Error finding file: " + error.getMessage());
        }

        UserInterface ui = new UserInterface(scanner, recipeList);
        ui.start();
    }
}
