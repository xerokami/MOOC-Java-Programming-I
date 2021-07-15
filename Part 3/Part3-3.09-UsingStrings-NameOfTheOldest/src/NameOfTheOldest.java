import java.util.Scanner;

public class NameOfTheOldest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int oldest = -1;
        String name = "";

        while (true) {
            System.out.println("Enter a string:");
            String userString = scan.nextLine();

            if (userString.isEmpty()) {
                break;
            }

            String[] split = userString.split(",");

            if (oldest < Integer.valueOf(split[1])) {
                oldest = Integer.valueOf(split[1]);
                name = split[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
