import java.util.Scanner;

public class SumOfASequenceTheSequel {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        System.out.println("First number?");
        int firstNum = Integer.valueOf(scan.nextLine());

        System.out.println("Second number?");
        int secondNum = Integer.valueOf(scan.nextLine());

        for (int i = firstNum; i <= secondNum; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}