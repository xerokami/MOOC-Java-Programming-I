import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number (-1 to exit)");
            int userNum = Integer.valueOf(scan.nextLine());

            if (userNum == -1) {
                break;
            }

            numList.add(userNum);
        }

        for (int number: numList) {
            System.out.println(number);
        }
    }
}
