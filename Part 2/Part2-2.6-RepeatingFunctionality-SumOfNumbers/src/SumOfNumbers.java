import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scan.nextLine());

            if (userNum == 0) {
                break;
            }
            sum += userNum;
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}