import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a speed:");
        int userSpeed = Integer.valueOf(scan.nextLine());

        if (userSpeed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}