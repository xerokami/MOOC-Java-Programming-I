import java.util.Scanner;

public class BooleanInput {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Write something:");
        boolean userInput = Boolean.valueOf(scan.nextLine());

        System.out.println("True or false? " + userInput);
    }
}
