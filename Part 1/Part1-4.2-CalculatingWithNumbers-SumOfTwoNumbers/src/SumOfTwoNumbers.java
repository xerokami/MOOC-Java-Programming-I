import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scan.nextLine());

        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scan.nextLine());

        int sum = firstNum + secondNum;
        System.out.println("The sum of the numbers is " + sum);
    }
}
