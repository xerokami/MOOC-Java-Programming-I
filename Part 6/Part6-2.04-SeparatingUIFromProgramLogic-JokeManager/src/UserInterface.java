import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }

    public void start() {
        boolean looping = true;

        while(looping) {
            System.out.println(menu());
            String userCommand = scanner.nextLine();
            
            switch(userCommand) {
                case "1":
                    System.out.println("Write the joke to be added:");
                    String userJoke = scanner.nextLine();
                    this.jokes.addJoke(userJoke);
                    break;
                case "2":
                    System.out.println("Drawing a joke.");
                    System.out.println(this.jokes.drawJoke());
                    break;
                case "3":
                    System.out.println("Printing the jokes.");
                    this.jokes.printJokes();
                    break;
                case "X":
                    looping = false;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + userCommand);
            }
        }
    }

    public String menu() {
        return """ 
                Commands:
                1 - add a joke
                2 - draw a joke
                3 - list jokes
                X - stop""";
    }

}
