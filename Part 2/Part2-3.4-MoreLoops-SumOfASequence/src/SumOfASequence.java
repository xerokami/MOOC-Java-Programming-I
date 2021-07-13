import java.util.Scanner;

public class SumOfASequence {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        System.out.println("Last number?");
        int userNum = Integer.valueOf(scan.nextLine());

        for (int i = 1; i <= userNum; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}