import java.util.Scanner;

public class AVClub {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a string:");
            String userString = scan.nextLine();

            if (userString.isEmpty()) {
                break;
            }

            String[] split = userString.split(" ");

            for (String parts: split) {
                if (parts.contains("av")) {
                    System.out.println(parts);
                }
            }
            System.out.println("");
        }
    }
}
