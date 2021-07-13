import java.util.Scanner;

public class Squared {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int userNum = Integer.valueOf(scan.nextLine());
        int squared = userNum * userNum;

        System.out.println(squared);
    }
}
