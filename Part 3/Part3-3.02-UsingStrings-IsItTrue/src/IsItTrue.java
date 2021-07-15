import java.util.Scanner;

public class IsItTrue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a word:");
        String userInput = scan.nextLine();

        if (userInput.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
