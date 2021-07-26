import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        boolean looping = true;

        while (looping) {
            System.out.println("\n" + "First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String userCommand = scan.nextLine();

            if (userCommand.equals("quit")) {
                looping = false;
                break;
            }

            String[] parts = userCommand.split(" ");
            int amount = Integer.valueOf(parts[1]);

            switch (parts[0]) {
                case "add":
                    if (amount <= 0) {
                        continue;
                    }

                    if ((amount + firstContainer) <= 100) {
                        firstContainer += amount;
                    } else if (firstContainer != 100 && amount > firstContainer) {
                        firstContainer = 100;
                    }
                    break;

                case "move":
                    if (amount <= 0) {
                        continue;
                    }

                    if (amount <= firstContainer) {
                        secondContainer += amount;
                        firstContainer -= amount;
                    } else if (amount > 100) {
                        secondContainer = 100;
                        firstContainer = 0;
                    }
                    break;

                case "remove":
                    if (amount <= 0) {
                        continue;
                    }

                    if (amount <= secondContainer) {
                        secondContainer -= amount;
                    } else if (amount > 100) {
                        secondContainer = 0;
                    }
                    break;
            }
        }
    }
}
