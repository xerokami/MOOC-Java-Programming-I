import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scan.nextLine());

        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scan.nextLine());

        System.out.println("Give the third number:");
        int thirdNum = Integer.valueOf(scan.nextLine());

        int sum = firstNum + secondNum + thirdNum;
        System.out.println("The sum of the numbers is " + sum);
    }
}