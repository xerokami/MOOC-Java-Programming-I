import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Enter a number (-1 to exit)");
            int userNum = Integer.valueOf(scan.nextLine());

            if (userNum == -1) {
                break;
            }

            numList.add(userNum);
        }

        for (int number: numList) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }
}
