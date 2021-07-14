import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you want to print?");
        int userNum = Integer.valueOf(scan.nextLine());

        printUntilNumber(userNum);
    }

    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

}
