import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

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

        System.out.println("From where?");
        int numStart = Integer.valueOf(scan.nextLine());

        System.out.println("To where?");
        int numEnd = Integer.valueOf(scan.nextLine());

        for (int i = numStart; i <= numEnd; i++) {
            System.out.println(numList.get(i));
        }
    }
}
