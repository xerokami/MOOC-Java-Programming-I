import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        Scanner scanner = new Scanner(System.in);

        boolean looping = true;
        while (looping) {
            System.out.println("First: " + firstContainer + "\n");
            System.out.println("Second: " + secondContainer + "\n");

            String userInput = scanner.nextLine();
            if (userInput.equals("quit")) {
                looping = false;
                break;
            }

            String[] userInputSplit = userInput.split(" ");
            String userCommand = userInputSplit[0];
            int amount = Integer.valueOf(userInputSplit[1]);

            switch (userCommand) {
                case "add":
                    firstContainer.add(amount);
                    break;

                case "move":
                    if (amount <= 0 || firstContainer.contains() == 0) {
                        return;
                    }
                    if (firstContainer.contains() - amount < 0) {
                        amount = firstContainer.contains();
                    }

                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                    break;

                case "remove":
                    secondContainer.remove(amount);
                    break;

                default:
                    System.out.println("Unknown command entered!");
            }
        }
    }
}
