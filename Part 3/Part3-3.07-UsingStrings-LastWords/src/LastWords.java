import java.util.Scanner;

public class LastWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a string:");
            String userString = scan.nextLine();

            if (userString.isEmpty()) {
                break;
            }

            String[] split = userString.split(" ");

            int last = split.length - 1;
            System.out.println(split[last]);
            System.out.println("");
        }
    }
}