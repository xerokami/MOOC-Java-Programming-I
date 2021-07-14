import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        int userInput = Integer.valueOf(scan.nextLine());

        System.out.println("You gave the number " + userInput);
    }
}
