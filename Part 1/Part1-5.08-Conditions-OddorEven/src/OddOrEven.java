import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int userNum = Integer.valueOf(scan.nextLine());

        if (userNum % 2 == 0) {
            System.out.println("Number " + userNum + " is even.");
        } else {
            System.out.println("Number " + userNum + " is odd.");
        }
    }
}