import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scan.nextLine());

        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scan.nextLine());

        System.out.println("Give the third number:");
        int thirdNum = Integer.valueOf(scan.nextLine());

        int sum = firstNum + secondNum + thirdNum;
        double average = 1.0 * sum / 3;
        System.out.println("The average is " + average);
    }
}