import java.util.Scanner;

public class AreWeThereYet {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scan.nextLine());

            if (userNum == 4) {
                break;
            }
        }
    }
}