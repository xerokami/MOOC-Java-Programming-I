import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String userInput = scan.nextLine();

            if (userInput.equals("end")) {
                break;
            }

            int userNum = Integer.valueOf(scan.nextLine());
            System.out.println(userNum * userNum * userNum);
        }
    }
}
