import java.util.Scanner;

public class AverageOfTwoNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scan.nextLine());

        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scan.nextLine());

        int sum = firstNum + secondNum;
        double average = 1.0 * sum / 2;
        System.out.println("The average is " + average);
    }
}

