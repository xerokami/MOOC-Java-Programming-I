import java.util.Scanner;

public class NumberOfNegativeNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int negativeCount = 0;

        while (true) {
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scan.nextLine());

            if (userNum == 0) {
                break;
            } else if (userNum < 0) {
                negativeCount++;
            }
        }
        System.out.println("Number of negative numbers: " + negativeCount);
    }
}
