import java.util.Scanner;

public class FirstWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a string:");
            String userString = scan.nextLine();

            if (userString.isEmpty()) {
                break;
            }

            String[] split = userString.split(" ");

            System.out.println(split[0]);
            System.out.println("");
        }
    }
}