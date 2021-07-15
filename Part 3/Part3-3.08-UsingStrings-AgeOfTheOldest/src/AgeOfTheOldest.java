import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int oldest = -1;

        while (true) {
            System.out.println("Enter a string:");
            String userString = scan.nextLine();

            if (userString.isEmpty()) {
                break;
            }

            String[] split = userString.split(",");

            if (oldest < Integer.valueOf(split[1])) {
                oldest = Integer.valueOf(split[1]);
            }
        }
        System.out.println("Age of the oldest:" + oldest);
    }
}
