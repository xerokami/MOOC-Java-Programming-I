import java.util.Scanner;

public class CountingToHundred {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int userNum = Integer.valueOf(scan.nextLine());

        for (int i = userNum; i <= 100; i++) {
            System.out.println(i);
        }
    }
}