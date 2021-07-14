import java.util.Scanner;

public class AverageOfNumbers {
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
        double average = 1.0 * sum / count;
        System.out.println("Average of the numbers: " + average);
    }
}