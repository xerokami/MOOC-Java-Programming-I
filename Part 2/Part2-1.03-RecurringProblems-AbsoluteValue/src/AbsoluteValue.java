import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int userNum = Integer.valueOf(scan.nextLine());

        if (userNum < 0) {
            System.out.println(userNum * -1);
        } else {
            System.out.println(userNum);
        }
    }
}
