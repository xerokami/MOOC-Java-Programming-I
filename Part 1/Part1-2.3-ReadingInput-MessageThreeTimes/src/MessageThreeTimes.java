import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");
        String userInput = scanner.nextLine();

        System.out.println(userInput);
        System.out.println(userInput);
        System.out.println(userInput);
    }
}
