import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int userNum1 = Integer.valueOf(scan.nextLine());
        int userNum2 = Integer.valueOf(scan.nextLine());
        int sum = userNum1 + userNum2;
        double squareRoot = Math.sqrt(sum);

        System.out.println(squareRoot);
    }
}
