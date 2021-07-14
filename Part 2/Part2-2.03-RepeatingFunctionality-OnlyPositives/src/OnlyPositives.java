import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scan.nextLine());

            if (userNum == 0) {
                break;
            } else if (userNum < 0) {
                System.out.println("Unsuitable number");
            } else {
                System.out.println(userNum * userNum);
            }
        }
    }
}
