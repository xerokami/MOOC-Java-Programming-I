import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private RecipeList recipeList;

    public UserInterface(Scanner scanner, RecipeList recipeList) {
        this.scanner = scanner;
        this.recipeList = recipeList;
    }

    public void start() {
        boolean looping = true;
        commandMenu();

        while (looping) {
            System.out.print("Enter command: ");
            String commandChoice = scanner.nextLine();

            switch (commandChoice) {
                case "list":
                    recipeList.printRecipeList();
                    break;
                case "stop":
                    looping = false;
                    break;
                case "find name":
                    System.out.print("Searched word: ");
                    String nameToFind = scanner.nextLine();

                    recipeList.printByName(nameToFind);
                    break;
                case "find cooking time":
                    System.out.print("Max cooking time: ");
                    int timeToFind = Integer.valueOf(scanner.nextLine());

                    recipeList.printByTime(timeToFind);
                    break;
                case "find ingredient":
                    System.out.print("Ingredient: ");
                    String ingredient = scanner.nextLine();

                    recipeList.printByIngredient(ingredient);
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }

    public void commandMenu() {
        String menu = "Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient\n";

        System.out.println(menu);
    }
}
