import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scan.nextLine());

            if (userNum == 0) {
                break;
            }
            count ++;
            sum += userNum;
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}

