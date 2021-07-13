import java.util.Scanner;

public class GradesAndPoints {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]");
        int userPoints = Integer.valueOf(scan.nextLine());

        if (userPoints < 0) {
            System.out.println("impossible!");
        } else if (userPoints < 50) {
            System.out.println("failed");
        } else if (userPoints < 60) {
            System.out.println("1");
        } else if (userPoints < 70) {
            System.out.println("2");
        } else if (userPoints < 80) {
            System.out.println("3");
        } else if (userPoints < 90) {
            System.out.println("4");
        } else if (userPoints < 101) {
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }
    }
}