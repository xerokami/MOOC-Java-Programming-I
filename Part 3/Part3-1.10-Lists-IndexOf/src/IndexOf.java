import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

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
        System.out.println("Search for?");
        int numSearch = Integer.valueOf(scan.nextLine());

        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) == numSearch) {
                System.out.println(numSearch + " is at index " + i);
            }
        }
    }
}
