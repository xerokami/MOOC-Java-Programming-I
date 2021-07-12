import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scan.nextLine());

        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scan.nextLine());

        int addition = firstNum + secondNum;
        int subtraction = firstNum - secondNum;
        int multiplication = firstNum * secondNum;
        double division = 1.0 * firstNum / secondNum;

        System.out.println(firstNum + " + " + secondNum + " = " + addition);
        System.out.println(firstNum + " - " + secondNum + " = " + subtraction);
        System.out.println(firstNum + " * " + secondNum + " = " + multiplication);
        System.out.println(firstNum + " / " + secondNum + " = " + division);
    }
}