import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Statistics stats = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            int userNum = Integer.valueOf(scan.nextLine());

            if (userNum == -1) {
                break;
            }

            stats.addNumber(userNum);
        }
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + stats.sumOfEven());
        System.out.println("Sum of odd numbers: " + stats.sumOfOdd());
    }
}
