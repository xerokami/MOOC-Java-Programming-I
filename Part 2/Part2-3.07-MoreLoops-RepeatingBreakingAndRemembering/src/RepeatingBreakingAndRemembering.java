import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int evens = 0;
        int odds = 0;

        while (true) {
            System.out.println("Give numbers:");
            int userNum = Integer.valueOf(scan.nextLine());

            if (userNum == -1) {
                break;
            } else if (userNum % 2 == 0) {
                evens ++;
                sum += userNum;
                count++;
            } else {
                odds ++;
                sum += userNum;
                count++;
            }
        }
        double average = 1.0 * sum / count;

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evens);
        System.out.println("Odd: " + odds);
    }
}
