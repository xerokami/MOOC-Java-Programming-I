import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int userYear = Integer.valueOf(scan.nextLine());

        if (userYear % 4 == 0) {
            if (userYear % 100 == 0) {
                if (userYear % 400 == 0) {
                    System.out.println("The year is a leap year");
                } else {
                    System.out.println("The year is not a leap year");
                }
            } else {
                System.out.println("The year is a leap year");
            }
        } else {
            System.out.println("The year is not a leap year");
        }
    }
}
