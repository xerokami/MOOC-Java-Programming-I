import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scan.nextLine());

            if (userNum == 0) {
                break;
            } else if (userNum > 0) {
                count++;
                sum += userNum;
            }
        }
        double average = 1.0 * sum / count;
        if (average == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);
        }
    }
}
