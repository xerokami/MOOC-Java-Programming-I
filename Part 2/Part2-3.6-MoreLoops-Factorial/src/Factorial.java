import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int userNum = Integer.valueOf(scan.nextLine());
        int factorial = 1;

        for (int i = 1; i <= userNum; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }
}