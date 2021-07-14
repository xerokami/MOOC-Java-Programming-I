import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you want to print?");
        int userNum = Integer.valueOf(scan.nextLine());

        printFromNumberToOne(userNum);
    }

    public static void printFromNumberToOne(int number) {
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }

}