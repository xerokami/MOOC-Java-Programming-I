import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scan.nextLine();

        System.out.println("Enter password:");
        String password = scan.nextLine();

        if (username.equals("alex") && password.equals("sunshine")) {
            System.out.println("You have successfully logged in!");
        } else if (username.equals("emma") && password.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
